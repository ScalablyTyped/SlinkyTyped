package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PullRequestFilter contains filter properties for matching GitHub Pull
  * Requests.
  */
@js.native
trait SchemaPullRequestFilter extends js.Object {
  /**
    * Regex of branches to match.  The syntax of the regular expressions
    * accepted is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String] = js.native
  /**
    * Whether to block builds on a &quot;/gcbrun&quot; comment from a
    * repository owner or collaborator.
    */
  var commentControl: js.UndefOr[String] = js.native
}

object SchemaPullRequestFilter {
  @scala.inline
  def apply(): SchemaPullRequestFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullRequestFilter]
  }
  @scala.inline
  implicit class SchemaPullRequestFilterOps[Self <: SchemaPullRequestFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentControl")(js.undefined)
        ret
    }
  }
  
}

