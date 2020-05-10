package typingsSlinky.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handsontable = typingsSlinky.handsontable.mod._Handsontable.Core
  /**
    * @internal
    * Omit properties K from T
    */
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  type default = typingsSlinky.handsontable.mod.default_
}
