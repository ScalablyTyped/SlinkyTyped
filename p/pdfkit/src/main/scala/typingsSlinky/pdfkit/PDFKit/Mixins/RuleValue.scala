package typingsSlinky.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The winding / filling rule accepted by PDFKit:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pdfkit.pdfkitStrings.`even-odd`
  - typingsSlinky.pdfkit.pdfkitStrings.evenodd
  - typingsSlinky.pdfkit.pdfkitStrings.`non-zero`
  - typingsSlinky.pdfkit.pdfkitStrings.nonzero
*/
trait RuleValue extends js.Object

object RuleValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `even-odd`: typingsSlinky.pdfkit.pdfkitStrings.`even-odd` = this.cast("even-odd")
  @scala.inline
  def evenodd: typingsSlinky.pdfkit.pdfkitStrings.evenodd = this.cast("evenodd")
  @scala.inline
  def `non-zero`: typingsSlinky.pdfkit.pdfkitStrings.`non-zero` = this.cast("non-zero")
  @scala.inline
  def nonzero: typingsSlinky.pdfkit.pdfkitStrings.nonzero = this.cast("nonzero")
}

