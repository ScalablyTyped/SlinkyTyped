package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ClassedColorSlider
import typingsSlinky.arcgisJsApi.esri.ClassedColorSliderConstructor
import typingsSlinky.arcgisJsApi.esri.ClassedColorSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classedColorSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ClassedColorSlider", JSImport.Namespace)
  @js.native
  val ^ : ClassedColorSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ClassedColorSlider", JSImport.Namespace)
  @js.native
  /**
    * The ClassedColorSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with color in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html)
    */
  class Class () extends ClassedColorSlider {
    def this(properties: ClassedColorSliderProperties) = this()
  }
  
  type _To = ClassedColorSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `classedColorSliderMod.foo` */
  override def _to: ClassedColorSliderConstructor = ^
}
