package typingsSlinky.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var arrow_curve: js.UndefOr[Double] = js.native
  var bar_corner_radius: js.UndefOr[Double] = js.native
  var bar_height: js.UndefOr[Double] = js.native
  var column_width: js.UndefOr[Double] = js.native
  var custom_popup_html: js.UndefOr[String | (js.Function1[/* task */ js.Any, String])] = js.native
  var date_format: js.UndefOr[String] = js.native
  var header_height: js.UndefOr[Double] = js.native
  var on_click: js.UndefOr[js.Function1[/* task */ js.Any, Unit]] = js.native
  var on_date_change: js.UndefOr[js.Function3[/* task */ js.Any, /* start */ String, /* end */ String, Unit]] = js.native
  var on_progress_change: js.UndefOr[js.Function2[/* task */ js.Any, /* progress */ Double, Unit]] = js.native
  var on_view_change: js.UndefOr[js.Function1[/* mode */ viewMode, Unit]] = js.native
  var padding: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var view_mode: js.UndefOr[viewMode] = js.native
  var view_modes: js.UndefOr[js.Array[viewMode]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow_curve(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow_curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow_curve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow_curve")(js.undefined)
        ret
    }
    @scala.inline
    def withBar_corner_radius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar_corner_radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar_corner_radius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar_corner_radius")(js.undefined)
        ret
    }
    @scala.inline
    def withBar_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar_height")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_width")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_popup_htmlFunction1(value: /* task */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_popup_html")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustom_popup_html(value: String | (js.Function1[/* task */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_popup_html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_popup_html: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_popup_html")(js.undefined)
        ret
    }
    @scala.inline
    def withDate_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header_height")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_click(value: /* task */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOn_click: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_click")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_date_change(value: (/* task */ js.Any, /* start */ String, /* end */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_date_change")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOn_date_change: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_date_change")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_progress_change(value: (/* task */ js.Any, /* progress */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_progress_change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOn_progress_change: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_progress_change")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_view_change(value: /* mode */ viewMode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_view_change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOn_view_change: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_view_change")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withView_mode(value: viewMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withView_modes(value: js.Array[viewMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_modes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView_modes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_modes")(js.undefined)
        ret
    }
  }
  
}

