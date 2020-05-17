package typingsSlinky.reactPopover.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverProps extends js.Object {
  var appendTarget: js.UndefOr[Element] = js.native
  var body: TagMod[Any] = js.native
  var className: js.UndefOr[String] = js.native
  var enterExitTransitionDurationMs: js.UndefOr[Double] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var onOuterAction: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var place: js.UndefOr[PopoverPlace] = js.native
  var preferPlace: js.UndefOr[PopoverPlace] = js.native
  var refreshIntervalMs: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var target: js.UndefOr[ReactElement] = js.native
  var tipSize: js.UndefOr[Double] = js.native
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
    def withAppendTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
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
    def withEnterExitTransitionDurationMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterExitTransitionDurationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterExitTransitionDurationMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterExitTransitionDurationMs")(js.undefined)
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
    def withOnOuterAction(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOuterAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOuterAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOuterAction")(js.undefined)
        ret
    }
    @scala.inline
    def withPlace(value: PopoverPlace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferPlace(value: PopoverPlace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferPlace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferPlace")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshIntervalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshIntervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshIntervalMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshIntervalMs")(js.undefined)
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
    def withTarget(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTipSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipSize")(js.undefined)
        ret
    }
  }
  
}

