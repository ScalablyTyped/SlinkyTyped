package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ClassedColorSliderViewModel
import typingsSlinky.arcgisJsApi.esri.ClassedColorSliderViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.ClassedColorSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classedColorSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ClassedColorSlider/ClassedColorSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : ClassedColorSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ClassedColorSlider/ClassedColorSliderViewModel", JSImport.Namespace)
  @js.native
  class Class () extends ClassedColorSliderViewModel {
    def this(properties: ClassedColorSliderViewModelProperties) = this()
  }
  
  type _To = ClassedColorSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `classedColorSliderViewModelMod.foo` */
  override def _to: ClassedColorSliderViewModelConstructor = ^
}
