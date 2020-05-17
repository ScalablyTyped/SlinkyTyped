package typingsSlinky.c3.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.c3.anon.Min
import typingsSlinky.c3.c3Strings.drag
import typingsSlinky.c3.c3Strings.scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomOptions extends js.Object {
  /**
    * Disable the default animation of zoom. This option is useful when you want to get the zoomed domain by `onzoom` or `onzoomend` handlers and override the default animation behavior.
    * @see https://github.com/c3js/c3/pull/2439 for details.
    */
  var disableDefaultBehavior: js.UndefOr[Boolean] = js.native
  /**
    * Enable zooming.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Change zoom extent.
    * **Experimental.**
    */
  var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /**
    * Set the initial minimum and maximum x-axis zoom values.
    */
  var initialRange: js.UndefOr[Domain] = js.native
  /**
    * Set callback that is called when the chart is zooming. Specified function receives the zoomed domain.
    */
  var onzoom: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.native
  /**
    * Set callback that is called when zooming ends. Specified function receives the zoomed domain.
    */
  var onzoomend: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.native
  /**
    * Set callback that is called when zooming starts. Specified function receives the zoom event.
    */
  var onzoomstart: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* event */ Event, Unit]] = js.native
  var priveleged: js.UndefOr[Boolean] = js.native
  /**
    * Enable to rescale after zooming. If true set, y domain will be updated according to the zoomed region.
    */
  var rescale: js.UndefOr[Boolean] = js.native
  /**
    * Set interaction type for zooming
    */
  var `type`: js.UndefOr[scroll | drag] = js.native
  var x: js.UndefOr[Min] = js.native
}

object ZoomOptions {
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  @scala.inline
  implicit class ZoomOptionsOps[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableDefaultBehavior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDefaultBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRange(value: Domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnzoom(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnzoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnzoomend(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnzoomend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnzoomstart(value: js.ThisFunction1[/* this */ ChartAPI, /* event */ Event, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnzoomstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onzoomstart")(js.undefined)
        ret
    }
    @scala.inline
    def withPriveleged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priveleged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriveleged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priveleged")(js.undefined)
        ret
    }
    @scala.inline
    def withRescale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rescale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRescale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rescale")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: scroll | drag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Min): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
  }
  
}

