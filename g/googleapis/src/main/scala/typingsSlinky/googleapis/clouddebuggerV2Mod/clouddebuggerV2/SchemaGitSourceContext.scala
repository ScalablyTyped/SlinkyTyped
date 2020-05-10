package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GitSourceContext denotes a particular revision in a third party Git
  * repository (e.g. GitHub).
  */
@js.native
trait SchemaGitSourceContext extends js.Object {
  /**
    * Git commit hash. required.
    */
  var revisionId: js.UndefOr[String] = js.native
  /**
    * Git repository URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGitSourceContext {
  @scala.inline
  def apply(): SchemaGitSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitSourceContext]
  }
  @scala.inline
  implicit class SchemaGitSourceContextOps[Self <: SchemaGitSourceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

