package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSendQuotaResponse extends StObject {
  
  /**
    * The maximum number of emails the user is allowed to send in a 24-hour interval. A value of -1 signifies an unlimited quota.
    */
  var Max24HourSend: js.UndefOr[typingsSlinky.awsSdk.sesMod.Max24HourSend] = js.native
  
  /**
    * The maximum number of emails that Amazon SES can accept from the user's account per second.  The rate at which Amazon SES accepts the user's messages might be less than the maximum send rate. 
    */
  var MaxSendRate: js.UndefOr[typingsSlinky.awsSdk.sesMod.MaxSendRate] = js.native
  
  /**
    * The number of emails sent during the previous 24 hours.
    */
  var SentLast24Hours: js.UndefOr[typingsSlinky.awsSdk.sesMod.SentLast24Hours] = js.native
}
object GetSendQuotaResponse {
  
  @scala.inline
  def apply(): GetSendQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSendQuotaResponse]
  }
  
  @scala.inline
  implicit class GetSendQuotaResponseMutableBuilder[Self <: GetSendQuotaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax24HourSend(value: Max24HourSend): Self = StObject.set(x, "Max24HourSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax24HourSendUndefined: Self = StObject.set(x, "Max24HourSend", js.undefined)
    
    @scala.inline
    def setMaxSendRate(value: MaxSendRate): Self = StObject.set(x, "MaxSendRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSendRateUndefined: Self = StObject.set(x, "MaxSendRate", js.undefined)
    
    @scala.inline
    def setSentLast24Hours(value: SentLast24Hours): Self = StObject.set(x, "SentLast24Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentLast24HoursUndefined: Self = StObject.set(x, "SentLast24Hours", js.undefined)
  }
}
