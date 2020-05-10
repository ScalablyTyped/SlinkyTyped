package typingsSlinky.amapJsApiPlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCpid extends js.Object {
  var cpid: String = js.native
  var floor: String = js.native
  var truefloor: String = js.native
}

object AnonCpid {
  @scala.inline
  def apply(cpid: String, floor: String, truefloor: String): AnonCpid = {
    val __obj = js.Dynamic.literal(cpid = cpid.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], truefloor = truefloor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCpid]
  }
  @scala.inline
  implicit class AnonCpidOps[Self <: AnonCpid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruefloor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truefloor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

