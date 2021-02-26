package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBlacklistReportsResponse extends StObject {
  
  /**
    * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
    */
  var BlacklistReport: typingsSlinky.awsSdk.pinpointemailMod.BlacklistReport = js.native
}
object GetBlacklistReportsResponse {
  
  @scala.inline
  def apply(BlacklistReport: BlacklistReport): GetBlacklistReportsResponse = {
    val __obj = js.Dynamic.literal(BlacklistReport = BlacklistReport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlacklistReportsResponse]
  }
  
  @scala.inline
  implicit class GetBlacklistReportsResponseMutableBuilder[Self <: GetBlacklistReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlacklistReport(value: BlacklistReport): Self = StObject.set(x, "BlacklistReport", value.asInstanceOf[js.Any])
  }
}
