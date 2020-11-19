package typingsSlinky.arcgisJsApi.attributionViewModelMod

import typingsSlinky.arcgisJsApi.esri.AttributionViewModel
import typingsSlinky.arcgisJsApi.esri.AttributionViewModelProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/widgets/Attribution/AttributionViewModel", JSImport.Namespace)
@js.native
/**
  * Provides the logic for the [Attribution](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html) widget. Displays attribution text for the layers in a map. The text displayed for the layers is either a list of data providers or sources as defined in the layer's custom attribution data, or the copyright text. The attribution is automatically updated based on layer visibility and map extent.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html)
  */
class Class () extends AttributionViewModel {
  def this(properties: AttributionViewModelProperties) = this()
}
