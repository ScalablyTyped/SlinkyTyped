package typingsSlinky.divaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAhei extends js.Object {
  var a_hei: Double = js.native
  var a_wid: Double = js.native
  var max_h: Double = js.native
  var max_ratio: Double = js.native
  var max_w: Double = js.native
  var min_ratio: Double = js.native
  var t_hei: Double = js.native
  var t_wid: Double = js.native
}

object AnonAhei {
  @scala.inline
  def apply(
    a_hei: Double,
    a_wid: Double,
    max_h: Double,
    max_ratio: Double,
    max_w: Double,
    min_ratio: Double,
    t_hei: Double,
    t_wid: Double
  ): AnonAhei = {
    val __obj = js.Dynamic.literal(a_hei = a_hei.asInstanceOf[js.Any], a_wid = a_wid.asInstanceOf[js.Any], max_h = max_h.asInstanceOf[js.Any], max_ratio = max_ratio.asInstanceOf[js.Any], max_w = max_w.asInstanceOf[js.Any], min_ratio = min_ratio.asInstanceOf[js.Any], t_hei = t_hei.asInstanceOf[js.Any], t_wid = t_wid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAhei]
  }
  @scala.inline
  implicit class AnonAheiOps[Self <: AnonAhei] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA_hei(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a_hei")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA_wid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a_wid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_h(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_ratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_w(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin_ratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT_hei(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t_hei")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT_wid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t_wid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

