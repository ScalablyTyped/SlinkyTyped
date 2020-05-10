package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the source in a Google Cloud Source Repository.
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
    * Directory, relative to the source root, in which to run the build.  This
    * must be a relative path. If a step&#39;s `dir` is specified and is an
    * absolute path, this value is ignored for that step&#39;s execution.
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * ID of the project that owns the Cloud Source Repository. If omitted, the
    * project ID requesting the build is assumed.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Name of the Cloud Source Repository. If omitted, the name
    * &quot;default&quot; is assumed.
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
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
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

