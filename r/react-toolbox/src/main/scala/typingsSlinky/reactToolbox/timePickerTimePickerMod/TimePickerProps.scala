package typingsSlinky.reactToolbox.timePickerTimePickerMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactToolbox.reactToolboxStrings.`24hr`
import typingsSlinky.reactToolbox.reactToolboxStrings.ampm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerProps
  extends /**
  * Additional attributes passed to composed component.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Whether time picker is active.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Label used for cancel button.
    * @default "Cancel"
    */
  var cancelLabel: js.UndefOr[String] = js.native
  /**
    * Provide error text which will be displayed under the field.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Format to display the clock. It can be 24hr or ampm.
    * @default "24hr"
    */
  var format: js.UndefOr[`24hr` | ampm] = js.native
  /**
    * A key to identify an Icon from Material Design Icons or a custom Icon Element.
    */
  var icon: js.UndefOr[TagMod[Any]] = js.native
  /**
    * This class will be applied to Input component of TimePicker.
    */
  var inputClassName: js.UndefOr[String] = js.native
  /**
    * The text string to use for the floating label element in the input component.
    */
  var label: js.UndefOr[String] = js.native
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
    * Callback fired on Input click.
    */
  var onClick: js.UndefOr[js.Function] = js.native
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
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TimePickerTheme] = js.native
  /**
    * Datetime object with currrently selected time.
    */
  var value: js.UndefOr[js.Date] = js.native
}

object TimePickerProps {
  @scala.inline
  def apply(): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProps]
  }
  @scala.inline
  implicit class TimePickerPropsOps[Self <: TimePickerProps] (val x: Self) extends AnyVal {
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
    def withFormat(value: `24hr` | ampm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
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
    def withOnClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
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
    def withTheme(value: TimePickerTheme): Self = {
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
    def withValue(value: js.Date): Self = {
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

