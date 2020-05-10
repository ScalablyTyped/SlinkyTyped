package typingsSlinky.reactToolbox.libDatePickerDatePickerMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactToolbox.libMod.ReactToolbox.Props
import typingsSlinky.reactToolbox.reactToolboxStrings.`zh-cn`
import typingsSlinky.reactToolbox.reactToolboxStrings.`zh-hk`
import typingsSlinky.reactToolbox.reactToolboxStrings.`zh-tw`
import typingsSlinky.reactToolbox.reactToolboxStrings.af
import typingsSlinky.reactToolbox.reactToolboxStrings.ar
import typingsSlinky.reactToolbox.reactToolboxStrings.be
import typingsSlinky.reactToolbox.reactToolboxStrings.bg
import typingsSlinky.reactToolbox.reactToolboxStrings.bn
import typingsSlinky.reactToolbox.reactToolboxStrings.bo
import typingsSlinky.reactToolbox.reactToolboxStrings.br
import typingsSlinky.reactToolbox.reactToolboxStrings.bs
import typingsSlinky.reactToolbox.reactToolboxStrings.ca
import typingsSlinky.reactToolbox.reactToolboxStrings.de
import typingsSlinky.reactToolbox.reactToolboxStrings.en
import typingsSlinky.reactToolbox.reactToolboxStrings.es
import typingsSlinky.reactToolbox.reactToolboxStrings.eu
import typingsSlinky.reactToolbox.reactToolboxStrings.fr
import typingsSlinky.reactToolbox.reactToolboxStrings.gl
import typingsSlinky.reactToolbox.reactToolboxStrings.it
import typingsSlinky.reactToolbox.reactToolboxStrings.no
import typingsSlinky.reactToolbox.reactToolboxStrings.pt
import typingsSlinky.reactToolbox.reactToolboxStrings.ru
import typingsSlinky.reactToolbox.reactToolboxStrings.ua
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerProps extends Props {
  /**
    * Allows to control if the picker should be shown from outside. Beware you should update the prop when the Dialog is closed.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Automatically selects a date upon clicking on a day
    * @default false
    */
  var autoOk: js.UndefOr[Boolean] = js.native
  /**
    * Label used for cancel button on Dialog.
    * @default "Cancel"
    */
  var cancelLabel: js.UndefOr[String] = js.native
  /**
    * An array of date objects which will be disabled in the calendar. All other dates will be enabled.
    */
  var disabledDates: js.UndefOr[js.Array[js.Date]] = js.native
  /**
    * An array of date objects which will be enabled in the calendar. All other dates will be disabled.
    */
  var enabledDates: js.UndefOr[js.Array[js.Date]] = js.native
  /**
    * Give an error node to display under the field.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * A key to identify an Icon from Material Design Icons or a custom Icon Element.
    */
  var icon: js.UndefOr[TagMod[Any]] = js.native
  /**
    * This class will be applied to Input component of DatePicker.
    */
  var inputClassName: js.UndefOr[String] = js.native
  /**
    * Function to format the date displayed on the input.
    */
  var inputFormat: js.UndefOr[js.Function] = js.native
  /**
    * The text string to use for the floating label element in the input component.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Sets locale for the Dialog.
    * @default "en"
    */
  var locale: js.UndefOr[
    de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale
  ] = js.native
  /**
    * Date object with the maximum selectable date.
    */
  var maxDate: js.UndefOr[js.Date] = js.native
  /**
    * Date object with the minimum selectable date.
    */
  var minDate: js.UndefOr[js.Date] = js.native
  /**
    * Name for the input field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Label used for 'OK' button on Dialog.
    * @default "Ok"
    */
  var okLabel: js.UndefOr[String] = js.native
  /**
    * Callback called when the picker value is changed.
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after dismissing the Dialog.
    */
  var onDismiss: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the ESC key is pressed with the overlay active.
    */
  var onEscKeyDown: js.UndefOr[js.Function] = js.native
  /**
    * Callback invoked on Input key press.
    */
  var onKeyPress: js.UndefOr[js.Function] = js.native
  /**
    * Callback to be invoked when the dialog overlay is clicked.
    */
  var onOverlayClick: js.UndefOr[js.Function] = js.native
  /**
    * The input element will be readonly and look like disabled.
    */
  var readonly: js.UndefOr[Boolean] = js.native
  /**
    * Used in case the input is required.
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Set week's first day to Sunday. Default week's first day is Monday.
    * @default false
    */
  var sundayFirstDayOfWeek: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[DatePickerTheme] = js.native
  /**
    * Date object with the currently selected date.
    */
  var value: js.UndefOr[js.Date | String] = js.native
}

object DatePickerProps {
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoOk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOk")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withInputClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFormat(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(
      value: de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOkLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEscKeyDown(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEscKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverlayClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOverlayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverlayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withSundayFirstDayOfWeek(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sundayFirstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSundayFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sundayFirstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: DatePickerTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Date | String): Self = {
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
  }
  
}

