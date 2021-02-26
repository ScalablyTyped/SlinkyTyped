package typingsSlinky.openlayers.mod.olx.format

import typingsSlinky.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONOptions extends StObject {
  
  var defaultDataProjection: ProjectionLike = js.native
  
  var featureProjection: ProjectionLike = js.native
  
  var geometryName: js.UndefOr[String] = js.native
}
object GeoJSONOptions {
  
  @scala.inline
  def apply(): GeoJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONOptions]
  }
  
  @scala.inline
  implicit class GeoJSONOptionsMutableBuilder[Self <: GeoJSONOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultDataProjection(value: ProjectionLike): Self = StObject.set(x, "defaultDataProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDataProjectionUndefined: Self = StObject.set(x, "defaultDataProjection", js.undefined)
    
    @scala.inline
    def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
    
    @scala.inline
    def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
  }
}
