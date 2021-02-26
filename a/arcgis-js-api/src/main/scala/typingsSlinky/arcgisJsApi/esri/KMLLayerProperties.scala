package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMLLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with BlendLayerProperties {
  
  /**
    * A collection of [KMLSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[KMLSublayerProperties]] = js.native
  
  /**
    * The publicly accessible URL for a .kml or .kmz file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}
object KMLLayerProperties {
  
  @scala.inline
  def apply(): KMLLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMLLayerProperties]
  }
  
  @scala.inline
  implicit class KMLLayerPropertiesMutableBuilder[Self <: KMLLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSublayers(value: CollectionProperties[KMLSublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    @scala.inline
    def setSublayersVarargs(value: KMLSublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
