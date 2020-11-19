package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.failed
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.loading
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingExplorerViewModel extends Accessor {
  
  /**
    * A collection of layers of type [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) that are added to the widget for exploration. The widget is only displayed when this property is set. In case of multiple layers, the widget will display and apply the filters on all layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#layers)
    */
  var layers: Collection[BuildingSceneLayer] = js.native
  
  /**
    * Contains information about the level filter, such as the value selected by the user in the Level element or the minimum and maximum allowed values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#level)
    */
  val level: BuildingLevel = js.native
  
  /**
    * Contains information about the construction phase filter, such as the value selected by the user in the Construction phases element and the minimum and maximum allowed values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#phase)
    */
  val phase: BuildingPhase = js.native
  
  /**
    * The current state of the view model that can be used for rendering the UI of the widget.
    *
    * Value | Description
    * ------------|-------------
    * disabled | widget is being created
    * loading | layers and statistics are loading
    * ready | widget is ready
    * failed | widget failed to load data
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | loading | ready | failed = js.native
  
  /**
    * The view in which the BuildingExplorer is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#view)
    */
  var view: SceneView = js.native
}
