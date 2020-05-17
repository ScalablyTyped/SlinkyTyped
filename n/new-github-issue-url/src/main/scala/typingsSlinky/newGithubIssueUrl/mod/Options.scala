package typingsSlinky.newGithubIssueUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	You are required to either specify the `repoUrl` option or both the `user` and `repo` options.
	*/
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.newGithubIssueUrl.mod.RepoUrlOptions
  - typingsSlinky.newGithubIssueUrl.mod.UserAndRepoOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: RepoUrlOptions): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: UserAndRepoOptions): Options = value.asInstanceOf[Options]
}

