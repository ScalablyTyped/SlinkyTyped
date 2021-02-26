package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.AttributionViewModel
import typingsSlinky.arcgisJsApi.esri.AttributionViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.AttributionViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributionViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Attribution/AttributionViewModel", JSImport.Namespace)
  @js.native
  val ^ : AttributionViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Attribution/AttributionViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Attribution](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html)
    */
  class Class () extends AttributionViewModel {
    def this(properties: AttributionViewModelProperties) = this()
  }
  
  type _To = AttributionViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `attributionViewModelMod.foo` */
  override def _to: AttributionViewModelConstructor = ^
}
