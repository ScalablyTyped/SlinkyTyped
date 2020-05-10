package typingsSlinky.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentRelativeTime extends js.Object {
  var M: js.Any = js.native
  var MM: js.Any = js.native
  var d: js.Any = js.native
  var dd: js.Any = js.native
  var future: js.Any = js.native
  var h: js.Any = js.native
  var hh: js.Any = js.native
  var m: js.Any = js.native
  var mm: js.Any = js.native
  var past: js.Any = js.native
  var s: js.Any = js.native
  var ss: js.Any = js.native
  var y: js.Any = js.native
  var yy: js.Any = js.native
}

object MomentRelativeTime {
  @scala.inline
  def apply(
    M: js.Any,
    MM: js.Any,
    d: js.Any,
    dd: js.Any,
    future: js.Any,
    h: js.Any,
    hh: js.Any,
    m: js.Any,
    mm: js.Any,
    past: js.Any,
    s: js.Any,
    ss: js.Any,
    y: js.Any,
    yy: js.Any
  ): MomentRelativeTime = {
    val __obj = js.Dynamic.literal(M = M.asInstanceOf[js.Any], MM = MM.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yy = yy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentRelativeTime]
  }
  @scala.inline
  implicit class MomentRelativeTimeOps[Self <: MomentRelativeTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withM(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMM(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFuture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPast(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

