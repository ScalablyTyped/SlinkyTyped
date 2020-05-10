package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerProperties extends WidgetProperties {
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#value)
    */
  var value: js.UndefOr[js.Any] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [TimePickerViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePickerViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#viewModel)
    */
  var viewModel: js.UndefOr[TimePickerViewModel] = js.native
}

object TimePickerProperties {
  @scala.inline
  def apply(): TimePickerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProperties]
  }
  @scala.inline
  implicit class TimePickerPropertiesOps[Self <: TimePickerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: TimePickerViewModel): Self = {
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

