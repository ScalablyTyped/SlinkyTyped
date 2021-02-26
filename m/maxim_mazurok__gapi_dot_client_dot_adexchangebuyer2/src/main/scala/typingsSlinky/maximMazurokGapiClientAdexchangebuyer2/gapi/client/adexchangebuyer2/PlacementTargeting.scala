package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementTargeting extends StObject {
  
  /** Mobile application targeting information in a deal. This doesn't apply to Auction Packages. */
  var mobileApplicationTargeting: js.UndefOr[MobileApplicationTargeting] = js.native
  
  /** URLs to be included/excluded. */
  var urlTargeting: js.UndefOr[UrlTargeting] = js.native
}
object PlacementTargeting {
  
  @scala.inline
  def apply(): PlacementTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTargeting]
  }
  
  @scala.inline
  implicit class PlacementTargetingMutableBuilder[Self <: PlacementTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMobileApplicationTargeting(value: MobileApplicationTargeting): Self = StObject.set(x, "mobileApplicationTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileApplicationTargetingUndefined: Self = StObject.set(x, "mobileApplicationTargeting", js.undefined)
    
    @scala.inline
    def setUrlTargeting(value: UrlTargeting): Self = StObject.set(x, "urlTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlTargetingUndefined: Self = StObject.set(x, "urlTargeting", js.undefined)
  }
}
