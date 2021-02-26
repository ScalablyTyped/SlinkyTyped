package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressedDestinationSummary extends StObject {
  
  /**
    * The email address that's on the suppression list for your account.
    */
  var EmailAddress: typingsSlinky.awsSdk.sesv2Mod.EmailAddress = js.native
  
  /**
    * The date and time when the suppressed destination was last updated, shown in Unix time format.
    */
  var LastUpdateTime: js.Date = js.native
  
  /**
    * The reason that the address was added to the suppression list for your account.
    */
  var Reason: SuppressionListReason = js.native
}
object SuppressedDestinationSummary {
  
  @scala.inline
  def apply(EmailAddress: EmailAddress, LastUpdateTime: js.Date, Reason: SuppressionListReason): SuppressedDestinationSummary = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressedDestinationSummary]
  }
  
  @scala.inline
  implicit class SuppressedDestinationSummaryMutableBuilder[Self <: SuppressedDestinationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: SuppressionListReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
