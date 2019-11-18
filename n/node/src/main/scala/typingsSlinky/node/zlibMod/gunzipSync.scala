package typingsSlinky.node.zlibMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", "gunzipSync")
@js.native
object gunzipSync extends js.Object {
  def apply(buf: InputType): Buffer = js.native
  def apply(buf: InputType, options: ZlibOptions): Buffer = js.native
}

