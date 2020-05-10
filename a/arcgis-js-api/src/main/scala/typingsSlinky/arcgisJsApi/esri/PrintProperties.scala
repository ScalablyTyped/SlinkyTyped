package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintProperties extends WidgetProperties {
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service formats are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedFormats` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedFormats)
    *
    * @default "all"
    */
  var allowedFormats: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service layouts are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedLayouts` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#allowedLayouts)
    *
    * @default "all"
    */
  var allowedLayouts: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#printServiceUrl)
    */
  var printServiceUrl: js.UndefOr[String] = js.native
  /**
    * Defines the layout template options used by the [Print](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html) widget to generate the print page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#templateOptions)
    */
  var templateOptions: js.UndefOr[TemplateOptionsProperties] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [PrintViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#viewModel)
    */
  var viewModel: js.UndefOr[PrintViewModelProperties] = js.native
}

object PrintProperties {
  @scala.inline
  def apply(): PrintProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintProperties]
  }
  @scala.inline
  implicit class PrintPropertiesOps[Self <: PrintProperties] (val x: Self) extends AnyVal {
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
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
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
    def withTemplateOptions(value: TemplateOptionsProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateOptions")(js.undefined)
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
    @scala.inline
    def withViewModel(value: PrintViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
  }
  
}

