package typingsSlinky.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFormMod {
  import typingsSlinky.std.Pick

  type FormErrors[FormData, T] = typingsSlinky.reduxDashForm.reduxDashFormStrings.FormErrors with js.Any with ErrorOther[T]
  type FormWarnings[FormData, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof FormData ]:? react.react.ReactElement | string | redux-form.redux-form.WarningOther<T>}
    */ typingsSlinky.reduxDashForm.reduxDashFormStrings.FormWarnings with js.Any
  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
