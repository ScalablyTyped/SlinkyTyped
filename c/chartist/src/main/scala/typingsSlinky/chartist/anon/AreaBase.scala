package typingsSlinky.chartist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaBase extends js.Object {
  var areaBase: js.UndefOr[Double] = js.native
  var lineSmooth: js.UndefOr[js.Function | Boolean] = js.native
  var showArea: js.UndefOr[Boolean] = js.native
  var showLine: js.UndefOr[Boolean] = js.native
  var showPoint: js.UndefOr[Boolean] = js.native
}

object AreaBase {
  @scala.inline
  def apply(): AreaBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaBase]
  }
  @scala.inline
  implicit class AreaBaseOps[Self <: AreaBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaBase")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSmooth(value: js.Function | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSmooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSmooth")(js.undefined)
        ret
    }
    @scala.inline
    def withShowArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArea")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLine")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPoint")(js.undefined)
        ret
    }
  }
  
}

