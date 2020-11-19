package typingsSlinky.arcgisJsApi.elevationLayerMod

import typingsSlinky.arcgisJsApi.esri.ElevationLayer
import typingsSlinky.arcgisJsApi.esri.ElevationLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/layers/ElevationLayer", JSImport.Namespace)
@js.native
/**
  * ElevationLayer is a tile layer used for rendering elevations in [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A default [world elevation layer](https://www.arcgis.com/home/item.html?id=7029fb60158543ad845c7e1527af11e4) can be added to the map by setting the [map's ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground) property to `world-elevation`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html)
  */
class Class () extends ElevationLayer {
  def this(properties: ElevationLayerProperties) = this()
}
