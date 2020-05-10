package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RepoSource describes the location of the source in a Google Cloud Source
  * Repository.
  */
@js.native
trait SchemaRepoSource extends js.Object {
  /**
    * Name of the branch to build.
    */
  var branchName: js.UndefOr[String] = js.native
  /**
    * Explicit commit SHA to build.
    */
  var commitSha: js.UndefOr[String] = js.native
  /**
    * ID of the project that owns the repo.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Name of the repo.
    */
  var repoName: js.UndefOr[String] = js.native
  /**
    * Name of the tag to build.
    */
  var tagName: js.UndefOr[String] = js.native
}

object SchemaRepoSource {
  @scala.inline
  def apply(): SchemaRepoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepoSource]
  }
  @scala.inline
  implicit class SchemaRepoSourceOps[Self <: SchemaRepoSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranchName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitSha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitSha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitSha")(js.undefined)
        ret
    }
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
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
  }
  
}

