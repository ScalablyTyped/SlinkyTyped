package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutExternalModelRequest extends js.Object {
  /**
    * The model endpoint input configuration.
    */
  var inputConfiguration: ModelInputConfiguration = js.native
  /**
    * The model endpoints name.
    */
  var modelEndpoint: String = js.native
  /**
    * The model endpoint’s status in Amazon Fraud Detector.
    */
  var modelEndpointStatus: ModelEndpointStatus = js.native
  /**
    * The source of the model.
    */
  var modelSource: ModelSource = js.native
  /**
    * The model endpoint output configuration.
    */
  var outputConfiguration: ModelOutputConfiguration = js.native
  /**
    * The IAM role used to invoke the model endpoint.
    */
  var role: Role = js.native
}

object PutExternalModelRequest {
  @scala.inline
  def apply(
    inputConfiguration: ModelInputConfiguration,
    modelEndpoint: String,
    modelEndpointStatus: ModelEndpointStatus,
    modelSource: ModelSource,
    outputConfiguration: ModelOutputConfiguration,
    role: Role
  ): PutExternalModelRequest = {
    val __obj = js.Dynamic.literal(inputConfiguration = inputConfiguration.asInstanceOf[js.Any], modelEndpoint = modelEndpoint.asInstanceOf[js.Any], modelEndpointStatus = modelEndpointStatus.asInstanceOf[js.Any], modelSource = modelSource.asInstanceOf[js.Any], outputConfiguration = outputConfiguration.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutExternalModelRequest]
  }
  @scala.inline
  implicit class PutExternalModelRequestOps[Self <: PutExternalModelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputConfiguration(value: ModelInputConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelEndpointStatus(value: ModelEndpointStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEndpointStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelSource(value: ModelSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputConfiguration(value: ModelOutputConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

