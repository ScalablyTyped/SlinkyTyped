package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Selects a repo using a Google Cloud Platform project ID (e.g.,
  * winged-cargo-31) and a repo name within that project.
  */
@js.native
trait SchemaProjectRepoId extends js.Object {
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The name of the repo. Leave empty for the default repo.
    */
  var repoName: js.UndefOr[String] = js.native
}

object SchemaProjectRepoId {
  @scala.inline
  def apply(): SchemaProjectRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectRepoId]
  }
  @scala.inline
  implicit class SchemaProjectRepoIdOps[Self <: SchemaProjectRepoId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepoName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoName")(js.undefined)
        ret
    }
  }
  
}

