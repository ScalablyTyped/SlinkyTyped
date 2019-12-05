package typingsSlinky.reactDashDynamicDashNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDynamicDashNumberMod {
  import org.scalajs.dom.raw.HTMLInputElement
  import slinky.core.ReactComponentClass
  import typingsSlinky.react.reactMod.DetailedHTMLProps
  import typingsSlinky.react.reactMod.InputHTMLAttributes
  import typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.onChange
  import typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.placeholder
  import typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.ref
  import typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.value
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type BaseInputProps = Partial[
    Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      ref | value | onChange | placeholder
    ]
  ]
  type DynamicNumber = ReactComponentClass[DynamicNumberProps]
  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
