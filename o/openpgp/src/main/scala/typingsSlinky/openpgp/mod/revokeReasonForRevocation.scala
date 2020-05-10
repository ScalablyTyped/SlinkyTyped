package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.mod.enums.reasonForRevocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait revokeReasonForRevocation extends js.Object {
  /**
    * optional, flag indicating the reason for revocation
    */
  var flag: reasonForRevocation = js.native
  /**
    * optional, string explaining the reason for revocation
    */
  var string: String = js.native
}

object revokeReasonForRevocation {
  @scala.inline
  def apply(flag: reasonForRevocation, string: String): revokeReasonForRevocation = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[revokeReasonForRevocation]
  }
  @scala.inline
  implicit class revokeReasonForRevocationOps[Self <: revokeReasonForRevocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlag(value: reasonForRevocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

