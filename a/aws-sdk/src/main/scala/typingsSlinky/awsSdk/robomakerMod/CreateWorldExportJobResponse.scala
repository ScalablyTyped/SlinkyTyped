package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorldExportJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the world export job.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the world export job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The failure code of the world export job if it failed:  InternalServiceError  Internal service error.  LimitExceeded  The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed.   ResourceNotFound  The specified resource could not be found.   RequestThrottled  The request was throttled.  InvalidInput  An input parameter in the request is not valid.  AllWorldGenerationFailed  All of the worlds in the world generation job failed. This can happen if your worldCount is greater than 50 or less than 1.    For more information about troubleshooting WorldForge, see Troubleshooting Simulation WorldForge. 
    */
  var failureCode: js.UndefOr[WorldExportJobErrorCode] = js.native
  
  /**
    * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export. 
    */
  var iamRole: js.UndefOr[IamRole] = js.native
  
  var outputLocation: js.UndefOr[OutputLocation] = js.native
  
  /**
    * The status of the world export job.  Pending  The world export job request is pending.  Running  The world export job is running.   Completed  The world export job completed.   Failed  The world export job failed. See failureCode for more information.   Canceled  The world export job was cancelled.  Canceling  The world export job is being cancelled.  
    */
  var status: js.UndefOr[WorldExportJobStatus] = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the world export job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateWorldExportJobResponse {
  
  @scala.inline
  def apply(): CreateWorldExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorldExportJobResponse]
  }
  
  @scala.inline
  implicit class CreateWorldExportJobResponseMutableBuilder[Self <: CreateWorldExportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setFailureCode(value: WorldExportJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    @scala.inline
    def setIamRole(value: IamRole): Self = StObject.set(x, "iamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleUndefined: Self = StObject.set(x, "iamRole", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
    
    @scala.inline
    def setStatus(value: WorldExportJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
