package typingsSlinky.grammarkdown.typedObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeObject[THint /* <: TypeHint */, T] extends js.Object {
  var size: Double = js.native
  def apply(): T = js.native
  def apply(buffer: js.typedarray.ArrayBuffer): T = js.native
  def apply(buffer: js.typedarray.ArrayBuffer, byteOffset: Double): T = js.native
  def apply(value: js.Any): T = js.native
  def arrayType(length: Double): TypeObject[THint, FixedSizeArray[THint, T]] = js.native
}

