package typingsSlinky.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MorrisStatic extends js.Object {
  /** Create an area chart. */
  def Area(options: IAreaOptions): GridChart = js.native
  /** Create a bar chart. */
  def Bar(options: IBarOptions): GridChart = js.native
  /** Create a Donut chart. */
  def Donut(options: IDonutOptions): DonutChart = js.native
  /** Create a line chart. */
  def Line(options: ILineOptions): GridChart = js.native
}

object MorrisStatic {
  @scala.inline
  def apply(
    Area: IAreaOptions => GridChart,
    Bar: IBarOptions => GridChart,
    Donut: IDonutOptions => DonutChart,
    Line: ILineOptions => GridChart
  ): MorrisStatic = {
    val __obj = js.Dynamic.literal(Area = js.Any.fromFunction1(Area), Bar = js.Any.fromFunction1(Bar), Donut = js.Any.fromFunction1(Donut), Line = js.Any.fromFunction1(Line))
    __obj.asInstanceOf[MorrisStatic]
  }
  @scala.inline
  implicit class MorrisStaticOps[Self <: MorrisStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: IAreaOptions => GridChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Area")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBar(value: IBarOptions => GridChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDonut(value: IDonutOptions => DonutChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Donut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLine(value: ILineOptions => GridChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

