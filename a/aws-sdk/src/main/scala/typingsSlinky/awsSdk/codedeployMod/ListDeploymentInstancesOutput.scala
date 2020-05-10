package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentInstancesOutput extends js.Object {
  /**
    * A list of instance IDs.
    */
  var instancesList: js.UndefOr[InstancesList] = js.native
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment instances call to return the next set of deployment instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentInstancesOutput {
  @scala.inline
  def apply(): ListDeploymentInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentInstancesOutput]
  }
  @scala.inline
  implicit class ListDeploymentInstancesOutputOps[Self <: ListDeploymentInstancesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstancesList(value: InstancesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancesList")(js.undefined)
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

