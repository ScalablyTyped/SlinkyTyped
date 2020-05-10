package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelVersion extends js.Object {
  /**
    * The parent model ID.
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
}

object ModelVersion {
  @scala.inline
  def apply(modelId: identifier, modelType: ModelTypeEnum, modelVersionNumber: nonEmptyString): ModelVersion = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVersion]
  }
  @scala.inline
  implicit class ModelVersionOps[Self <: ModelVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

