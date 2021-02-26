package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamLayerViewProperties extends LayerViewProperties {
  
  /**
    * The effect applied to the layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#effect)
    */
  var effect: js.UndefOr[FeatureEffectProperties] = js.native
  
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.native
}
object StreamLayerViewProperties {
  
  @scala.inline
  def apply(): StreamLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamLayerViewProperties]
  }
  
  @scala.inline
  implicit class StreamLayerViewPropertiesMutableBuilder[Self <: StreamLayerViewProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: FeatureEffectProperties): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setFilter(value: FeatureFilterProperties): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
