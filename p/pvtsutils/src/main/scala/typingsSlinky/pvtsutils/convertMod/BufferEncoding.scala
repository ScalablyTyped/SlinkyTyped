package typingsSlinky.pvtsutils.convertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pvtsutils.pvtsutilsStrings.utf8
  - typingsSlinky.pvtsutils.pvtsutilsStrings.binary
  - typingsSlinky.pvtsutils.pvtsutilsStrings.base64
  - typingsSlinky.pvtsutils.pvtsutilsStrings.base64url
  - typingsSlinky.pvtsutils.pvtsutilsStrings.hex
  - java.lang.String
*/
trait BufferEncoding extends js.Object

object BufferEncoding {
  @scala.inline
  def utf8: typingsSlinky.pvtsutils.pvtsutilsStrings.utf8 = "utf8".asInstanceOf[typingsSlinky.pvtsutils.pvtsutilsStrings.utf8]
  @scala.inline
  def binary: typingsSlinky.pvtsutils.pvtsutilsStrings.binary = "binary".asInstanceOf[typingsSlinky.pvtsutils.pvtsutilsStrings.binary]
  @scala.inline
  def base64: typingsSlinky.pvtsutils.pvtsutilsStrings.base64 = "base64".asInstanceOf[typingsSlinky.pvtsutils.pvtsutilsStrings.base64]
  @scala.inline
  def base64url: typingsSlinky.pvtsutils.pvtsutilsStrings.base64url = "base64url".asInstanceOf[typingsSlinky.pvtsutils.pvtsutilsStrings.base64url]
  @scala.inline
  def hex: typingsSlinky.pvtsutils.pvtsutilsStrings.hex = "hex".asInstanceOf[typingsSlinky.pvtsutils.pvtsutilsStrings.hex]
  @scala.inline
  implicit def apply(value: String): BufferEncoding = value.asInstanceOf[BufferEncoding]
}

