package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintViewModelProperties extends js.Object {
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service formats are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedFormats` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedFormats)
    *
    * @default "all"
    */
  var allowedFormats: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service layouts are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedLayouts` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedLayouts)
    *
    * @default "all"
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
    *
    * @default false
    */
  var scaleEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#updateDelay)
    *
    * @default 1000
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
  implicit class PrintViewModelPropertiesOps[Self <: PrintViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedFormats(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedLayouts(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedLayouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedLayouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedLayouts")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printServiceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

