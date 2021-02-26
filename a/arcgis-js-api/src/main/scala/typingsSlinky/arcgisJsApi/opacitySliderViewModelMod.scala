package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.OpacitySliderViewModel
import typingsSlinky.arcgisJsApi.esri.OpacitySliderViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.OpacitySliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opacitySliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/OpacitySlider/OpacitySliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : OpacitySliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/OpacitySlider/OpacitySliderViewModel", JSImport.Namespace)
  @js.native
  class Class () extends OpacitySliderViewModel {
    def this(properties: OpacitySliderViewModelProperties) = this()
  }
  
  type _To = OpacitySliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `opacitySliderViewModelMod.foo` */
  override def _to: OpacitySliderViewModelConstructor = ^
}
