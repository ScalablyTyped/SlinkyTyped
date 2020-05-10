package typingsSlinky.reactEasyChart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaChartProps extends LineChartProps {
  /** Make the gradient area a solid fill rather than a gradient */
  var noAreaGradient: js.UndefOr[Boolean] = js.native
}

object AreaChartProps {
  @scala.inline
  def apply(data: js.Array[js.Array[LineData]]): AreaChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaChartProps]
  }
  @scala.inline
  implicit class AreaChartPropsOps[Self <: AreaChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoAreaGradient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAreaGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAreaGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAreaGradient")(js.undefined)
        ret
    }
  }
  
}

