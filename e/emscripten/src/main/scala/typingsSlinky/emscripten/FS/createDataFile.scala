package typingsSlinky.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.createDataFile")
@js.native
object createDataFile extends js.Object {
  def apply(
    parent: String,
    name: String,
    data: js.typedarray.ArrayBufferView,
    canRead: Boolean,
    canWrite: Boolean,
    canOwn: Boolean
  ): FSNode = js.native
  def apply(
    parent: FSNode,
    name: String,
    data: js.typedarray.ArrayBufferView,
    canRead: Boolean,
    canWrite: Boolean,
    canOwn: Boolean
  ): FSNode = js.native
}

