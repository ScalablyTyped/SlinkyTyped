package typingsSlinky.materialUi.MaterialUI.List

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.materialUi.MaterialUI.EnhancedButtonProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps extends EnhancedButtonProps {
  // <EnhancedButton/> is the element that get the 'other' properties
  var autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.native
  var hoverColor: js.UndefOr[String] = js.native
  var initiallyOpen: js.UndefOr[Boolean] = js.native
  var innerDivStyle: js.UndefOr[CSSProperties] = js.native
  var insetChildren: js.UndefOr[Boolean] = js.native
  var leftAvatar: js.UndefOr[ReactElement] = js.native
  var leftCheckbox: js.UndefOr[ReactElement] = js.native
  var leftIcon: js.UndefOr[ReactElement] = js.native
  var nestedItems: js.UndefOr[js.Array[ReactElement]] = js.native
  var nestedLevel: js.UndefOr[Double] = js.native
  var nestedListStyle: js.UndefOr[CSSProperties] = js.native
  var onNestedListToggle: js.UndefOr[js.Function1[/* item */ ListItem, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var primaryText: js.UndefOr[TagMod[Any]] = js.native
  var primaryTogglesNestedList: js.UndefOr[Boolean] = js.native
  var rightAvatar: js.UndefOr[ReactElement] = js.native
  var rightIcon: js.UndefOr[ReactElement] = js.native
  var rightIconButton: js.UndefOr[ReactElement] = js.native
  var rightToggle: js.UndefOr[ReactElement] = js.native
  var secondaryText: js.UndefOr[TagMod[Any]] = js.native
  var secondaryTextLines: js.UndefOr[Double] = js.native
  var value: js.UndefOr[js.Any] = js.native
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
    def withAutoGenerateNestedIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateNestedIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGenerateNestedIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateNestedIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withInitiallyOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiallyOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiallyOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiallyOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerDivStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerDivStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerDivStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerDivStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInsetChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insetChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsetChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insetChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftAvatar(value: ReactElement): Self = {
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
    def withLeftCheckbox(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIcon(value: ReactElement): Self = {
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
    def withNestedItems(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedListStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedListStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedListStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedListStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNestedListToggle(value: /* item */ ListItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNestedListToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNestedListToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNestedListToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryTogglesNestedList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryTogglesNestedList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryTogglesNestedList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryTogglesNestedList")(js.undefined)
        ret
    }
    @scala.inline
    def withRightAvatar(value: ReactElement): Self = {
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
    def withRightIcon(value: ReactElement): Self = {
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
    def withRightIconButton(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIconButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIconButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIconButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRightToggle(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryTextLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryTextLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextLines")(js.undefined)
        ret
    }
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
  }
  
}

