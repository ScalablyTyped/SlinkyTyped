package typingsSlinky.amapJsApiHeatmap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDrawGridLine extends js.Object {
  var drawGridLine: js.UndefOr[Boolean] = js.native
  var gridSize: js.UndefOr[Double] = js.native
  var heightBezier: js.UndefOr[js.Array[Double]] = js.native
  var heightScale: js.UndefOr[Double] = js.native
}

object AnonDrawGridLine {
  @scala.inline
  def apply(): AnonDrawGridLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDrawGridLine]
  }
  @scala.inline
  implicit class AnonDrawGridLineOps[Self <: AnonDrawGridLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawGridLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGridLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawGridLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGridLine")(js.undefined)
        ret
    }
    @scala.inline
    def withGridSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightBezier(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightBezier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightBezier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightBezier")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightScale")(js.undefined)
        ret
    }
  }
  
}

