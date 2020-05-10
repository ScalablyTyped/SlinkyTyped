package typingsSlinky.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnErrorDeploymentExtended extends js.Object {
  /**
    * The deployment to be used on error case.
    */
  var deploymentName: js.UndefOr[String] = js.native
  /**
    * The state of the provisioning for the on error deployment.
    */
  val provisioningState: js.UndefOr[String] = js.native
  /**
    * The deployment on error behavior type. Possible values are LastSuccessful and
    * SpecificDeployment. Possible values include: 'LastSuccessful', 'SpecificDeployment'
    */
  var `type`: js.UndefOr[String] = js.native
}

object OnErrorDeploymentExtended {
  @scala.inline
  def apply(): OnErrorDeploymentExtended = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnErrorDeploymentExtended]
  }
  @scala.inline
  implicit class OnErrorDeploymentExtendedOps[Self <: OnErrorDeploymentExtended] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentName")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningState")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

