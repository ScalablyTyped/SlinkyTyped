package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveLayerInfo extends Accessor {
  
  /**
    * A collection of child activeLayerInfos.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#children)
    */
  var children: Collection[ActiveLayerInfo] = js.native
  
  /**
    * Indicates if the legend's display of the layer's renderer is driven by the scale of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#isScaleDriven)
    */
  var isScaleDriven: Boolean = js.native
  
  /**
    * The layer represented by the ActiveLayerInfo object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layer)
    */
  var layer: Layer = js.native
  
  /**
    * The layerView represented by the ActiveLayerInfo object's layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layerView)
    */
  var layerView: LayerView = js.native
  
  /**
    * The legendElements is constructed using the layer [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements)
    */
  var legendElements: js.Array[LegendElement] = js.native
  
  /**
    * The opacity of the layer or parent element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#opacity)
    */
  val opacity: Double = js.native
  
  /**
    * The ActiveLayerInfo of the parent [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#parent)
    */
  var parent: ActiveLayerInfo = js.native
  
  /**
    * Indicates if the activeLayerInfo is ready.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready)
    */
  var ready: Boolean = js.native
  
  /**
    * The scale of the view instance in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#scale)
    */
  var scale: Double = js.native
  
  /**
    * The text string that represents the legend's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#title)
    */
  var title: String = js.native
  
  /**
    * The version of the ActiveLayerInfo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#version)
    */
  var version: Double = js.native
  
  /**
    * The view in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#view)
    */
  var view: View = js.native
}
