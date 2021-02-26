package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintViewModelProperties extends StObject {
  
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedFormats)
    */
  var allowedFormats: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedLayouts)
    */
  var allowedLayouts: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#printServiceUrl)
    */
  var printServiceUrl: js.UndefOr[String] = js.native
  
  /**
    * When `true`, scale is used in the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#scaleEnabled)
    */
  var scaleEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#updateDelay)
    */
  var updateDelay: js.UndefOr[Double] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}
object PrintViewModelProperties {
  
  @scala.inline
  def apply(): PrintViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintViewModelProperties]
  }
  
  @scala.inline
  implicit class PrintViewModelPropertiesMutableBuilder[Self <: PrintViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedFormats(value: String | js.Array[String]): Self = StObject.set(x, "allowedFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedFormatsUndefined: Self = StObject.set(x, "allowedFormats", js.undefined)
    
    @scala.inline
    def setAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "allowedFormats", js.Array(value :_*))
    
    @scala.inline
    def setAllowedLayouts(value: String | js.Array[String]): Self = StObject.set(x, "allowedLayouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedLayoutsUndefined: Self = StObject.set(x, "allowedLayouts", js.undefined)
    
    @scala.inline
    def setAllowedLayoutsVarargs(value: String*): Self = StObject.set(x, "allowedLayouts", js.Array(value :_*))
    
    @scala.inline
    def setPrintServiceUrl(value: String): Self = StObject.set(x, "printServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintServiceUrlUndefined: Self = StObject.set(x, "printServiceUrl", js.undefined)
    
    @scala.inline
    def setScaleEnabled(value: Boolean): Self = StObject.set(x, "scaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleEnabledUndefined: Self = StObject.set(x, "scaleEnabled", js.undefined)
    
    @scala.inline
    def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
