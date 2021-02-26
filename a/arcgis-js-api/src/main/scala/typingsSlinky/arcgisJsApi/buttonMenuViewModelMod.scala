package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ButtonMenuViewModel
import typingsSlinky.arcgisJsApi.esri.ButtonMenuViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.ButtonMenuViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMenuViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/Grid/support/ButtonMenuViewModel", JSImport.Namespace)
  @js.native
  val ^ : ButtonMenuViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/Grid/support/ButtonMenuViewModel", JSImport.Namespace)
  @js.native
  class Class () extends ButtonMenuViewModel {
    def this(properties: ButtonMenuViewModelProperties) = this()
  }
  
  type _To = ButtonMenuViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buttonMenuViewModelMod.foo` */
  override def _to: ButtonMenuViewModelConstructor = ^
}
