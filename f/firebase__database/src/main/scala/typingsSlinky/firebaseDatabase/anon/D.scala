package typingsSlinky.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D extends js.Object {
  var d: js.Any = js.native
  var seg: Double = js.native
  var ts: Double = js.native
}

object D {
  @scala.inline
  def apply(d: js.Any, seg: Double, ts: Double): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], seg = seg.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  @scala.inline
  implicit class DOps[Self <: D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

