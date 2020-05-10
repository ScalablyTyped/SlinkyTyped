package typingsSlinky.gitRevisionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var branch: js.UndefOr[Boolean] = js.native
  var branchCommand: js.UndefOr[String] = js.native
  var commithashCommand: js.UndefOr[String] = js.native
  var gitWorkTree: js.UndefOr[String] = js.native
  var lightweightTags: js.UndefOr[Boolean] = js.native
  var versionCommand: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranch(value: Boolean): Self = {
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
    def withBranchCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranchCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withCommithashCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commithashCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommithashCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commithashCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withGitWorkTree(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitWorkTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitWorkTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitWorkTree")(js.undefined)
        ret
    }
    @scala.inline
    def withLightweightTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightweightTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightweightTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightweightTags")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCommand")(js.undefined)
        ret
    }
  }
  
}

