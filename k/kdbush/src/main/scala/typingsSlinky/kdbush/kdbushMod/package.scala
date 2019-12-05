package typingsSlinky.kdbush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kdbushMod {
  import typingsSlinky.std.ArrayConstructor
  import typingsSlinky.std.Float32ArrayConstructor
  import typingsSlinky.std.Float64ArrayConstructor
  import typingsSlinky.std.Int16ArrayConstructor
  import typingsSlinky.std.Int32ArrayConstructor
  import typingsSlinky.std.Int8ArrayConstructor

  type ArrayType = Int8ArrayConstructor | Int16ArrayConstructor | Int32ArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor | ArrayConstructor
  type Get[T] = js.Function1[/* point */ T, Double]
  type Points = js.Array[js.Array[Double]]
}
