package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OGCFeatureLayerViewProperties extends LayerViewProperties {
  
  /**
    * The effect applied to the layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#effect)
    */
  var effect: js.UndefOr[FeatureEffectProperties] = js.native
  
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.native
}
object OGCFeatureLayerViewProperties {
  
  @scala.inline
  def apply(): OGCFeatureLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OGCFeatureLayerViewProperties]
  }
  
  @scala.inline
  implicit class OGCFeatureLayerViewPropertiesOps[Self <: OGCFeatureLayerViewProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEffect(value: FeatureEffectProperties): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setFilter(value: FeatureFilterProperties): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
