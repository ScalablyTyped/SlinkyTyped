package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.acres
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ares
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hectares
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.imperial
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.metric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaMeasurement3DViewModelProperties extends js.Object {
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#unit)
    */
  var unit: js.UndefOr[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.native
  
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#unitOptions)
    */
  var unitOptions: js.UndefOr[
    js.Array[
      metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
    ]
  ] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
}
object AreaMeasurement3DViewModelProperties {
  
  @scala.inline
  def apply(): AreaMeasurement3DViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaMeasurement3DViewModelProperties]
  }
  
  @scala.inline
  implicit class AreaMeasurement3DViewModelPropertiesOps[Self <: AreaMeasurement3DViewModelProperties] (val x: Self) extends AnyVal {
    
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
    def setUnit(
      value: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
    ): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setUnitOptionsVarargs(
      value: (metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares)*
    ): Self = this.set("unitOptions", js.Array(value :_*))
    
    @scala.inline
    def setUnitOptions(
      value: js.Array[
          metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
        ]
    ): Self = this.set("unitOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitOptions: Self = this.set("unitOptions", js.undefined)
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
