package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalModel extends js.Object {
  /**
    * Timestamp of when the model was last created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The input configuration.
    */
  var inputConfiguration: js.UndefOr[ModelInputConfiguration] = js.native
  /**
    * Timestamp of when the model was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The Amazon SageMaker model endpoints.
    */
  var modelEndpoint: js.UndefOr[String] = js.native
  /**
    * The Amazon Fraud Detector status for the external model endpoint
    */
  var modelEndpointStatus: js.UndefOr[ModelEndpointStatus] = js.native
  /**
    * The source of the model.
    */
  var modelSource: js.UndefOr[ModelSource] = js.native
  /**
    * The output configuration.
    */
  var outputConfiguration: js.UndefOr[ModelOutputConfiguration] = js.native
  /**
    * The role used to invoke the model. 
    */
  var role: js.UndefOr[Role] = js.native
}

object ExternalModel {
  @scala.inline
  def apply(): ExternalModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalModel]
  }
  @scala.inline
  implicit class ExternalModelOps[Self <: ExternalModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInputConfiguration(value: ModelInputConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withModelEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withModelEndpointStatus(value: ModelEndpointStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEndpointStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelEndpointStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEndpointStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withModelSource(value: ModelSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelSource")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputConfiguration(value: ModelOutputConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}

