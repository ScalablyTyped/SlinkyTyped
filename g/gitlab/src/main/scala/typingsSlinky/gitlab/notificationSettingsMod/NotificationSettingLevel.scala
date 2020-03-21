package typingsSlinky.gitlab.notificationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gitlab.gitlabStrings.disabled
  - typingsSlinky.gitlab.gitlabStrings.participating
  - typingsSlinky.gitlab.gitlabStrings.watch
  - typingsSlinky.gitlab.gitlabStrings.global
  - typingsSlinky.gitlab.gitlabStrings.mention
  - typingsSlinky.gitlab.gitlabStrings.custom
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

