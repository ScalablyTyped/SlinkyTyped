package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.SizeSlider
import typingsSlinky.arcgisJsApi.esri.SizeSliderConstructor
import typingsSlinky.arcgisJsApi.esri.SizeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/SizeSlider", JSImport.Namespace)
  @js.native
  val ^ : SizeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/SizeSlider", JSImport.Namespace)
  @js.native
  /**
    * The SizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html)
    */
  class Class () extends SizeSlider {
    def this(properties: SizeSliderProperties) = this()
  }
  
  type _To = SizeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sizeSliderMod.foo` */
  override def _to: SizeSliderConstructor = ^
}
