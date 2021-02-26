package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoRegionAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the geographic region (e.g., "Ontario, Canada"). */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The type of geographic region targeting. */
  var geoRegionType: js.UndefOr[String] = js.native
  
  /** Indicates if this option is being negatively targeted. */
  var negative: js.UndefOr[Boolean] = js.native
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_GEO_REGION`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object GeoRegionAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): GeoRegionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoRegionAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class GeoRegionAssignedTargetingOptionDetailsMutableBuilder[Self <: GeoRegionAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGeoRegionType(value: String): Self = StObject.set(x, "geoRegionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoRegionTypeUndefined: Self = StObject.set(x, "geoRegionType", js.undefined)
    
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
