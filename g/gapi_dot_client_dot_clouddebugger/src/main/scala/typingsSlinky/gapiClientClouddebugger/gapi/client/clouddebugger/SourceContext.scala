package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceContext extends js.Object {
  /** A SourceContext referring to a revision in a cloud repo. */
  var cloudRepo: js.UndefOr[CloudRepoSourceContext] = js.native
  /** A SourceContext referring to a snapshot in a cloud workspace. */
  var cloudWorkspace: js.UndefOr[CloudWorkspaceSourceContext] = js.native
  /** A SourceContext referring to a Gerrit project. */
  var gerrit: js.UndefOr[GerritSourceContext] = js.native
  /** A SourceContext referring to any third party Git repo (e.g. GitHub). */
  var git: js.UndefOr[GitSourceContext] = js.native
}

object SourceContext {
  @scala.inline
  def apply(): SourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceContext]
  }
  @scala.inline
  implicit class SourceContextOps[Self <: SourceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudRepo(value: CloudRepoSourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudRepo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudRepo")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWorkspace(value: CloudWorkspaceSourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWorkspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWorkspace")(js.undefined)
        ret
    }
    @scala.inline
    def withGerrit(value: GerritSourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gerrit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGerrit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gerrit")(js.undefined)
        ret
    }
    @scala.inline
    def withGit(value: GitSourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(js.undefined)
        ret
    }
  }
  
}

