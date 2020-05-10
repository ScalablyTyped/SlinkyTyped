package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.SwitchProperties
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.TouchableHighlightProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.PartialAvatarProps
import typingsSlinky.reactNativeElements.PartialIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps extends TouchableHighlightProps {
  var Component: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var ViewComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var badge: js.UndefOr[BadgeProps] = js.native
  var bottomDivider: js.UndefOr[Boolean] = js.native
  var buttonGroup: js.UndefOr[ButtonGroupProps] = js.native
  var checkBox: js.UndefOr[CheckBoxProps] = js.native
  var checkmark: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.native
  var chevron: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var input: js.UndefOr[InputProps] = js.native
  var leftAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.native
  var leftElement: js.UndefOr[ReactElement] = js.native
  var leftIcon: js.UndefOr[PartialIconProps | ReactElement] = js.native
  var pad: js.UndefOr[Double] = js.native
  var rightAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.native
  var rightContentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var rightElement: js.UndefOr[ReactElement] = js.native
  var rightIcon: js.UndefOr[PartialIconProps | ReactElement] = js.native
  var rightSubtitle: js.UndefOr[String | ReactElement] = js.native
  var rightSubtitleProps: js.UndefOr[TextProperties] = js.native
  var rightSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var rightTitle: js.UndefOr[String | ReactElement] = js.native
  var rightTitleProps: js.UndefOr[TextProperties] = js.native
  var rightTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var scaleProps: js.UndefOr[ScaleProps] = js.native
  var subtitle: js.UndefOr[String | ReactElement] = js.native
  var subtitleProps: js.UndefOr[TextProperties] = js.native
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var switch: js.UndefOr[SwitchProperties] = js.native
  var title: js.UndefOr[String | ReactElement] = js.native
  var titleProps: js.UndefOr[TextProperties] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var topDivider: js.UndefOr[Boolean] = js.native
}

object ListItemProps {
  @scala.inline
  def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(js.undefined)
        ret
    }
    @scala.inline
    def withViewComponentFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewComponentComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: BadgeProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomDivider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomDivider")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonGroup(value: ButtonGroupProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckBox(value: CheckBoxProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBox")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckmarkReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckmark(value: Boolean | PartialIconProps | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmark")(js.undefined)
        ret
    }
    @scala.inline
    def withChevronReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChevron(value: Boolean | PartialIconProps | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChevron: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevron")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withContentContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(null)
        ret
    }
    @scala.inline
    def withDisabledStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(null)
        ret
    }
    @scala.inline
    def withInput(value: InputProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftAvatarReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftAvatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftAvatar(value: PartialAvatarProps | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftAvatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftAvatar")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftElement(value: ReactElement): Self = {
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
    def withLeftIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIcon(value: PartialIconProps | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withPad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(js.undefined)
        ret
    }
    @scala.inline
    def withRightAvatarReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightAvatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightAvatar(value: PartialAvatarProps | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightAvatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightAvatar")(js.undefined)
        ret
    }
    @scala.inline
    def withRightContentContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightContentContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightContentContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentContainerStyle")(null)
        ret
    }
    @scala.inline
    def withRightElement(value: ReactElement): Self = {
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
    def withRightIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightIcon(value: PartialIconProps | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSubtitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightSubtitle(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSubtitleProps(value: TextProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSubtitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSubtitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSubtitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSubtitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitleStyle")(null)
        ret
    }
    @scala.inline
    def withRightTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightTitle(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTitleProps(value: TextProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitleStyle")(null)
        ret
    }
    @scala.inline
    def withScaleProps(value: ScaleProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleProps(value: TextProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleStyle")(null)
        ret
    }
    @scala.inline
    def withSwitch(value: SwitchProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | ReactElement): Self = {
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
    def withTitleProps(value: TextProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(js.undefined)
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
    def withTopDivider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topDivider")(js.undefined)
        ret
    }
  }
  
}

