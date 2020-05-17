package typingsSlinky.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__iconv")
@js.native
object iconv extends js.Object {
  def decode(charset: String, data: typingsSlinky.fibjs.ClassBuffer): String = js.native
  def encode(charset: String, data: String): typingsSlinky.fibjs.ClassBuffer = js.native
  def isEncoding(charset: String): Boolean = js.native
}

