package typingsSlinky.blueprintjsCore.radioGroupMod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.blueprintjsCore.propsMod.IOptionProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadioGroupProps extends IProps {
  /**
    * Whether the group and _all_ its radios are disabled.
    * Individual radios can be disabled using their `disabled` prop.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the radio buttons are to be displayed inline horizontally.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /** Optional label text to display above the radio buttons. */
  var label: js.UndefOr[String] = js.native
  /**
    * Name of the group, used to link radio buttons together in HTML.
    * If omitted, a unique name will be generated internally.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Array of options to render in the group. This prop is mutually exclusive
    * with `children`: either provide an array of `IOptionProps` objects or
    * provide `<Radio>` children elements.
    */
  var options: js.UndefOr[js.Array[IOptionProps]] = js.native
  /** Value of the selected radio. The child with this value will be `:checked`. */
  var selectedValue: js.UndefOr[String | Double] = js.native
  /**
    * Callback invoked when the currently selected radio changes.
    * Use `event.currentTarget.value` to read the currently selected value.
    * This prop is required because this component only supports controlled usage.
    */
  def onChange(event: SyntheticEvent[EventTarget with HTMLInputElement, Event_]): Unit = js.native
}

object IRadioGroupProps {
  @scala.inline
  def apply(onChange: SyntheticEvent[EventTarget with HTMLInputElement, Event_] => Unit): IRadioGroupProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[IRadioGroupProps]
  }
  @scala.inline
  implicit class IRadioGroupPropsOps[Self <: IRadioGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
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
    def withOptions(value: js.Array[IOptionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(js.undefined)
        ret
    }
  }
  
}

