package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`1`
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`2`
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`3`
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiStrings.dynamic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps extends js.Object {
  var centerElement: ReactElement | String | ListItemCenterElement = js.native
  var dense: js.UndefOr[Boolean] = js.native
  var divider: js.UndefOr[Boolean] = js.native
  var leftElement: js.UndefOr[ReactElement | String] = js.native
  var numberOfLines: js.UndefOr[`1` | `2` | `3` | dynamic] = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onPressValue: js.UndefOr[js.Any] = js.native
  var onRightElementPress: js.UndefOr[js.Function0[Unit]] = js.native
  var rightElement: js.UndefOr[ReactElement | String] = js.native
  var style: js.UndefOr[ListItemStyle] = js.native
  var testID: js.UndefOr[String] = js.native
}

object ListItemProps {
  @scala.inline
  def apply(centerElement: ReactElement | String | ListItemCenterElement): ListItemProps = {
    val __obj = js.Dynamic.literal(centerElement = centerElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterElement(value: ReactElement | String | ListItemCenterElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDense(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(js.undefined)
        ret
    }
    @scala.inline
    def withDivider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftElement(value: ReactElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElement")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfLines(value: `1` | `2` | `3` | dynamic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPressValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRightElementPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightElementPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRightElementPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightElementPress")(js.undefined)
        ret
    }
    @scala.inline
    def withRightElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightElement(value: ReactElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ListItemStyle): Self = {
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
    def withTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(js.undefined)
        ret
    }
  }
  
}

