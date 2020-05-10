package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebhookInput extends js.Object {
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.   It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.native
  /**
    *  An array of arrays of WebhookFilter objects used to determine which webhooks are triggered. At least one WebhookFilter in the array must specify EVENT as its type.   For a build to be triggered, at least one filter group in the filterGroups array must pass. For a filter group to pass, each of its filters must pass. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.native
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName = js.native
}

object CreateWebhookInput {
  @scala.inline
  def apply(projectName: ProjectName): CreateWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebhookInput]
  }
  @scala.inline
  implicit class CreateWebhookInputOps[Self <: CreateWebhookInput] (val x: Self) extends AnyVal {
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
  }
  
}

