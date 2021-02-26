package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.SwipeViewModel
import typingsSlinky.arcgisJsApi.esri.SwipeViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.SwipeViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Swipe/SwipeViewModel", JSImport.Namespace)
  @js.native
  val ^ : SwipeViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Swipe/SwipeViewModel", JSImport.Namespace)
  @js.native
  class Class () extends SwipeViewModel {
    def this(properties: SwipeViewModelProperties) = this()
  }
  
  type _To = SwipeViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `swipeViewModelMod.foo` */
  override def _to: SwipeViewModelConstructor = ^
}
