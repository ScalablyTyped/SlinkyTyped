package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointProperties extends js.Object {
  /**
    * The creation date and time of the endpoint.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The number of inference units currently used by the model using this endpoint.
    */
  var CurrentInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.native
  /**
    * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.native
  /**
    * The Amazon Resource Number (ARN) of the endpoint.
    */
  var EndpointArn: js.UndefOr[ComprehendEndpointArn] = js.native
  /**
    * The date and time that the endpoint was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * Specifies a reason for failure in cases of Failed status.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
    */
  var ModelArn: js.UndefOr[ComprehendModelArn] = js.native
  /**
    * Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so customers will need to wait for the endpoint to be Ready status before making inference requests.
    */
  var Status: js.UndefOr[EndpointStatus] = js.native
}

object EndpointProperties {
  @scala.inline
  def apply(): EndpointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointProperties]
  }
  @scala.inline
  implicit class EndpointPropertiesOps[Self <: EndpointProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentInferenceUnits(value: InferenceUnitsInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentInferenceUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentInferenceUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentInferenceUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredInferenceUnits(value: InferenceUnitsInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInferenceUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredInferenceUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInferenceUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointArn(value: ComprehendEndpointArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: AnyLengthString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withModelArn(value: ComprehendModelArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: EndpointStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

