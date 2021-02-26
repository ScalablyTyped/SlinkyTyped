package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.HeatmapSlider
import typingsSlinky.arcgisJsApi.esri.HeatmapSliderConstructor
import typingsSlinky.arcgisJsApi.esri.HeatmapSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/HeatmapSlider", JSImport.Namespace)
  @js.native
  val ^ : HeatmapSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/HeatmapSlider", JSImport.Namespace)
  @js.native
  /**
    * The HeatmapSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html)
    */
  class Class () extends HeatmapSlider {
    def this(properties: HeatmapSliderProperties) = this()
  }
  
  type _To = HeatmapSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `heatmapSliderMod.foo` */
  override def _to: HeatmapSliderConstructor = ^
}
