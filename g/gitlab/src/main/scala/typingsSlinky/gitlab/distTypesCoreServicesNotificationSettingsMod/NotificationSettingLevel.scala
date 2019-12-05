package typingsSlinky.gitlab.distTypesCoreServicesNotificationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gitlab.gitlabStrings.disabled
  - typings.gitlab.gitlabStrings.participating
  - typings.gitlab.gitlabStrings.watch
  - typings.gitlab.gitlabStrings.global
  - typings.gitlab.gitlabStrings.mention
  - typings.gitlab.gitlabStrings.custom
*/
trait NotificationSettingLevel extends js.Object

object NotificationSettingLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def custom: typingsSlinky.gitlab.gitlabStrings.custom = this.cast("custom")
  @scala.inline
  def disabled: typingsSlinky.gitlab.gitlabStrings.disabled = this.cast("disabled")
  @scala.inline
  def global: typingsSlinky.gitlab.gitlabStrings.global = this.cast("global")
  @scala.inline
  def mention: typingsSlinky.gitlab.gitlabStrings.mention = this.cast("mention")
  @scala.inline
  def participating: typingsSlinky.gitlab.gitlabStrings.participating = this.cast("participating")
  @scala.inline
  def watch: typingsSlinky.gitlab.gitlabStrings.watch = this.cast("watch")
}

