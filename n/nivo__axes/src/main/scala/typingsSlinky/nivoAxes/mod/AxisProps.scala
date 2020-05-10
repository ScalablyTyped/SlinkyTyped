package typingsSlinky.nivoAxes.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.nivoAxes.nivoAxesStrings.bottom
import typingsSlinky.nivoAxes.nivoAxesStrings.end
import typingsSlinky.nivoAxes.nivoAxesStrings.left
import typingsSlinky.nivoAxes.nivoAxesStrings.middle
import typingsSlinky.nivoAxes.nivoAxesStrings.right
import typingsSlinky.nivoAxes.nivoAxesStrings.start
import typingsSlinky.nivoAxes.nivoAxesStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisProps extends js.Object {
  var format: js.UndefOr[String | TickFormatter] = js.native
  var legend: js.UndefOr[TagMod[Any]] = js.native
  var legendOffset: js.UndefOr[Double] = js.native
  var legendPosition: js.UndefOr[start | middle | end] = js.native
  var orient: js.UndefOr[top | right | bottom | left] = js.native
  var renderTick: js.UndefOr[js.Function1[/* data */ js.Any, TagMod[Any]]] = js.native
  var tickPadding: js.UndefOr[Double] = js.native
  var tickRotation: js.UndefOr[Double] = js.native
  var tickSize: js.UndefOr[Double] = js.native
  var tickValues: js.UndefOr[Double | (js.Array[js.Date | Double | String]) | String] = js.native
}

object AxisProps {
  @scala.inline
  def apply(): AxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisProps]
  }
  @scala.inline
  implicit class AxisPropsOps[Self <: AxisProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatFunction1(value: /* value */ Double | String | js.Date => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: String | TickFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegend(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendPosition(value: start | middle | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOrient(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTick(value: /* data */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTick")(js.undefined)
        ret
    }
    @scala.inline
    def withTickPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withTickRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTickSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTickValues(value: Double | (js.Array[js.Date | Double | String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickValues")(js.undefined)
        ret
    }
  }
  
}

