package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudRepoSourceContext extends js.Object {
  /** An alias, which may be a branch or tag. */
  var aliasContext: js.UndefOr[AliasContext] = js.native
  /** The name of an alias (branch, tag, etc.). */
  var aliasName: js.UndefOr[String] = js.native
  /** The ID of the repo. */
  var repoId: js.UndefOr[RepoId] = js.native
  /** A revision ID. */
  var revisionId: js.UndefOr[String] = js.native
}

object CloudRepoSourceContext {
  @scala.inline
  def apply(): CloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudRepoSourceContext]
  }
  @scala.inline
  implicit class CloudRepoSourceContextOps[Self <: CloudRepoSourceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasContext(value: AliasContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasContext")(js.undefined)
        ret
    }
    @scala.inline
    def withAliasName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasName")(js.undefined)
        ret
    }
    @scala.inline
    def withRepoId(value: RepoId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoId")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(js.undefined)
        ret
    }
  }
  
}

