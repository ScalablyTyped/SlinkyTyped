package typingsSlinky.bezierJs.BezierJs

import typingsSlinky.bezierJs.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arc extends Point {
  var e: Double = js.native
  var interval: End = js.native
  var r: Double = js.native
  var s: Double = js.native
}

object Arc {
  @scala.inline
  def apply(e: Double, interval: End, r: Double, s: Double, x: Double, y: Double): Arc = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
  @scala.inline
  implicit class ArcOps[Self <: Arc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: End): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

