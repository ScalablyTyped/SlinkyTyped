package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderViewModel
import typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classedSizeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider/ClassedSizeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : ClassedSizeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider/ClassedSizeSliderViewModel", JSImport.Namespace)
  @js.native
  class Class () extends ClassedSizeSliderViewModel {
    def this(properties: ClassedSizeSliderViewModelProperties) = this()
  }
  
  type _To = ClassedSizeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `classedSizeSliderViewModelMod.foo` */
  override def _to: ClassedSizeSliderViewModelConstructor = ^
}
