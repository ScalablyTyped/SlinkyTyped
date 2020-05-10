package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWebhookInput extends js.Object {
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.   It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.native
  /**
    *  An array of arrays of WebhookFilter objects used to determine if a webhook event can trigger a build. A filter group must contain at least one EVENT WebhookFilter. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.native
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName = js.native
  /**
    *  A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you use Bitbucket for your repository, rotateSecret is ignored. 
    */
  var rotateSecret: js.UndefOr[Boolean] = js.native
}

object UpdateWebhookInput {
  @scala.inline
  def apply(projectName: ProjectName): UpdateWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookInput]
  }
  @scala.inline
  implicit class UpdateWebhookInputOps[Self <: UpdateWebhookInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectName(value: ProjectName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranchFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterGroups(value: FilterGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateSecret(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateSecret")(js.undefined)
        ret
    }
  }
  
}

