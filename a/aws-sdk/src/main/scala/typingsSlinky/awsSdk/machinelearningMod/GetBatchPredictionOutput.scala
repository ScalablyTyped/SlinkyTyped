package typingsSlinky.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBatchPredictionOutput extends StObject {
  
  /**
    * The ID of the DataSource that was used to create the BatchPrediction. 
    */
  var BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.native
  
  /**
    * An ID assigned to the BatchPrediction at creation. This value should be identical to the value of the BatchPredictionID in the request.
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.native
  
  /**
    * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the BatchPrediction, normalized and scaled on computation resources. ComputeTime is only available if the BatchPrediction is in the COMPLETED state.
    */
  var ComputeTime: js.UndefOr[LongType] = js.native
  
  /**
    * The time when the BatchPrediction was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The AWS user account that invoked the BatchPrediction. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  
  /**
    * The epoch time when Amazon Machine Learning marked the BatchPrediction as COMPLETED or FAILED. FinishedAt is only available when the BatchPrediction is in the COMPLETED or FAILED state.
    */
  var FinishedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.native
  
  /**
    * The number of invalid records that Amazon Machine Learning saw while processing the BatchPrediction.
    */
  var InvalidRecordCount: js.UndefOr[LongType] = js.native
  
  /**
    * The time of the most recent edit to BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * A link to the file that contains logs of the CreateBatchPrediction operation.
    */
  var LogUri: js.UndefOr[PresignedS3Url] = js.native
  
  /**
    * The ID of the MLModel that generated predictions for the BatchPrediction request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  
  /**
    * A description of the most recent details about processing the batch prediction request.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Message] = js.native
  
  /**
    * A user-supplied name or description of the BatchPrediction.
    */
  var Name: js.UndefOr[EntityName] = js.native
  
  /**
    * The location of an Amazon S3 bucket or directory to receive the operation results.
    */
  var OutputUri: js.UndefOr[S3Url] = js.native
  
  /**
    * The epoch time when Amazon Machine Learning marked the BatchPrediction as INPROGRESS. StartedAt isn't available if the BatchPrediction is in the PENDING state.
    */
  var StartedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the BatchPrediction, which can be one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to generate batch predictions.  INPROGRESS - The batch predictions are in progress.  FAILED - The request to perform a batch prediction did not run to completion. It is not usable.  COMPLETED - The batch prediction process completed successfully.  DELETED - The BatchPrediction is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
  
  /**
    * The number of total records that Amazon Machine Learning saw while processing the BatchPrediction.
    */
  var TotalRecordCount: js.UndefOr[LongType] = js.native
}
object GetBatchPredictionOutput {
  
  @scala.inline
  def apply(): GetBatchPredictionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBatchPredictionOutput]
  }
  
  @scala.inline
  implicit class GetBatchPredictionOutputMutableBuilder[Self <: GetBatchPredictionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchPredictionDataSourceId(value: EntityId): Self = StObject.set(x, "BatchPredictionDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchPredictionDataSourceIdUndefined: Self = StObject.set(x, "BatchPredictionDataSourceId", js.undefined)
    
    @scala.inline
    def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchPredictionIdUndefined: Self = StObject.set(x, "BatchPredictionId", js.undefined)
    
    @scala.inline
    def setComputeTime(value: LongType): Self = StObject.set(x, "ComputeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeTimeUndefined: Self = StObject.set(x, "ComputeTime", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setCreatedByIamUser(value: AwsUserArn): Self = StObject.set(x, "CreatedByIamUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByIamUserUndefined: Self = StObject.set(x, "CreatedByIamUser", js.undefined)
    
    @scala.inline
    def setFinishedAt(value: js.Date): Self = StObject.set(x, "FinishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAtUndefined: Self = StObject.set(x, "FinishedAt", js.undefined)
    
    @scala.inline
    def setInputDataLocationS3(value: S3Url): Self = StObject.set(x, "InputDataLocationS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataLocationS3Undefined: Self = StObject.set(x, "InputDataLocationS3", js.undefined)
    
    @scala.inline
    def setInvalidRecordCount(value: LongType): Self = StObject.set(x, "InvalidRecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidRecordCountUndefined: Self = StObject.set(x, "InvalidRecordCount", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    @scala.inline
    def setLogUri(value: PresignedS3Url): Self = StObject.set(x, "LogUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUriUndefined: Self = StObject.set(x, "LogUri", js.undefined)
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOutputUri(value: S3Url): Self = StObject.set(x, "OutputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriUndefined: Self = StObject.set(x, "OutputUri", js.undefined)
    
    @scala.inline
    def setStartedAt(value: js.Date): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: EntityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTotalRecordCount(value: LongType): Self = StObject.set(x, "TotalRecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecordCountUndefined: Self = StObject.set(x, "TotalRecordCount", js.undefined)
  }
}
