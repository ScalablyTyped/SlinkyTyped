package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.opsworksMod.String
import typingsSlinky.awsSdk.opsworksMod.Strings
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworks.DescribeDeploymentsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeDeploymentsReques extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The app ID. If you include this parameter, the command returns a description of the commands associated with the specified app.
    */
  var AppId: js.UndefOr[String] = js.native
  /**
    * An array of deployment IDs to be described. If you include this parameter, the command returns a description of the specified deployments. Otherwise, it returns a description of every deployment.
    */
  var DeploymentIds: js.UndefOr[Strings] = js.native
  /**
    * The stack ID. If you include this parameter, the command returns a description of the commands associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeDeploymentsReques {
  @scala.inline
  def apply(): DescribeDeploymentsReques = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentsReques]
  }
  @scala.inline
  implicit class DescribeDeploymentsRequesOps[Self <: DescribeDeploymentsReques] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
  }
  
}

