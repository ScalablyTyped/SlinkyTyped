package typingsSlinky.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyEnforcedExceptionDetails extends js.Object {
  /**
    * <p>PolicyEnforcedException</p>
    */
  var code: js.UndefOr[String] = js.native
  /**
    * <p>InitiateJob request denied by current data retrieval policy.</p>
    */
  var message: js.UndefOr[String] = js.native
  /**
    * <p>Client</p>
    */
  var `type`: js.UndefOr[String] = js.native
}

object PolicyEnforcedExceptionDetails {
  @scala.inline
  def apply(): PolicyEnforcedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyEnforcedExceptionDetails]
  }
  @scala.inline
  implicit class PolicyEnforcedExceptionDetailsOps[Self <: PolicyEnforcedExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

