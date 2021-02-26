package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.HomeViewModel
import typingsSlinky.arcgisJsApi.esri.HomeViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.HomeViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object homeViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Home/HomeViewModel", JSImport.Namespace)
  @js.native
  val ^ : HomeViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Home/HomeViewModel", JSImport.Namespace)
  @js.native
  class Class () extends HomeViewModel {
    def this(properties: HomeViewModelProperties) = this()
  }
  
  type _To = HomeViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `homeViewModelMod.foo` */
  override def _to: HomeViewModelConstructor = ^
}
