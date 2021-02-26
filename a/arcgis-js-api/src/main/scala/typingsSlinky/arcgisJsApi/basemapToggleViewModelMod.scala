package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BasemapToggleViewModel
import typingsSlinky.arcgisJsApi.esri.BasemapToggleViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.BasemapToggleViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapToggleViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapToggle/BasemapToggleViewModel", JSImport.Namespace)
  @js.native
  val ^ : BasemapToggleViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapToggle/BasemapToggleViewModel", JSImport.Namespace)
  @js.native
  class Class () extends BasemapToggleViewModel {
    def this(properties: BasemapToggleViewModelProperties) = this()
  }
  
  type _To = BasemapToggleViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapToggleViewModelMod.foo` */
  override def _to: BasemapToggleViewModelConstructor = ^
}
