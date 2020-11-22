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
trait ScaleBarProperties extends WidgetProperties {
  
  /**
    * The style for the scale bar.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#style)
    */
  var style: js.UndefOr[ruler | line] = js.native
  
  /**
    * Units to use for the scale bar.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#unit)
    */
  var unit: js.UndefOr[`non-metric` | metric | dual] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#viewModel)
    */
  var viewModel: js.UndefOr[ScaleBarViewModelProperties] = js.native
}
object ScaleBarProperties {
  
  @scala.inline
  def apply(): ScaleBarProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleBarProperties]
  }
  
  @scala.inline
  implicit class ScaleBarPropertiesOps[Self <: ScaleBarProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStyle(value: ruler | line): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUnit(value: `non-metric` | metric | dual): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: ScaleBarViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
