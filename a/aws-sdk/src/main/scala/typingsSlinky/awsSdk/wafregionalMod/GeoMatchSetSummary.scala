package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoMatchSetSummary extends StObject {
  
  /**
    * The GeoMatchSetId for an GeoMatchSet. You can use GeoMatchSetId in a GetGeoMatchSet request to get detailed information about an GeoMatchSet.
    */
  var GeoMatchSetId: ResourceId = js.native
  
  /**
    * A friendly name or description of the GeoMatchSet. You can't change the name of an GeoMatchSet after you create it.
    */
  var Name: ResourceName = js.native
}
object GeoMatchSetSummary {
  
  @scala.inline
  def apply(GeoMatchSetId: ResourceId, Name: ResourceName): GeoMatchSetSummary = {
    val __obj = js.Dynamic.literal(GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetSummary]
  }
  
  @scala.inline
  implicit class GeoMatchSetSummaryMutableBuilder[Self <: GeoMatchSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoMatchSetId(value: ResourceId): Self = StObject.set(x, "GeoMatchSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
