package typingsSlinky.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPointIndex extends js.Object {
  val PointIndex: Double = js.native
  val SeriesIndex: Double = js.native
}

object AnonPointIndex {
  @scala.inline
  def apply(PointIndex: Double, SeriesIndex: Double): AnonPointIndex = {
    val __obj = js.Dynamic.literal(PointIndex = PointIndex.asInstanceOf[js.Any], SeriesIndex = SeriesIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPointIndex]
  }
  @scala.inline
  implicit class AnonPointIndexOps[Self <: AnonPointIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeriesIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

