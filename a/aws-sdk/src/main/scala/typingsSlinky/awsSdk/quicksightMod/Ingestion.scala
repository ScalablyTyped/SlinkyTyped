package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ingestion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typingsSlinky.awsSdk.quicksightMod.Arn = js.native
  
  /**
    * The time that this ingestion started.
    */
  var CreatedTime: js.Date = js.native
  
  /**
    * Error information for this ingestion.
    */
  var ErrorInfo: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ErrorInfo] = js.native
  
  /**
    * Ingestion ID.
    */
  var IngestionId: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.IngestionId] = js.native
  
  /**
    * The size of the data ingested, in bytes.
    */
  var IngestionSizeInBytes: js.UndefOr[long] = js.native
  
  /**
    * Ingestion status.
    */
  var IngestionStatus: typingsSlinky.awsSdk.quicksightMod.IngestionStatus = js.native
  
  /**
    * The time that this ingestion took, measured in seconds.
    */
  var IngestionTimeInSeconds: js.UndefOr[long] = js.native
  
  var QueueInfo: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.QueueInfo] = js.native
  
  /**
    * Event source for this ingestion.
    */
  var RequestSource: js.UndefOr[IngestionRequestSource] = js.native
  
  /**
    * Type of this ingestion.
    */
  var RequestType: js.UndefOr[IngestionRequestType] = js.native
  
  var RowInfo: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RowInfo] = js.native
}
object Ingestion {
  
  @scala.inline
  def apply(Arn: Arn, CreatedTime: js.Date, IngestionStatus: IngestionStatus): Ingestion = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], IngestionStatus = IngestionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ingestion]
  }
  
  @scala.inline
  implicit class IngestionMutableBuilder[Self <: Ingestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "ErrorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfoUndefined: Self = StObject.set(x, "ErrorInfo", js.undefined)
    
    @scala.inline
    def setIngestionId(value: IngestionId): Self = StObject.set(x, "IngestionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionIdUndefined: Self = StObject.set(x, "IngestionId", js.undefined)
    
    @scala.inline
    def setIngestionSizeInBytes(value: long): Self = StObject.set(x, "IngestionSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionSizeInBytesUndefined: Self = StObject.set(x, "IngestionSizeInBytes", js.undefined)
    
    @scala.inline
    def setIngestionStatus(value: IngestionStatus): Self = StObject.set(x, "IngestionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionTimeInSeconds(value: long): Self = StObject.set(x, "IngestionTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionTimeInSecondsUndefined: Self = StObject.set(x, "IngestionTimeInSeconds", js.undefined)
    
    @scala.inline
    def setQueueInfo(value: QueueInfo): Self = StObject.set(x, "QueueInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueInfoUndefined: Self = StObject.set(x, "QueueInfo", js.undefined)
    
    @scala.inline
    def setRequestSource(value: IngestionRequestSource): Self = StObject.set(x, "RequestSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSourceUndefined: Self = StObject.set(x, "RequestSource", js.undefined)
    
    @scala.inline
    def setRequestType(value: IngestionRequestType): Self = StObject.set(x, "RequestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTypeUndefined: Self = StObject.set(x, "RequestType", js.undefined)
    
    @scala.inline
    def setRowInfo(value: RowInfo): Self = StObject.set(x, "RowInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowInfoUndefined: Self = StObject.set(x, "RowInfo", js.undefined)
  }
}
