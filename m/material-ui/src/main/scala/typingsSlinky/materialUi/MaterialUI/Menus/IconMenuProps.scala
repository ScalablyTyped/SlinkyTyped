package typingsSlinky.materialUi.MaterialUI.Menus

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconMenuProps extends js.Object {
  // <Menu/> is the element that get the 'other' properties
  var anchorOrigin: js.UndefOr[origin] = js.native
  var animated: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[ReactComponentClass[PopoverAnimationProps]] = js.native
  // Other properties from <Menu/>
  var autoWidth: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var clickCloseDelay: js.UndefOr[Double] = js.native
  var desktop: js.UndefOr[Boolean] = js.native
  var disableAutoFocus: js.UndefOr[Boolean] = js.native
  var iconButtonElement: ReactElement = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.native
  var listStyle: js.UndefOr[CSSProperties] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var menuStyle: js.UndefOr[CSSProperties] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Event, js.Object], /* itemValue */ js.Any | js.Array[_], Unit]
  ] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, js.Object], Unit]] = js.native
  var onItemClick: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Event, js.Object], ReactComponentClass[MenuItemProps], Unit]
  ] = js.native
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var targetOrigin: js.UndefOr[origin] = js.native
  var useLayerForClickAway: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[js.Any | js.Array[_]] = js.native
}

object IconMenuProps {
  @scala.inline
  def apply(iconButtonElement: ReactElement): IconMenuProps = {
    val __obj = js.Dynamic.literal(iconButtonElement = iconButtonElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconMenuProps]
  }
  @scala.inline
  implicit class IconMenuPropsOps[Self <: IconMenuProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconButtonElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconButtonElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorOrigin(value: origin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: ReactComponentClass[PopoverAnimationProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClickCloseDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickCloseDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickCloseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickCloseDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInitiallyKeyboardFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiallyKeyboardFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiallyKeyboardFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiallyKeyboardFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* e */ SyntheticEvent[Event, js.Object], /* itemValue */ js.Any | js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* e */ SyntheticEvent[Event, js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(value: (/* e */ SyntheticEvent[Event, js.Object], ReactComponentClass[MenuItemProps]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyboardFocus(value: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeyboardFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: SyntheticMouseEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: SyntheticMouseEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: SyntheticMouseEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: SyntheticMouseEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRequestChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestChange")(js.undefined)
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
    def withStyle(value: CSSProperties): Self = {
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
    def withTargetOrigin(value: origin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLayerForClickAway(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLayerForClickAway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLayerForClickAway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLayerForClickAway")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any | js.Array[_]): Self = {
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

