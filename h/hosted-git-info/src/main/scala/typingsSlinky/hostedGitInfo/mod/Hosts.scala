package typingsSlinky.hostedGitInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.github
  - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.bitbucket
  - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gitlab
  - typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gist
*/
trait Hosts extends js.Object

object Hosts {
  @scala.inline
  def bitbucket: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.bitbucket = this.cast("bitbucket")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gist: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gist = this.cast("gist")
  @scala.inline
  def github: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.github = this.cast("github")
  @scala.inline
  def gitlab: typingsSlinky.hostedGitInfo.hostedGitInfoStrings.gitlab = this.cast("gitlab")
}

