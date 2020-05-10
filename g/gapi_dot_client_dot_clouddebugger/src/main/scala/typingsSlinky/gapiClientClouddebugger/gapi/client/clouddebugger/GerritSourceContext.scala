package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GerritSourceContext extends js.Object {
  /** An alias, which may be a branch or tag. */
  var aliasContext: js.UndefOr[AliasContext] = js.native
  /** The name of an alias (branch, tag, etc.). */
  var aliasName: js.UndefOr[String] = js.native
  /**
    * The full project name within the host. Projects may be nested, so
    * "project/subproject" is a valid project name.
    * The "repo name" is hostURI/project.
    */
  var gerritProject: js.UndefOr[String] = js.native
  /** The URI of a running Gerrit instance. */
  var hostUri: js.UndefOr[String] = js.native
  /** A revision (commit) ID. */
  var revisionId: js.UndefOr[String] = js.native
}

object GerritSourceContext {
  @scala.inline
  def apply(): GerritSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GerritSourceContext]
  }
  @scala.inline
  implicit class GerritSourceContextOps[Self <: GerritSourceContext] (val x: Self) extends AnyVal {
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
    def withGerritProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gerritProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGerritProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gerritProject")(js.undefined)
        ret
    }
    @scala.inline
    def withHostUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUri")(js.undefined)
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

