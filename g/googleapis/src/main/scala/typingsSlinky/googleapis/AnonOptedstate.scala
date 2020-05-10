package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptedstate extends js.Object {
  var opted_state: js.UndefOr[String] = js.native
}

object AnonOptedstate {
  @scala.inline
  def apply(): AnonOptedstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOptedstate]
  }
  @scala.inline
  implicit class AnonOptedstateOps[Self <: AnonOptedstate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpted_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opted_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpted_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opted_state")(js.undefined)
        ret
    }
  }
  
}

