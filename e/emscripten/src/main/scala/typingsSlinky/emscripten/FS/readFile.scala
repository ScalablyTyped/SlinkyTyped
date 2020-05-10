package typingsSlinky.emscripten.FS

import typingsSlinky.emscripten.AnonEncoding
import typingsSlinky.emscripten.AnonFlags
import typingsSlinky.emscripten.AnonFlagsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): js.typedarray.Uint8Array = js.native
  def apply(path: String, opts: AnonEncoding): js.typedarray.Uint8Array = js.native
  def apply(path: String, opts: AnonFlags): String = js.native
  def apply(path: String, opts: AnonFlagsString): js.typedarray.Uint8Array = js.native
}

