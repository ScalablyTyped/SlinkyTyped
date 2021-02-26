package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PrintViewModel
import typingsSlinky.arcgisJsApi.esri.PrintViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.PrintViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Print/PrintViewModel", JSImport.Namespace)
  @js.native
  val ^ : PrintViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Print/PrintViewModel", JSImport.Namespace)
  @js.native
  class Class () extends PrintViewModel {
    def this(properties: PrintViewModelProperties) = this()
  }
  
  type _To = PrintViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `printViewModelMod.foo` */
  override def _to: PrintViewModelConstructor = ^
}
