package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUpdateExisting extends js.Object {
  var updateExisting: js.UndefOr[Boolean] = js.native
}

object AnonUpdateExisting {
  @scala.inline
  def apply(): AnonUpdateExisting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUpdateExisting]
  }
  @scala.inline
  implicit class AnonUpdateExistingOps[Self <: AnonUpdateExisting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateExisting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateExisting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateExisting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateExisting")(js.undefined)
        ret
    }
  }
  
}

