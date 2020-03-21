package typingsSlinky.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lzmaNative.lzmaNativeStrings.CHECK_CRC32
  - typingsSlinky.lzmaNative.lzmaNativeStrings.CHECK_CRC64
  - typingsSlinky.lzmaNative.lzmaNativeStrings.CHECK_NONE
  - typingsSlinky.lzmaNative.lzmaNativeStrings.CHECK_SHA256
*/
trait Check extends js.Object

object Check {
  @scala.inline
  def CHECK_CRC32: typingsSlinky.lzmaNative.lzmaNativeStrings.CHECK_CRC32 = this.cast("CHECK_CRC32")
  @scala.inline
  def CHECK_CRC64: typingsSlinky.lzmaNative.lzmaNativeStrings.CHECK_CRC64 = this.cast("CHECK_CRC64")
  @scala.inline
  def CHECK_NONE: typingsSlinky.lzmaNative.lzmaNativeStrings.CHECK_NONE = this.cast("CHECK_NONE")
  @scala.inline
  def CHECK_SHA256: typingsSlinky.lzmaNative.lzmaNativeStrings.CHECK_SHA256 = this.cast("CHECK_SHA256")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

