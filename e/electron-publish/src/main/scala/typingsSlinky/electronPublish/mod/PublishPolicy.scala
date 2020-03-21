package typingsSlinky.electronPublish.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.electronPublish.electronPublishStrings.onTag
  - typingsSlinky.electronPublish.electronPublishStrings.onTagOrDraft
  - typingsSlinky.electronPublish.electronPublishStrings.always
  - typingsSlinky.electronPublish.electronPublishStrings.never
*/
trait PublishPolicy extends js.Object

object PublishPolicy {
  @scala.inline
  def always: typingsSlinky.electronPublish.electronPublishStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typingsSlinky.electronPublish.electronPublishStrings.never = this.cast("never")
  @scala.inline
  def onTag: typingsSlinky.electronPublish.electronPublishStrings.onTag = this.cast("onTag")
  @scala.inline
  def onTagOrDraft: typingsSlinky.electronPublish.electronPublishStrings.onTagOrDraft = this.cast("onTagOrDraft")
}

