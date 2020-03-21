package typingsSlinky.gitlab.userImpersonationTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gitlab.gitlabStrings.api
  - typingsSlinky.gitlab.gitlabStrings.read_user
*/
trait ImpersonationTokenScope extends js.Object

object ImpersonationTokenScope {
  @scala.inline
  def api: typingsSlinky.gitlab.gitlabStrings.api = this.cast("api")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def read_user: typingsSlinky.gitlab.gitlabStrings.read_user = this.cast("read_user")
}

