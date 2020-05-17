package typingsSlinky.jqueryContextmenu

import org.scalajs.dom.raw.Event
import typingsSlinky.jqueryContextmenu.anon.Duration
import typingsSlinky.jqueryContextmenu.anon.Hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryContextMenuOptions extends js.Object {
  var animation: js.UndefOr[Duration] = js.native
  var appendTo: js.UndefOr[String] = js.native
  var autoHide: js.UndefOr[Boolean] = js.native
  var build: js.UndefOr[js.Function2[/* triggerElement */ JQuery, /* e */ Event, _]] = js.native
  var callback: js.UndefOr[js.Function2[/* key */ js.Any, /* options */ js.Any, _]] = js.native
  var className: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var determinePosition: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.native
  var events: js.UndefOr[Hide] = js.native
  var itemClickEvent: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Any] = js.native
  var position: js.UndefOr[js.Function3[/* opt */ JQuery, /* x */ Double, /* y */ Double, Unit]] = js.native
  var positionSubmenu: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.native
  var reposition: js.UndefOr[Boolean] = js.native
  var selector: String = js.native
  var trigger: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object JQueryContextMenuOptions {
  @scala.inline
  def apply(selector: String): JQueryContextMenuOptions = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryContextMenuOptions]
  }
  @scala.inline
  implicit class JQueryContextMenuOptionsOps[Self <: JQueryContextMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: Duration): Self = {
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
    def withAppendTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withBuild(value: (/* triggerElement */ JQuery, /* e */ Event) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: (/* key */ js.Any, /* options */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
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
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDeterminePosition(value: /* menu */ JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("determinePosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeterminePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("determinePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: Hide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClickEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClickEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClickEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClickEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: (/* opt */ JQuery, /* x */ Double, /* y */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionSubmenu(value: /* menu */ JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionSubmenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPositionSubmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionSubmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withReposition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reposition")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

