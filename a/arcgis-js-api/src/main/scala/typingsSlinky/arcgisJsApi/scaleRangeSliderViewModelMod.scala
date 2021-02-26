package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ScaleRangeSliderViewModel
import typingsSlinky.arcgisJsApi.esri.ScaleRangeSliderViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.ScaleRangeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleRangeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/ScaleRangeSlider/ScaleRangeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : ScaleRangeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ScaleRangeSlider/ScaleRangeSliderViewModel", JSImport.Namespace)
  @js.native
  class Class () extends ScaleRangeSliderViewModel {
    def this(properties: ScaleRangeSliderViewModelProperties) = this()
  }
  
  type _To = ScaleRangeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `scaleRangeSliderViewModelMod.foo` */
  override def _to: ScaleRangeSliderViewModelConstructor = ^
}
