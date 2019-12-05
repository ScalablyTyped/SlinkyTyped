package typingsSlinky.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.mmap")
@js.native
object mmap extends js.Object {
  def apply(
    stream: FSStream,
    buffer: scala.scalajs.js.typedarray.ArrayBufferView,
    offset: Double,
    length: Double,
    position: Double,
    prot: Double,
    flags: Double
  ): js.Any = js.native
}

