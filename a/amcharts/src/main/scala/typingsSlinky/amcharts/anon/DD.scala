package typingsSlinky.amcharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DD extends js.Object {
  var DD: String = js.native
  var hh: String = js.native
  var mm: String = js.native
  var ss: String = js.native
}

object DD {
  @scala.inline
  def apply(DD: String, hh: String, mm: String, ss: String): DD = {
    val __obj = js.Dynamic.literal(DD = DD.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
    __obj.asInstanceOf[DD]
  }
  @scala.inline
  implicit class DDOps[Self <: DD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ss")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

