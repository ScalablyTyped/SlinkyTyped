package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ClassedSizeSlider
import typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderConstructor
import typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classedSizeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider", JSImport.Namespace)
  @js.native
  val ^ : ClassedSizeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider", JSImport.Namespace)
  @js.native
  /**
    * The ClassedSizeSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with size in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html)
    */
  class Class () extends ClassedSizeSlider {
    def this(properties: ClassedSizeSliderProperties) = this()
  }
  
  type _To = ClassedSizeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `classedSizeSliderMod.foo` */
  override def _to: ClassedSizeSliderConstructor = ^
}
