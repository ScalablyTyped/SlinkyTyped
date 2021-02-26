package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ScaleBarViewModel
import typingsSlinky.arcgisJsApi.esri.ScaleBarViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.ScaleBarViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleBarViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/ScaleBar/ScaleBarViewModel", JSImport.Namespace)
  @js.native
  val ^ : ScaleBarViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ScaleBar/ScaleBarViewModel", JSImport.Namespace)
  @js.native
  class Class () extends ScaleBarViewModel {
    def this(properties: ScaleBarViewModelProperties) = this()
  }
  
  type _To = ScaleBarViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `scaleBarViewModelMod.foo` */
  override def _to: ScaleBarViewModelConstructor = ^
}
