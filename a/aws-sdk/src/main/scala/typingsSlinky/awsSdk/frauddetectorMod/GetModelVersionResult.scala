package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetModelVersionResult extends js.Object {
  
  /**
    * The model version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * The event details.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.native
  
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[modelIdentifier] = js.native
  
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
  
  /**
    * The model version number.
    */
  var modelVersionNumber: js.UndefOr[floatVersionString] = js.native
  
  /**
    * The model version status.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The training data schema.
    */
  var trainingDataSchema: js.UndefOr[TrainingDataSchema] = js.native
  
  /**
    * The training data source.
    */
  var trainingDataSource: js.UndefOr[TrainingDataSourceEnum] = js.native
}
object GetModelVersionResult {
  
  @scala.inline
  def apply(): GetModelVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetModelVersionResult]
  }
  
  @scala.inline
  implicit class GetModelVersionResultOps[Self <: GetModelVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setExternalEventsDetail(value: ExternalEventsDetail): Self = this.set("externalEventsDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalEventsDetail: Self = this.set("externalEventsDetail", js.undefined)
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = this.set("modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelId: Self = this.set("modelId", js.undefined)
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = this.set("modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelType: Self = this.set("modelType", js.undefined)
    
    @scala.inline
    def setModelVersionNumber(value: floatVersionString): Self = this.set("modelVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelVersionNumber: Self = this.set("modelVersionNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTrainingDataSchema(value: TrainingDataSchema): Self = this.set("trainingDataSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingDataSchema: Self = this.set("trainingDataSchema", js.undefined)
    
    @scala.inline
    def setTrainingDataSource(value: TrainingDataSourceEnum): Self = this.set("trainingDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingDataSource: Self = this.set("trainingDataSource", js.undefined)
  }
}
