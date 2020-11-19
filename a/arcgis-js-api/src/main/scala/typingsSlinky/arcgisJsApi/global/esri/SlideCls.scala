package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.SlideProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Slide")
@js.native
/**
  * A slide stores a snapshot of several pre-set properties of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), such as the [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#basemap), [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint) and [visible layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers). The [visible layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers) may contain references (by [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)) to both operational layers from the [scene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#layers) as well as elevation layers from the [ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers), which affect the surface elevation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html)
  */
class SlideCls ()
  extends typingsSlinky.arcgisJsApi.esri.Slide {
  def this(properties: SlideProperties) = this()
}
