package typingsSlinky.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.write")
@js.native
object write extends js.Object {
  def apply(stream: FSStream, buffer: js.typedarray.ArrayBufferView, offset: Double, length: Double): Double = js.native
  def apply(
    stream: FSStream,
    buffer: js.typedarray.ArrayBufferView,
    offset: Double,
    length: Double,
    position: Double
  ): Double = js.native
  def apply(
    stream: FSStream,
    buffer: js.typedarray.ArrayBufferView,
    offset: Double,
    length: Double,
    position: Double,
    canOwn: Boolean
  ): Double = js.native
}

