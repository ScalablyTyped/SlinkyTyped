package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIngestionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the data ingestion.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * An ID for the ingestion.
    */
  var IngestionId: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.IngestionId] = js.native
  
  /**
    * The ingestion status.
    */
  var IngestionStatus: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.IngestionStatus] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object CreateIngestionResponse {
  
  @scala.inline
  def apply(): CreateIngestionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIngestionResponse]
  }
  
  @scala.inline
  implicit class CreateIngestionResponseMutableBuilder[Self <: CreateIngestionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setIngestionId(value: IngestionId): Self = StObject.set(x, "IngestionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionIdUndefined: Self = StObject.set(x, "IngestionId", js.undefined)
    
    @scala.inline
    def setIngestionStatus(value: IngestionStatus): Self = StObject.set(x, "IngestionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionStatusUndefined: Self = StObject.set(x, "IngestionStatus", js.undefined)
    
    @scala.inline
    def setRequestId(value: java.lang.String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
