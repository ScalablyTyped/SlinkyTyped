package typingsSlinky.antDesignReactNative.popoverMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.popoverStyleMod.PopoverStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverProps extends WithThemeStyles[PopoverStyle] {
  var disabled: js.UndefOr[Boolean] = js.native
  var onSelect: js.UndefOr[js.Function2[/* node */ js.Any, /* index */ js.UndefOr[Double], Unit]] = js.native
  var overlay: TagMod[Any] = js.native
  var placement: js.UndefOr[Placement | auto] = js.native
  var renderOverlayComponent: js.UndefOr[js.Function1[/* node */ TagMod[Any], TagMod[Any]]] = js.native
  var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object PopoverProps {
  @scala.inline
  def apply(): PopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverProps]
  }
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOnSelect(value: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Placement | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderOverlayComponent(value: /* node */ TagMod[Any] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOverlayComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderOverlayComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOverlayComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerStyle")(null)
        ret
    }
  }
  
}

