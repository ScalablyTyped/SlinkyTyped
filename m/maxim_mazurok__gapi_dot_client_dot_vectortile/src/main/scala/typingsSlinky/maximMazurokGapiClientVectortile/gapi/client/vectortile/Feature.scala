package typingsSlinky.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature extends StObject {
  
  /** The localized name of this feature. Currently only returned for roads. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The geometry of this feature, representing the space that it occupies in the world. */
  var geometry: js.UndefOr[Geometry] = js.native
  
  /** Place ID of this feature, suitable for use in Places API details requests. */
  var placeId: js.UndefOr[String] = js.native
  
  /** Relations to other features. */
  var relations: js.UndefOr[js.Array[Relation]] = js.native
  
  /** Metadata for features with the SEGMENT FeatureType. */
  var segmentInfo: js.UndefOr[SegmentInfo] = js.native
  
  /** The type of this feature. */
  var `type`: js.UndefOr[String] = js.native
}
object Feature {
  
  @scala.inline
  def apply(): Feature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    @scala.inline
    def setRelations(value: js.Array[Relation]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    @scala.inline
    def setRelationsVarargs(value: Relation*): Self = StObject.set(x, "relations", js.Array(value :_*))
    
    @scala.inline
    def setSegmentInfo(value: SegmentInfo): Self = StObject.set(x, "segmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentInfoUndefined: Self = StObject.set(x, "segmentInfo", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
