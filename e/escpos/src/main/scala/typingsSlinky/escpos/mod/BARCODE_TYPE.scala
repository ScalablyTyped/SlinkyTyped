package typingsSlinky.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.escpos.escposStrings.UPC_A
  - typingsSlinky.escpos.escposStrings.UPC_E
  - typingsSlinky.escpos.escposStrings.EAN13
  - typingsSlinky.escpos.escposStrings.EAN8
  - typingsSlinky.escpos.escposStrings.CODE39
  - typingsSlinky.escpos.escposStrings.ITF
  - typingsSlinky.escpos.escposStrings.NW7
  - typingsSlinky.escpos.escposStrings.CODE93
  - typingsSlinky.escpos.escposStrings.CODE128
*/
trait BARCODE_TYPE extends js.Object

object BARCODE_TYPE {
  @scala.inline
  def CODE128: typingsSlinky.escpos.escposStrings.CODE128 = this.cast("CODE128")
  @scala.inline
  def CODE39: typingsSlinky.escpos.escposStrings.CODE39 = this.cast("CODE39")
  @scala.inline
  def CODE93: typingsSlinky.escpos.escposStrings.CODE93 = this.cast("CODE93")
  @scala.inline
  def EAN13: typingsSlinky.escpos.escposStrings.EAN13 = this.cast("EAN13")
  @scala.inline
  def EAN8: typingsSlinky.escpos.escposStrings.EAN8 = this.cast("EAN8")
  @scala.inline
  def ITF: typingsSlinky.escpos.escposStrings.ITF = this.cast("ITF")
  @scala.inline
  def NW7: typingsSlinky.escpos.escposStrings.NW7 = this.cast("NW7")
  @scala.inline
  def UPC_A: typingsSlinky.escpos.escposStrings.UPC_A = this.cast("UPC_A")
  @scala.inline
  def UPC_E: typingsSlinky.escpos.escposStrings.UPC_E = this.cast("UPC_E")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

