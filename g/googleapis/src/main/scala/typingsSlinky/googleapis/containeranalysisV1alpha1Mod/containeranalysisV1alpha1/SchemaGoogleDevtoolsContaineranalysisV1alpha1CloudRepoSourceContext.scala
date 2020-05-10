package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
  * Source Repo.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext extends js.Object {
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext] = js.native
  /**
    * The ID of the repo.
    */
  var repoId: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId] = js.native
  /**
    * A revision ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextOps[Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasContext(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext): Self = {
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
    def withRepoId(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId): Self = {
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

