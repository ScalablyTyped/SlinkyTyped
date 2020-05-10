package typingsSlinky.emscripten.FS

import typingsSlinky.emscripten.AnonFlagsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.writeFile")
@js.native
object writeFile extends js.Object {
  def apply(path: String, data: String): Unit = js.native
  def apply(path: String, data: String, opts: AnonFlagsString): Unit = js.native
  def apply(path: String, data: js.typedarray.ArrayBufferView): Unit = js.native
  def apply(path: String, data: js.typedarray.ArrayBufferView, opts: AnonFlagsString): Unit = js.native
}

