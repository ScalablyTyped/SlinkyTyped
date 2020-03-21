package typingsSlinky.kdbush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayType = typingsSlinky.std.Int8ArrayConstructor | typingsSlinky.std.Int16ArrayConstructor | typingsSlinky.std.Int32ArrayConstructor | typingsSlinky.std.Float32ArrayConstructor | typingsSlinky.std.Float64ArrayConstructor | typingsSlinky.std.ArrayConstructor
  type Get[T] = js.Function1[/* point */ T, scala.Double]
  type Points = js.Array[js.Array[scala.Double]]
}
