package typingsSlinky.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.escpos.escposStrings.LF
  - typingsSlinky.escpos.escposStrings.GLF
  - typingsSlinky.escpos.escposStrings.FF
  - typingsSlinky.escpos.escposStrings.CR
  - typingsSlinky.escpos.escposStrings.HT
  - typingsSlinky.escpos.escposStrings.VT
*/
trait FEED_CONTROL_TYPE extends js.Object

object FEED_CONTROL_TYPE {
  @scala.inline
  def CR: typingsSlinky.escpos.escposStrings.CR = this.cast("CR")
  @scala.inline
  def FF: typingsSlinky.escpos.escposStrings.FF = this.cast("FF")
  @scala.inline
  def GLF: typingsSlinky.escpos.escposStrings.GLF = this.cast("GLF")
  @scala.inline
  def HT: typingsSlinky.escpos.escposStrings.HT = this.cast("HT")
  @scala.inline
  def LF: typingsSlinky.escpos.escposStrings.LF = this.cast("LF")
  @scala.inline
  def VT: typingsSlinky.escpos.escposStrings.VT = this.cast("VT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

