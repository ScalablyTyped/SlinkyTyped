package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the browser. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Indicates if this option is being negatively targeted. All assigned browser targeting options on the same line item must have the same value for this field. */
  var negative: js.UndefOr[Boolean] = js.native
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_BROWSER`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object BrowserAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): BrowserAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class BrowserAssignedTargetingOptionDetailsMutableBuilder[Self <: BrowserAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
