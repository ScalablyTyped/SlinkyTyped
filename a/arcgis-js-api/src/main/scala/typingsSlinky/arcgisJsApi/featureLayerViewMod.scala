package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FeatureLayerView
import typingsSlinky.arcgisJsApi.esri.FeatureLayerViewConstructor
import typingsSlinky.arcgisJsApi.esri.FeatureLayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureLayerViewMod extends Shortcut {
  
  @JSImport("esri/views/layers/FeatureLayerView", JSImport.Namespace)
  @js.native
  val ^ : FeatureLayerViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/FeatureLayerView", JSImport.Namespace)
  @js.native
  /**
    * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html)
    */
  class Class () extends FeatureLayerView {
    def this(properties: FeatureLayerViewProperties) = this()
  }
  
  type _To = FeatureLayerViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureLayerViewMod.foo` */
  override def _to: FeatureLayerViewConstructor = ^
}
