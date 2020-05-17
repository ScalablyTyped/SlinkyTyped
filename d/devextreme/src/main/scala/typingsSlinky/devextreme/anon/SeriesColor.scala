package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesColor extends js.Object {
  var seriesColor: js.UndefOr[String] = js.native
  var seriesIndex: js.UndefOr[Double] = js.native
  var seriesName: js.UndefOr[js.Any] = js.native
}

object SeriesColor {
  @scala.inline
  def apply(): SeriesColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesColor]
  }
  @scala.inline
  implicit class SeriesColorOps[Self <: SeriesColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeriesColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesName")(js.undefined)
        ret
    }
  }
  
}

