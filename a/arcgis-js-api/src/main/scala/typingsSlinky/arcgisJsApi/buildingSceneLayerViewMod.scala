package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BuildingSceneLayerView
import typingsSlinky.arcgisJsApi.esri.BuildingSceneLayerViewConstructor
import typingsSlinky.arcgisJsApi.esri.BuildingSceneLayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingSceneLayerViewMod extends Shortcut {
  
  @JSImport("esri/views/layers/BuildingSceneLayerView", JSImport.Namespace)
  @js.native
  val ^ : BuildingSceneLayerViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/BuildingSceneLayerView", JSImport.Namespace)
  @js.native
  /**
    * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingSceneLayerView.html)
    */
  class Class () extends BuildingSceneLayerView {
    def this(properties: BuildingSceneLayerViewProperties) = this()
  }
  
  type _To = BuildingSceneLayerViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingSceneLayerViewMod.foo` */
  override def _to: BuildingSceneLayerViewConstructor = ^
}
