package typingsSlinky.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lzmaNative.lzmaNativeStrings.easyEncoder
  - typingsSlinky.lzmaNative.lzmaNativeStrings.aloneDecoder
  - typingsSlinky.lzmaNative.lzmaNativeStrings.rawEncoder
  - typingsSlinky.lzmaNative.lzmaNativeStrings.autoDecoder
  - typingsSlinky.lzmaNative.lzmaNativeStrings.aloneEncoder
  - typingsSlinky.lzmaNative.lzmaNativeStrings.streamEncoder
  - typingsSlinky.lzmaNative.lzmaNativeStrings.streamDecoder
*/
trait Coders extends js.Object

object Coders {
  @scala.inline
  def aloneDecoder: typingsSlinky.lzmaNative.lzmaNativeStrings.aloneDecoder = this.cast("aloneDecoder")
  @scala.inline
  def aloneEncoder: typingsSlinky.lzmaNative.lzmaNativeStrings.aloneEncoder = this.cast("aloneEncoder")
  @scala.inline
  def autoDecoder: typingsSlinky.lzmaNative.lzmaNativeStrings.autoDecoder = this.cast("autoDecoder")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def easyEncoder: typingsSlinky.lzmaNative.lzmaNativeStrings.easyEncoder = this.cast("easyEncoder")
  @scala.inline
  def rawEncoder: typingsSlinky.lzmaNative.lzmaNativeStrings.rawEncoder = this.cast("rawEncoder")
  @scala.inline
  def streamDecoder: typingsSlinky.lzmaNative.lzmaNativeStrings.streamDecoder = this.cast("streamDecoder")
  @scala.inline
  def streamEncoder: typingsSlinky.lzmaNative.lzmaNativeStrings.streamEncoder = this.cast("streamEncoder")
}

