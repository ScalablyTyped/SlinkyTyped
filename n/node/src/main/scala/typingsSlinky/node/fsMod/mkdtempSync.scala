package typingsSlinky.node.fsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "mkdtempSync")
@js.native
object mkdtempSync extends js.Object {
  def apply(prefix: String): String = js.native
  def apply(prefix: String, options: String): String | Buffer = js.native
  def apply(prefix: String, options: BufferEncoding): String = js.native
  def apply(prefix: String, options: BaseEncodingOptions): String = js.native
  def apply(prefix: String, options: BufferEncodingOption): Buffer = js.native
}

