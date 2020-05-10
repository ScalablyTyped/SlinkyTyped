package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SourceContext referring to a Gerrit project.
  */
@js.native
trait SchemaGerritSourceContext extends js.Object {
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaAliasContext] = js.native
  /**
    * The full project name within the host. Projects may be nested, so
    * &quot;project/subproject&quot; is a valid project name. The &quot;repo
    * name&quot; is the hostURI/project.
    */
  var gerritProject: js.UndefOr[String] = js.native
  /**
    * The URI of a running Gerrit instance.
    */
  var hostUri: js.UndefOr[String] = js.native
  /**
    * A revision (commit) ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}

object SchemaGerritSourceContext {
  @scala.inline
  def apply(): SchemaGerritSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGerritSourceContext]
  }
  @scala.inline
  implicit class SchemaGerritSourceContextOps[Self <: SchemaGerritSourceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasContext(value: SchemaAliasContext): Self = {
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

