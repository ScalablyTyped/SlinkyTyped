package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ZoomViewModel
import typingsSlinky.arcgisJsApi.esri.ZoomViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.ZoomViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Zoom/ZoomViewModel", JSImport.Namespace)
  @js.native
  val ^ : ZoomViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Zoom/ZoomViewModel", JSImport.Namespace)
  @js.native
  class Class () extends ZoomViewModel {
    def this(properties: ZoomViewModelProperties) = this()
  }
  
  type _To = ZoomViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `zoomViewModelMod.foo` */
  override def _to: ZoomViewModelConstructor = ^
}
