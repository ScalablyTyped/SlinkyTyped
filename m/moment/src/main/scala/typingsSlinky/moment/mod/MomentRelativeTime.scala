package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentRelativeTime extends js.Object {
  var M: js.Any
  var MM: js.Any
  var d: js.Any
  var dd: js.Any
  var future: js.Any
  var h: js.Any
  var hh: js.Any
  var m: js.Any
  var mm: js.Any
  var past: js.Any
  var s: js.Any
  var ss: js.Any
  var y: js.Any
  var yy: js.Any
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setM(value: js.Any): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def setMM(value: js.Any): Self = this.set("MM", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: js.Any): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setDd(value: js.Any): Self = this.set("dd", value.asInstanceOf[js.Any])
    @scala.inline
    def setFuture(value: js.Any): Self = this.set("future", value.asInstanceOf[js.Any])
    @scala.inline
    def setH(value: js.Any): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setHh(value: js.Any): Self = this.set("hh", value.asInstanceOf[js.Any])
    @scala.inline
    def setPast(value: js.Any): Self = this.set("past", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: js.Any): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setSs(value: js.Any): Self = this.set("ss", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: js.Any): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYy(value: js.Any): Self = this.set("yy", value.asInstanceOf[js.Any])
  }
  
}

