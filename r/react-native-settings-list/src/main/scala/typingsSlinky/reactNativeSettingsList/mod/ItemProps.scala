package typingsSlinky.reactNativeSettingsList.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSettingsList.reactNativeSettingsListStrings.Both
import typingsSlinky.reactNativeSettingsList.reactNativeSettingsListStrings.Bottom
import typingsSlinky.reactNativeSettingsList.reactNativeSettingsListStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemProps extends js.Object {
  var arrowIcon: js.UndefOr[TagMod[Any]] = js.native
  var arrowStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var authPropsPW: js.UndefOr[js.Object] = js.native
  var authPropsUser: js.UndefOr[js.Object] = js.native
  /**
    * Individual background color. Can be globally set in the parent. Will become Deprecated
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /* Gives opens to hide specific borders */
  var borderHide: js.UndefOr[Top | Bottom | Both] = js.native
  /**
    * Editable Right Side Style
    */
  var editableTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Enable or disable the > arrow at the end of the setting item.
    * Default: true
    */
  var hasNavArrow: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable a Switch component
    */
  var hasSwitch: js.UndefOr[Boolean] = js.native
  /**
    * Icon displayed on the left of the settings item
    */
  var icon: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Allows for the item to become an auth item
    */
  var isAuth: js.UndefOr[Boolean] = js.native
  /**
    * Item Box Style
    */
  var itemBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var itemRef: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Individual item width.  Can be globally set in the parent.  Will become deprecated
    */
  var itemWidth: js.UndefOr[Double] = js.native
  /**
    * Item on long press callback.
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Item on press callback.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Right side content
    */
  var rightSideContent: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Right Side Style
    */
  var rightSideStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * On value change callback
    */
  var switchOnValueChange: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Switch props
    */
  var switchProps: js.UndefOr[js.Object] = js.native
  /**
    * Switch state
    */
  var switchState: js.UndefOr[Boolean] = js.native
  /**
    * Title being displayed
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Title Box Style
    */
  var titleBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Right side information on the setting item
    */
  var titleInfo: js.UndefOr[String] = js.native
  /**
    * If 'Bottom'; info is placed beneath the title
    */
  var titleInfoPosition: js.UndefOr[String] = js.native
  var titleInfoStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Individual underlay click color.  Can be globally set in the parent.
    */
  var underlayColor: js.UndefOr[String] = js.native
}

object ItemProps {
  @scala.inline
  def apply(): ItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemProps]
  }
  @scala.inline
  implicit class ItemPropsOps[Self <: ItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowStyle(value: StyleProp[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowStyle")(null)
        ret
    }
    @scala.inline
    def withAuthPropsPW(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authPropsPW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthPropsPW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authPropsPW")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthPropsUser(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authPropsUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthPropsUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authPropsUser")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderHide(value: Top | Bottom | Both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderHide")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditableTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableTextStyle")(null)
        ret
    }
    @scala.inline
    def withHasNavArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNavArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasNavArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNavArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSwitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSwitch")(js.undefined)
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
    def withIsAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withItemBoxStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBoxStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemBoxStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBoxStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemBoxStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBoxStyle")(null)
        ret
    }
    @scala.inline
    def withItemRef(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutItemRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
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
    def withRightSideContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSideContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightSideContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSideContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSideContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSideContent")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSideStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSideStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSideStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSideStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSideStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSideStyle")(null)
        ret
    }
    @scala.inline
    def withSwitchOnValueChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchOnValueChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSwitchOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchOnValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchState")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleBoxStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBoxStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleBoxStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBoxStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleBoxStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBoxStyle")(null)
        ret
    }
    @scala.inline
    def withTitleInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleInfoPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInfoPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleInfoPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInfoPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleInfoStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInfoStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleInfoStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInfoStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleInfoStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInfoStyle")(null)
        ret
    }
    @scala.inline
    def withTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(null)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(js.undefined)
        ret
    }
  }
  
}

