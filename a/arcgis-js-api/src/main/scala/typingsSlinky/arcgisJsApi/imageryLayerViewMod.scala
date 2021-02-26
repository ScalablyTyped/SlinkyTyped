package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ImageryLayerView
import typingsSlinky.arcgisJsApi.esri.ImageryLayerViewConstructor
import typingsSlinky.arcgisJsApi.esri.ImageryLayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageryLayerViewMod extends Shortcut {
  
  @JSImport("esri/views/layers/ImageryLayerView", JSImport.Namespace)
  @js.native
  val ^ : ImageryLayerViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/ImageryLayerView", JSImport.Namespace)
  @js.native
  /**
    * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html)
    */
  class Class () extends ImageryLayerView {
    def this(properties: ImageryLayerViewProperties) = this()
  }
  
  type _To = ImageryLayerViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageryLayerViewMod.foo` */
  override def _to: ImageryLayerViewConstructor = ^
}
