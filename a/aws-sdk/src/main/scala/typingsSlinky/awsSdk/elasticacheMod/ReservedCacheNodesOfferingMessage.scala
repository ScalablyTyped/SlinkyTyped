package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedCacheNodesOfferingMessage extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of reserved cache node offerings. Each element in the list contains detailed information about one offering.
    */
  var ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList] = js.native
}
object ReservedCacheNodesOfferingMessage {
  
  @scala.inline
  def apply(): ReservedCacheNodesOfferingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedCacheNodesOfferingMessage]
  }
  
  @scala.inline
  implicit class ReservedCacheNodesOfferingMessageMutableBuilder[Self <: ReservedCacheNodesOfferingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReservedCacheNodesOfferings(value: ReservedCacheNodesOfferingList): Self = StObject.set(x, "ReservedCacheNodesOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedCacheNodesOfferingsUndefined: Self = StObject.set(x, "ReservedCacheNodesOfferings", js.undefined)
    
    @scala.inline
    def setReservedCacheNodesOfferingsVarargs(value: ReservedCacheNodesOffering*): Self = StObject.set(x, "ReservedCacheNodesOfferings", js.Array(value :_*))
  }
}
