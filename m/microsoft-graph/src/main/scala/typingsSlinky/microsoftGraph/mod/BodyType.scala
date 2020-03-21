package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.text
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.html
*/
trait BodyType extends js.Object

object BodyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def html: typingsSlinky.microsoftGraph.microsoftGraphStrings.html = this.cast("html")
  @scala.inline
  def text: typingsSlinky.microsoftGraph.microsoftGraphStrings.text = this.cast("text")
}

