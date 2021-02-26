package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.LayerListViewModel
import typingsSlinky.arcgisJsApi.esri.LayerListViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.LayerListViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerListViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/LayerList/LayerListViewModel", JSImport.Namespace)
  @js.native
  val ^ : LayerListViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/LayerList/LayerListViewModel", JSImport.Namespace)
  @js.native
  class Class () extends LayerListViewModel {
    def this(properties: LayerListViewModelProperties) = this()
  }
  
  type _To = LayerListViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `layerListViewModelMod.foo` */
  override def _to: LayerListViewModelConstructor = ^
}
