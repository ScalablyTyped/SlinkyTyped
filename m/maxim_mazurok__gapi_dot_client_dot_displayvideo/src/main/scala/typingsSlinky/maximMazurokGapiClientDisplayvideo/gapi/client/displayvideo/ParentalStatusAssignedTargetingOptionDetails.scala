package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentalStatusAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The parental status of the audience. */
  var parentalStatus: js.UndefOr[String] = js.native
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_PARENTAL_STATUS`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object ParentalStatusAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): ParentalStatusAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentalStatusAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ParentalStatusAssignedTargetingOptionDetailsMutableBuilder[Self <: ParentalStatusAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentalStatus(value: String): Self = StObject.set(x, "parentalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentalStatusUndefined: Self = StObject.set(x, "parentalStatus", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
