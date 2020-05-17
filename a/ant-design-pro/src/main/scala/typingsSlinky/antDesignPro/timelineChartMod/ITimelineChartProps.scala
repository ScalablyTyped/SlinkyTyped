package typingsSlinky.antDesignPro.timelineChartMod

import typingsSlinky.antDesignPro.anon.Y1
import typingsSlinky.antDesignPro.anon.Y2
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineChartProps extends js.Object {
  var data: js.Array[Y1] = js.native
  var height: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var titleMap: Y2 = js.native
}

object ITimelineChartProps {
  @scala.inline
  def apply(data: js.Array[Y1], titleMap: Y2): ITimelineChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineChartProps]
  }
  @scala.inline
  implicit class ITimelineChartPropsOps[Self <: ITimelineChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[Y1]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleMap(value: Y2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = {
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
  }
  
}

