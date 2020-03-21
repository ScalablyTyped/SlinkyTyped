package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notPublished
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.processing
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.published
*/
trait MobileAppPublishingState extends js.Object

object MobileAppPublishingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notPublished: typingsSlinky.microsoftGraph.microsoftGraphStrings.notPublished = this.cast("notPublished")
  @scala.inline
  def processing: typingsSlinky.microsoftGraph.microsoftGraphStrings.processing = this.cast("processing")
  @scala.inline
  def published: typingsSlinky.microsoftGraph.microsoftGraphStrings.published = this.cast("published")
}

