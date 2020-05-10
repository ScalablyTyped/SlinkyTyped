package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMandatory extends js.Object {
  var mandatory: Boolean = js.native
  var persistent: Boolean = js.native
}

object AnonMandatory {
  @scala.inline
  def apply(mandatory: Boolean, persistent: Boolean): AnonMandatory = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMandatory]
  }
  @scala.inline
  implicit class AnonMandatoryOps[Self <: AnonMandatory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMandatory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

