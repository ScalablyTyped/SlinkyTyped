package typingsSlinky.reactNativeCheckBox.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBoxProps extends js.Object {
  var checkBoxColor: js.UndefOr[String] = js.native
  var checkedCheckBoxColor: js.UndefOr[String] = js.native
  var checkedImage: js.UndefOr[ReactElement] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var isChecked: Boolean = js.native
  var leftText: js.UndefOr[String] = js.native
  var leftTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var leftTextView: js.UndefOr[TagMod[Any]] = js.native
  var rightText: js.UndefOr[String] = js.native
  var rightTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var rightTextView: js.UndefOr[TagMod[Any]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var unCheckedImage: js.UndefOr[ReactElement] = js.native
  var uncheckedCheckBoxColor: js.UndefOr[String] = js.native
  def onClick(): Unit = js.native
}

object CheckBoxProps {
  @scala.inline
  def apply(isChecked: Boolean, onClick: () => Unit): CheckBoxProps = {
    val __obj = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[CheckBoxProps]
  }
  @scala.inline
  implicit class CheckBoxPropsOps[Self <: CheckBoxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckBoxColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBoxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckBoxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBoxColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedCheckBoxColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedCheckBoxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedCheckBoxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedCheckBoxColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedImage(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedImage")(js.undefined)
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
    def withLeftText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftText")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTextStyle")(null)
        ret
    }
    @scala.inline
    def withLeftTextViewReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTextView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftTextView(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTextView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftTextView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTextView")(js.undefined)
        ret
    }
    @scala.inline
    def withRightText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightText")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTextStyle")(null)
        ret
    }
    @scala.inline
    def withRightTextViewReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTextView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightTextView(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTextView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTextView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTextView")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withUnCheckedImage(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unCheckedImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnCheckedImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unCheckedImage")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedCheckBoxColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedCheckBoxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedCheckBoxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedCheckBoxColor")(js.undefined)
        ret
    }
  }
  
}

