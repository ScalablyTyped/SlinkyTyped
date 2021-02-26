package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorldGenerationJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the world generator job.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the world generator job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The failure code of the world generator job if it failed:  InternalServiceError  Internal service error.  LimitExceeded  The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed.   ResourceNotFound  The specified resource could not be found.   RequestThrottled  The request was throttled.  InvalidInput  An input parameter in the request is not valid.  
    */
  var failureCode: js.UndefOr[WorldGenerationJobErrorCode] = js.native
  
  /**
    * The status of the world generator job.  Pending  The world generator job request is pending.  Running  The world generator job is running.   Completed  The world generator job completed.   Failed  The world generator job failed. See failureCode for more information.   PartialFailed  Some worlds did not generate.  Canceled  The world generator job was cancelled.  Canceling  The world generator job is being cancelled.  
    */
  var status: js.UndefOr[WorldGenerationJobStatus] = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the world generator job.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var template: js.UndefOr[Arn] = js.native
  
  /**
    * Information about the world count. 
    */
  var worldCount: js.UndefOr[WorldCount] = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the generated worlds.
    */
  var worldTags: js.UndefOr[TagMap] = js.native
}
object CreateWorldGenerationJobResponse {
  
  @scala.inline
  def apply(): CreateWorldGenerationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorldGenerationJobResponse]
  }
  
  @scala.inline
  implicit class CreateWorldGenerationJobResponseMutableBuilder[Self <: CreateWorldGenerationJobResponse] (val x: Self) extends AnyVal {
    
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
    def setFailureCode(value: WorldGenerationJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    @scala.inline
    def setStatus(value: WorldGenerationJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setWorldCount(value: WorldCount): Self = StObject.set(x, "worldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldCountUndefined: Self = StObject.set(x, "worldCount", js.undefined)
    
    @scala.inline
    def setWorldTags(value: TagMap): Self = StObject.set(x, "worldTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldTagsUndefined: Self = StObject.set(x, "worldTags", js.undefined)
  }
}
