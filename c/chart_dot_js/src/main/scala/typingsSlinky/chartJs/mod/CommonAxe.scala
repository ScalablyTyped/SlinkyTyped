package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonAxe extends js.Object {
  var afterBuildTicks: js.UndefOr[js.Function2[/* scale */ js.Any, /* ticks */ js.Array[Double], js.Array[Double]]] = js.native
  var afterCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeBuildTicks: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var bounds: js.UndefOr[String] = js.native
  var display: js.UndefOr[Boolean | String] = js.native
  var gridLines: js.UndefOr[GridLineOptions] = js.native
  var id: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String] = js.native
  var scaleLabel: js.UndefOr[ScaleTitleOptions] = js.native
  var stacked: js.UndefOr[Boolean] = js.native
  var ticks: js.UndefOr[TickOptions] = js.native
  var time: js.UndefOr[TimeScale] = js.native
  var `type`: js.UndefOr[ScaleType | String] = js.native
}

object CommonAxe {
  @scala.inline
  def apply(): CommonAxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonAxe]
  }
  @scala.inline
  implicit class CommonAxeOps[Self <: CommonAxe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterBuildTicks(value: (/* scale */ js.Any, /* ticks */ js.Array[Double]) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBuildTicks")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterBuildTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBuildTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCalculateTickRotation(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCalculateTickRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterCalculateTickRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCalculateTickRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDataLimits(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDataLimits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterDataLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDataLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterFit(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSetDimension(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetDimension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterSetDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterTickToLabelConversion(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTickToLabelConversion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterTickToLabelConversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTickToLabelConversion")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUpdate(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBuildTicks(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBuildTicks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeBuildTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBuildTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCalculateTickRotation(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCalculateTickRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeCalculateTickRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCalculateTickRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDataLimits(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDataLimits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDataLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDataLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFit(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSetDimension(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetDimension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSetDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTickToLabelConversion(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTickToLabelConversion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeTickToLabelConversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTickToLabelConversion")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUpdate(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: Boolean | String): Self = {
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
    def withGridLines(value: GridLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLines")(js.undefined)
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
    def withOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleLabel(value: ScaleTitleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: TickOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: TimeScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ScaleType | String): Self = {
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
  }
  
}

