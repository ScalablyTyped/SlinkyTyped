package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentGroupsOutput extends js.Object {
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * A list of deployment group names.
    */
  var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.native
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment groups call to return the next set of deployment groups in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentGroupsOutput {
  @scala.inline
  def apply(): ListDeploymentGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentGroupsOutput]
  }
  @scala.inline
  implicit class ListDeploymentGroupsOutputOps[Self <: ListDeploymentGroupsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentGroups(value: DeploymentGroupsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

