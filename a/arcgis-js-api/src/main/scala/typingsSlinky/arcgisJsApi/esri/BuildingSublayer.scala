package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingSublayer
  extends Accessor
     with IntersectItem {
  
  /**
    * The sublayer's layer id as defined by the Scene Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#id)
    */
  val id: Double = js.native
  
  /**
    * Indicates if this sublayer is empty. This property is only read from the service. Empty sublayers are not loaded for rendering and applications can choose to hide them in their UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#isEmpty)
    */
  val isEmpty: Boolean = js.native
  
  /**
    * The modelName is a standard name for each sublayer. For example the sublayer containing the doors in a building has the modelName "Doors". Use this property to retrieve sublayers in a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#modelName)
    */
  val modelName: String = js.native
  
  /**
    * Opacity of the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#opacity)
    *
    * @default 1
    */
  var opacity: Double = js.native
  
  /**
    * The title of the sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#title)
    */
  var title: String = js.native
  
  /**
    * Indicates if the sublayer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#visible)
    *
    * @default true
    */
  var visible: Boolean = js.native
}
