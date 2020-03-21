package typingsSlinky.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.markdownPdf.markdownPdfStrings.portait
  - typingsSlinky.markdownPdf.markdownPdfStrings.landscape
*/
trait PaperOrientation extends js.Object

object PaperOrientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def landscape: typingsSlinky.markdownPdf.markdownPdfStrings.landscape = this.cast("landscape")
  @scala.inline
  def portait: typingsSlinky.markdownPdf.markdownPdfStrings.portait = this.cast("portait")
}

