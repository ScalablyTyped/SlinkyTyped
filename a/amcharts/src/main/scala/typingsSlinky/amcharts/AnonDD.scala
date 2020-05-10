package typingsSlinky.amcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDD extends js.Object {
  var DD: String = js.native
  var hh: String = js.native
  var mm: String = js.native
  var ss: String = js.native
}

object AnonDD {
  @scala.inline
  def apply(DD: String, hh: String, mm: String, ss: String): AnonDD = {
    val __obj = js.Dynamic.literal(DD = DD.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDD]
  }
  @scala.inline
  implicit class AnonDDOps[Self <: AnonDD] (val x: Self) extends AnyVal {
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

