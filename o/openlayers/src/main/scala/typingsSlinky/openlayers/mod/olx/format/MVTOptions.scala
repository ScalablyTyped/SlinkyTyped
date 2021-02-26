package typingsSlinky.openlayers.mod.olx.format

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openlayers.mod.geom.Geometry
import typingsSlinky.openlayers.mod.geom.GeometryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MVTOptions extends StObject {
  
  var featureClass: js.UndefOr[
    (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], _]) | (js.Function4[
      /* geom */ GeometryType, 
      /* arg2 */ js.Array[Double], 
      /* arg3 */ js.Array[js.Array[Double] | Double], 
      /* arg4 */ StringDictionary[js.Any], 
      _
    ])
  ] = js.native
  
  var geometryName: js.UndefOr[String] = js.native
  
  var layerName: js.UndefOr[String] = js.native
  
  var layers: js.UndefOr[js.Array[String]] = js.native
}
object MVTOptions {
  
  @scala.inline
  def apply(): MVTOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MVTOptions]
  }
  
  @scala.inline
  implicit class MVTOptionsMutableBuilder[Self <: MVTOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureClass(
      value: (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], _]) | (js.Function4[
          /* geom */ GeometryType, 
          /* arg2 */ js.Array[Double], 
          /* arg3 */ js.Array[js.Array[Double] | Double], 
          /* arg4 */ StringDictionary[js.Any], 
          _
        ])
    ): Self = StObject.set(x, "featureClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureClassFunction1(value: /* geom */ Geometry | StringDictionary[js.Any] => _): Self = StObject.set(x, "featureClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFeatureClassFunction4(
      value: (/* geom */ GeometryType, /* arg2 */ js.Array[Double], /* arg3 */ js.Array[js.Array[Double] | Double], /* arg4 */ StringDictionary[js.Any]) => _
    ): Self = StObject.set(x, "featureClass", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFeatureClassUndefined: Self = StObject.set(x, "featureClass", js.undefined)
    
    @scala.inline
    def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    
    @scala.inline
    def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
