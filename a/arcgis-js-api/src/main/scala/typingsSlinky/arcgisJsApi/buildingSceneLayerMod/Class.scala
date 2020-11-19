package typingsSlinky.arcgisJsApi.buildingSceneLayerMod

import typingsSlinky.arcgisJsApi.esri.BuildingSceneLayer
import typingsSlinky.arcgisJsApi.esri.BuildingSceneLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/layers/BuildingSceneLayer", JSImport.Namespace)
@js.native
/**
  * The BuildingSceneLayer is designed for visualizing buildings with detailed interiors in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). These building models are usually exported from Building Information Modeling (BIM) projects. The data in a BuildingSceneLayer can represent walls, lighting fixtures, mechanical systems, furniture and so on.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html)
  */
class Class () extends BuildingSceneLayer {
  def this(properties: BuildingSceneLayerProperties) = this()
}
