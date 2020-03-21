package typingsSlinky.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.carbone.carboneStrings.document
  - typingsSlinky.carbone.carboneStrings.web
  - typingsSlinky.carbone.carboneStrings.graphics
  - typingsSlinky.carbone.carboneStrings.spreadsheet
  - typingsSlinky.carbone.carboneStrings.presentation
*/
trait DocumentType extends js.Object

object DocumentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typingsSlinky.carbone.carboneStrings.document = this.cast("document")
  @scala.inline
  def graphics: typingsSlinky.carbone.carboneStrings.graphics = this.cast("graphics")
  @scala.inline
  def presentation: typingsSlinky.carbone.carboneStrings.presentation = this.cast("presentation")
  @scala.inline
  def spreadsheet: typingsSlinky.carbone.carboneStrings.spreadsheet = this.cast("spreadsheet")
  @scala.inline
  def web: typingsSlinky.carbone.carboneStrings.web = this.cast("web")
}

