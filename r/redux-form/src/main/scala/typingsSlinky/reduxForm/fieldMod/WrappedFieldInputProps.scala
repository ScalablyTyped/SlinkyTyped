package typingsSlinky.reduxForm.fieldMod

import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFieldInputProps extends CommonFieldInputProps {
  var checked: js.UndefOr[Boolean] = js.native
  var onBlur: EventOrValueHandler[SyntheticFocusEvent[_]] = js.native
  var onChange: EventOrValueHandler[ChangeEvent[_]] = js.native
  var value: js.Any = js.native
}

object WrappedFieldInputProps {
  @scala.inline
  def apply(
    name: String,
    onBlur: EventOrValueHandler[SyntheticFocusEvent[_]],
    onChange: EventOrValueHandler[ChangeEvent[_]],
    onDragStart: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onDrop: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onFocus: (SyntheticFocusEvent[_], /* name */ js.UndefOr[String]) => Unit,
    value: js.Any
  ): WrappedFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldInputProps]
  }
  @scala.inline
  implicit class WrappedFieldInputPropsOps[Self <: WrappedFieldInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnBlur(value: EventOrValueHandler[SyntheticFocusEvent[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: EventOrValueHandler[ChangeEvent[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
  }
  
}

