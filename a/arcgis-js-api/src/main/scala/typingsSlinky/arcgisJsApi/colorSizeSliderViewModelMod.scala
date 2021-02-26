package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ColorSizeSliderViewModel
import typingsSlinky.arcgisJsApi.esri.ColorSizeSliderViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.ColorSizeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorSizeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ColorSizeSlider/ColorSizeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : ColorSizeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ColorSizeSlider/ColorSizeSliderViewModel", JSImport.Namespace)
  @js.native
  class Class () extends ColorSizeSliderViewModel {
    def this(properties: ColorSizeSliderViewModelProperties) = this()
  }
  
  type _To = ColorSizeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colorSizeSliderViewModelMod.foo` */
  override def _to: ColorSizeSliderViewModelConstructor = ^
}
