package typingsSlinky.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentOperationProperties extends js.Object {
  /**
    * The state of the provisioning.
    */
  val provisioningState: js.UndefOr[String] = js.native
  /**
    * The HTTP request message.
    */
  val request: js.UndefOr[HttpMessage] = js.native
  /**
    * The HTTP response message.
    */
  val response: js.UndefOr[HttpMessage] = js.native
  /**
    * Deployment operation service request id.
    */
  val serviceRequestId: js.UndefOr[String] = js.native
  /**
    * Operation status code.
    */
  val statusCode: js.UndefOr[String] = js.native
  /**
    * Operation status message.
    */
  val statusMessage: js.UndefOr[js.Any] = js.native
  /**
    * The target resource.
    */
  val targetResource: js.UndefOr[TargetResource] = js.native
  /**
    * The date and time of the operation.
    */
  val timestamp: js.UndefOr[js.Date] = js.native
}

object DeploymentOperationProperties {
  @scala.inline
  def apply(): DeploymentOperationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOperationProperties]
  }
  @scala.inline
  implicit class DeploymentOperationPropertiesOps[Self <: DeploymentOperationProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRequest(value: HttpMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: HttpMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetResource(value: TargetResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResource")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

