package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerPositionHeight extends StObject {
  
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  
  var extrudedHeight: js.UndefOr[Double] = js.native
  
  var granularity: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var perPositionHeight: js.UndefOr[Boolean] = js.native
  
  var polygonHierarchy: typingsSlinky.cesium.mod.PolygonHierarchy = js.native
  
  var stRotation: js.UndefOr[Double] = js.native
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}
object PerPositionHeight {
  
  @scala.inline
  def apply(polygonHierarchy: typingsSlinky.cesium.mod.PolygonHierarchy): PerPositionHeight = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerPositionHeight]
  }
  
  @scala.inline
  implicit class PerPositionHeightMutableBuilder[Self <: PerPositionHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setExtrudedHeight(value: Double): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPerPositionHeight(value: Boolean): Self = StObject.set(x, "perPositionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPositionHeightUndefined: Self = StObject.set(x, "perPositionHeight", js.undefined)
    
    @scala.inline
    def setPolygonHierarchy(value: typingsSlinky.cesium.mod.PolygonHierarchy): Self = StObject.set(x, "polygonHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStRotation(value: Double): Self = StObject.set(x, "stRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStRotationUndefined: Self = StObject.set(x, "stRotation", js.undefined)
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
