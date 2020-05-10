package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateModelVersionRequest extends js.Object {
  /**
    * The model description.
    */
  var description: typingsSlinky.awsSdk.frauddetectorMod.description = js.native
  /**
    * The model ID.
    */
  var modelId: identifier = js.native
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum = js.native
  /**
    * The model version.
    */
  var modelVersionNumber: nonEmptyString = js.native
  /**
    * The new model status.
    */
  var status: ModelVersionStatus = js.native
}

object UpdateModelVersionRequest {
  @scala.inline
  def apply(
    description: description,
    modelId: identifier,
    modelType: ModelTypeEnum,
    modelVersionNumber: nonEmptyString,
    status: ModelVersionStatus
  ): UpdateModelVersionRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelVersionRequest]
  }
  @scala.inline
  implicit class UpdateModelVersionRequestOps[Self <: UpdateModelVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelType(value: ModelTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelVersionNumber(value: nonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ModelVersionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

