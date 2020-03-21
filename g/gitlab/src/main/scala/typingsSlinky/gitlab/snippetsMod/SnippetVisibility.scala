package typingsSlinky.gitlab.snippetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gitlab.gitlabStrings.`private`
  - typingsSlinky.gitlab.gitlabStrings.public
  - typingsSlinky.gitlab.gitlabStrings.internal
*/
trait SnippetVisibility extends js.Object

object SnippetVisibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def internal: typingsSlinky.gitlab.gitlabStrings.internal = this.cast("internal")
  @scala.inline
  def `private`: typingsSlinky.gitlab.gitlabStrings.`private` = this.cast("private")
  @scala.inline
  def public: typingsSlinky.gitlab.gitlabStrings.public = this.cast("public")
}

