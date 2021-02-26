package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.SliceViewModel
import typingsSlinky.arcgisJsApi.esri.SliceViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.SliceViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Slice/SliceViewModel", JSImport.Namespace)
  @js.native
  val ^ : SliceViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Slice/SliceViewModel", JSImport.Namespace)
  @js.native
  class Class () extends SliceViewModel {
    def this(properties: SliceViewModelProperties) = this()
  }
  
  type _To = SliceViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sliceViewModelMod.foo` */
  override def _to: SliceViewModelConstructor = ^
}
