package typingsSlinky.reactSmoothScrollbar.mod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.smoothScrollbar.mod.default
import typingsSlinky.smoothScrollbar.scrollbarMod.ScrollStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollbarOptions> */
@js.native
trait ScrollbarProps extends js.Object {
  /**
    * Keep scrollbar tracks visible whether it's scrolling or not
    * @default false
    */
  var alwaysShowTracks: js.UndefOr[Boolean] = js.native
  /**
    * Optional class name
    */
  var className: js.UndefOr[String] = js.native
  var continuousScrolling: js.UndefOr[Boolean] = js.native
  var damping: js.UndefOr[Double] = js.native
  var delegateTo: js.UndefOr[EventTarget] = js.native
  /**
    * Pipe to scrollbar.addListener()
    */
  var onScroll: js.UndefOr[js.Function2[/* status */ ScrollStatus, /* scrollbarInstance */ default, Unit]] = js.native
  var plugins: js.UndefOr[js.Any] = js.native
  var renderByPixels: js.UndefOr[Boolean] = js.native
  /**
    * Optional style
    */
  var style: js.UndefOr[CSSProperties] = js.native
  var thumbMinSize: js.UndefOr[Double] = js.native
  var wheelEventTarget: js.UndefOr[EventTarget] = js.native
}

object ScrollbarProps {
  @scala.inline
  def apply(): ScrollbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollbarProps]
  }
  @scala.inline
  implicit class ScrollbarPropsOps[Self <: ScrollbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysShowTracks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowTracks")(js.undefined)
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
    def withContinuousScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegateTo(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegateTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateTo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: (/* status */ ScrollStatus, /* scrollbarInstance */ default) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderByPixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderByPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderByPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderByPixels")(js.undefined)
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
    def withThumbMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbMinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbMinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelEventTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelEventTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelEventTarget")(js.undefined)
        ret
    }
  }
  
}

