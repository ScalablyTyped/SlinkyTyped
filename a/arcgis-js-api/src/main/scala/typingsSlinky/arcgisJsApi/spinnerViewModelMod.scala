package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Accessor
import typingsSlinky.arcgisJsApi.esri.SpinnerViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.SpinnerViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Spinner/SpinnerViewModel", JSImport.Namespace)
  @js.native
  val ^ : SpinnerViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Spinner/SpinnerViewModel", JSImport.Namespace)
  @js.native
  class Class () extends Accessor {
    def this(properties: SpinnerViewModelProperties) = this()
  }
  
  type _To = SpinnerViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `spinnerViewModelMod.foo` */
  override def _to: SpinnerViewModelConstructor = ^
}
