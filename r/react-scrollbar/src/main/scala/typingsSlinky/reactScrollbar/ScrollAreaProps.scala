package typingsSlinky.reactScrollbar

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Props
import typingsSlinky.reactScrollbar.anon.ContainerHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollAreaProps extends Props[ScrollArea] {
  var className: js.UndefOr[String] = js.native
  var contentClassName: js.UndefOr[String] = js.native
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  var contentWindow: js.UndefOr[js.Any] = js.native
  var focusableTabIndex: js.UndefOr[Double] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var horizontalContainerStyle: js.UndefOr[CSSProperties] = js.native
  var horizontalScrollbarStyle: js.UndefOr[CSSProperties] = js.native
  var minScrollSize: js.UndefOr[Double] = js.native
  var onScroll: js.UndefOr[js.Function1[/* value */ ContainerHeight, Unit]] = js.native
  var ownerDocument: js.UndefOr[js.Any] = js.native
  var smoothScrolling: js.UndefOr[Boolean] = js.native
  var speed: js.UndefOr[Double] = js.native
  var stopScrollPropagation: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var swapWheelAxes: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
  var verticalContainerStyle: js.UndefOr[CSSProperties] = js.native
  var verticalScrollbarStyle: js.UndefOr[CSSProperties] = js.native
}

object ScrollAreaProps {
  @scala.inline
  def apply(): ScrollAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollAreaProps]
  }
  @scala.inline
  implicit class ScrollAreaPropsOps[Self <: ScrollAreaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentWindow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusableTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusableTabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusableTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusableTabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalScrollbarStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollbarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalScrollbarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollbarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScrollSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScrollSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScrollSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScrollSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* value */ ContainerHeight => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerDocument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStopScrollPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopScrollPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopScrollPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopScrollPropagation")(js.undefined)
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
    def withSwapWheelAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapWheelAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapWheelAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapWheelAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalScrollbarStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollbarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalScrollbarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollbarStyle")(js.undefined)
        ret
    }
  }
  
}

