package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`non-metric`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dual
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.line
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.metric
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ruler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleBar extends Widget_ {
  
  /**
    * The style for the scale bar.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#style)
    */
  var style: ruler | line = js.native
  
  /**
    * Units to use for the scale bar.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#unit)
    */
  var unit: `non-metric` | metric | dual = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#view)
    */
  var view: MapView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#viewModel)
    */
  var viewModel: ScaleBarViewModel = js.native
}
