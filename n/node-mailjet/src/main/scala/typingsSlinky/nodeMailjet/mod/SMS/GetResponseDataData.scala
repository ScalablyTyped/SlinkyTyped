package typingsSlinky.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// other types
@js.native
trait GetResponseDataData extends StObject {
  
  val Cost: ResponseCost = js.native
  
  val CreationTS: Double = js.native
  
  val From: String = js.native
  
  val MessageId: String = js.native
  
  val SMSCount: Double = js.native
  
  val SentTS: Double = js.native
  
  val Status: ResponseStatus = js.native
  
  val To: String = js.native
}
object GetResponseDataData {
  
  @scala.inline
  def apply(
    Cost: ResponseCost,
    CreationTS: Double,
    From: String,
    MessageId: String,
    SMSCount: Double,
    SentTS: Double,
    Status: ResponseStatus,
    To: String
  ): GetResponseDataData = {
    val __obj = js.Dynamic.literal(Cost = Cost.asInstanceOf[js.Any], CreationTS = CreationTS.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], SMSCount = SMSCount.asInstanceOf[js.Any], SentTS = SentTS.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseDataData]
  }
  
  @scala.inline
  implicit class GetResponseDataDataMutableBuilder[Self <: GetResponseDataData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCost(value: ResponseCost): Self = StObject.set(x, "Cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTS(value: Double): Self = StObject.set(x, "CreationTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMSCount(value: Double): Self = StObject.set(x, "SMSCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentTS(value: Double): Self = StObject.set(x, "SentTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ResponseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
