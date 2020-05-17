package typingsSlinky.pdfFillForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pdfFillForm.mod.PdfOptions
  - typingsSlinky.pdfFillForm.mod.ImgPdfOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: ImgPdfOptions): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: PdfOptions): Options = value.asInstanceOf[Options]
}

