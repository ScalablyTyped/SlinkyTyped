package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.StreamLayerView
import typingsSlinky.arcgisJsApi.esri.StreamLayerViewConstructor
import typingsSlinky.arcgisJsApi.esri.StreamLayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamLayerViewMod extends Shortcut {
  
  @JSImport("esri/views/layers/StreamLayerView", JSImport.Namespace)
  @js.native
  val ^ : StreamLayerViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/StreamLayerView", JSImport.Namespace)
  @js.native
  /**
    * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html)
    */
  class Class () extends StreamLayerView {
    def this(properties: StreamLayerViewProperties) = this()
  }
  
  type _To = StreamLayerViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `streamLayerViewMod.foo` */
  override def _to: StreamLayerViewConstructor = ^
}
