package typingsSlinky.reactOnsenui

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.collapse
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.default
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.landscape
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.left
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.overlay
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.portrait
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.right
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.split
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  side ? :'left' | 'right',   collapse ? :'portrait' | 'landscape' | boolean,   isOpen ? :boolean,   onOpen ? :(e ? : std.Event): void,   onPreOpen ? :(e ? : std.Event): void,   onPreClose ? :(e ? : std.Event): void,   onModeChange ? :(e ? : std.Event): void,   onClose ? :(e ? : std.Event): void,   swipeable ? :boolean,   swipeTargetWidth ? :number,   width ? :number,   animation ? :'overlay' | 'default',   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions,   openThreshold ? :number,   mode ? :'collapse' | 'split'} */
@js.native
trait HTMLAttributesidclassNameAnimation extends js.Object {
  var animation: js.UndefOr[overlay | default] = js.native
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  var className: js.UndefOr[String] = js.native
  var collapse: js.UndefOr[portrait | landscape | Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[collapse | split] = js.native
  var onClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], Unit]] = js.native
  var onModeChange: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], Unit]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], Unit]] = js.native
  var onPreClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], Unit]] = js.native
  var onPreOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], Unit]] = js.native
  var openThreshold: js.UndefOr[Double] = js.native
  var side: js.UndefOr[left | right] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var swipeTargetWidth: js.UndefOr[Double] = js.native
  var swipeable: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object HTMLAttributesidclassNameAnimation {
  @scala.inline
  def apply(): HTMLAttributesidclassNameAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameAnimation]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameAnimationOps[Self <: HTMLAttributesidclassNameAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: overlay | default): Self = {
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
    def withAnimationOptions(value: AnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOptions")(js.undefined)
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
    def withCollapse(value: portrait | landscape | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: collapse | split): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* e */ js.UndefOr[Event_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModeChange(value: /* e */ js.UndefOr[Event_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnModeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* e */ js.UndefOr[Event_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreClose(value: /* e */ js.UndefOr[Event_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPreClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreOpen(value: /* e */ js.UndefOr[Event_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPreOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
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
    def withSwipeTargetWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeTargetWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeTargetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeTargetWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeable")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

