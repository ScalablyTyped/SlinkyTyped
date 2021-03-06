package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.WINDOWS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminGetGithubActionsBillingGheResponseData extends StObject {
  
  /**
    * The amount of free GitHub Actions minutes available.
    */
  var included_minutes: Double = js.native
  
  var minutes_used_breakdown: WINDOWS = js.native
  
  /**
    * The sum of the free and paid GitHub Actions minutes used.
    */
  var total_minutes_used: Double = js.native
  
  /**
    * The total paid GitHub Actions minutes used.
    */
  var total_paid_minutes_used: Double = js.native
}
object EnterpriseAdminGetGithubActionsBillingGheResponseData {
  
  @scala.inline
  def apply(
    included_minutes: Double,
    minutes_used_breakdown: WINDOWS,
    total_minutes_used: Double,
    total_paid_minutes_used: Double
  ): EnterpriseAdminGetGithubActionsBillingGheResponseData = {
    val __obj = js.Dynamic.literal(included_minutes = included_minutes.asInstanceOf[js.Any], minutes_used_breakdown = minutes_used_breakdown.asInstanceOf[js.Any], total_minutes_used = total_minutes_used.asInstanceOf[js.Any], total_paid_minutes_used = total_paid_minutes_used.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminGetGithubActionsBillingGheResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminGetGithubActionsBillingGheResponseDataMutableBuilder[Self <: EnterpriseAdminGetGithubActionsBillingGheResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncluded_minutes(value: Double): Self = StObject.set(x, "included_minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes_used_breakdown(value: WINDOWS): Self = StObject.set(x, "minutes_used_breakdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_minutes_used(value: Double): Self = StObject.set(x, "total_minutes_used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_paid_minutes_used(value: Double): Self = StObject.set(x, "total_paid_minutes_used", value.asInstanceOf[js.Any])
  }
}
