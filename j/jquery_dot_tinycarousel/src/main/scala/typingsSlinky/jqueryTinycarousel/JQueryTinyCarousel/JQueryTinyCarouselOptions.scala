package typingsSlinky.jqueryTinycarousel.JQueryTinyCarousel

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryTinyCarouselOptions extends js.Object {
  /**
    * Show animation when changing block? (default: true)
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
    */
  var axis: js.UndefOr[String] = js.native
  /**
    * Function that executes after every move (default: null)
    */
  var callback: js.UndefOr[js.Function2[/* element */ HTMLElement, /* index */ Double, Unit]] = js.native
  /**
    * Show left and right navigation buttons? (default: true)
    */
  var controls: js.UndefOr[Boolean] = js.native
  /**
    * How many blocks do you want to move at a time? (default: 1)
    */
  var display: js.UndefOr[Double] = js.native
  /**
    * Time of the animation in miliseconds (default: 1000)
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Move to the next block on an interval. (default: false)
    */
  var interval: js.UndefOr[Boolean] = js.native
  /**
    * Interval time in milliseconds. (default: 3000)
    */
  var intervaltime: js.UndefOr[Double] = js.native
  /**
    * Show page number navigation buttons? (default: false)
    */
  var pager: js.UndefOr[Boolean] = js.native
  /**
    * If interval is true and rewind is true it will play in reverse if the last slide is reached. (default: false)
    */
  var rewind: js.UndefOr[Boolean] = js.native
  /**
    * Start block of the carousel. (default: 1)
    */
  var start: js.UndefOr[Double] = js.native
}

object JQueryTinyCarouselOptions {
  @scala.inline
  def apply(): JQueryTinyCarouselOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryTinyCarouselOptions]
  }
  @scala.inline
  implicit class JQueryTinyCarouselOptionsOps[Self <: JQueryTinyCarouselOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
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
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: (/* element */ HTMLElement, /* index */ Double) => Unit): Self = {
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
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervaltime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervaltime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervaltime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervaltime")(js.undefined)
        ret
    }
    @scala.inline
    def withPager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager")(js.undefined)
        ret
    }
    @scala.inline
    def withRewind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewind")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

