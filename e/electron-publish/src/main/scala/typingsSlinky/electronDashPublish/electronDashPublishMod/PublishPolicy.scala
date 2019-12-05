package typingsSlinky.electronDashPublish.electronDashPublishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.electronDashPublish.electronDashPublishStrings.onTag
  - typings.electronDashPublish.electronDashPublishStrings.onTagOrDraft
  - typings.electronDashPublish.electronDashPublishStrings.always
  - typings.electronDashPublish.electronDashPublishStrings.never
*/
trait PublishPolicy extends js.Object

object PublishPolicy {
  @scala.inline
  def always: typingsSlinky.electronDashPublish.electronDashPublishStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typingsSlinky.electronDashPublish.electronDashPublishStrings.never = this.cast("never")
  @scala.inline
  def onTag: typingsSlinky.electronDashPublish.electronDashPublishStrings.onTag = this.cast("onTag")
  @scala.inline
  def onTagOrDraft: typingsSlinky.electronDashPublish.electronDashPublishStrings.onTagOrDraft = this.cast("onTagOrDraft")
}

