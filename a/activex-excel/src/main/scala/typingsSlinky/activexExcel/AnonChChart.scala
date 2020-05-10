package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChChart extends js.Object {
  val Ch: Chart = js.native
}

object AnonChChart {
  @scala.inline
  def apply(Ch: Chart): AnonChChart = {
    val __obj = js.Dynamic.literal(Ch = Ch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChChart]
  }
  @scala.inline
  implicit class AnonChChartOps[Self <: AnonChChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCh(value: Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

