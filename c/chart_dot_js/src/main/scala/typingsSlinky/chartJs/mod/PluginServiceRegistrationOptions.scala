package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginServiceRegistrationOptions extends js.Object {
  var afterDatasetDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var afterDatasetUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  var afterDatasetsDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var afterDatasetsUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  var afterDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var afterEvent: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var afterInit: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  var afterLayout: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  var afterRender: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** @deprecated since version 2.5.0. Use `afterLayout` instead. */
  var afterScaleUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  // Called after drawing the `tooltip`. Note that this hook will not,
  // be called if the tooltip drawing has been previously cancelled.
  var afterTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var afterUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeDatasetDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var beforeDatasetUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  // Before the datasets are drawn but after scales are drawn
  var beforeDatasetsDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var beforeDatasetsUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  // Easing is for animation
  var beforeDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  // Called when an event occurs on the chart
  var beforeEvent: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var beforeInit: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeLayout: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  // This is called at the start of a render. It is only called once, even if the animation will run for a number of frames. Use beforeDraw or afterDraw
  // to do something on each animation frame
  var beforeRender: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  // Called before drawing the `tooltip`. If any plugin returns `false`,
  // the tooltip drawing is cancelled until another `render` is triggered.
  var beforeTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var beforeUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  var destroy: js.UndefOr[js.Function1[/* chartInstance */ Chart, Unit]] = js.native
  var resize: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* newChartSize */ ChartSize, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object PluginServiceRegistrationOptions {
  @scala.inline
  def apply(): PluginServiceRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginServiceRegistrationOptions]
  }
  @scala.inline
  implicit class PluginServiceRegistrationOptionsOps[Self <: PluginServiceRegistrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterDatasetDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDatasetDraw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterDatasetDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDatasetDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDatasetUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDatasetUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterDatasetUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDatasetUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDatasetsDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDatasetsDraw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterDatasetsDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDatasetsDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDatasetsUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDatasetsUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterDatasetsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDatasetsUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDraw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterEvent(value: (/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterInit(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLayout(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRender(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterScaleUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScaleUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterScaleUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScaleUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterTooltipDraw(
      value: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTooltipDraw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterTooltipDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTooltipDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDatasetDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDatasetDraw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeDatasetDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDatasetDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDatasetUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDatasetUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeDatasetUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDatasetUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDatasetsDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDatasetsDraw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeDatasetsDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDatasetsDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDatasetsUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDatasetsUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeDatasetsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDatasetsUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDraw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEvent(value: (/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInit(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLayout(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRender(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRender")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTooltipDraw(
      value: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTooltipDraw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeTooltipDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTooltipDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* chartInstance */ Chart => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(
      value: (/* chartInstance */ Chart, /* newChartSize */ ChartSize, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
  }
  
}

