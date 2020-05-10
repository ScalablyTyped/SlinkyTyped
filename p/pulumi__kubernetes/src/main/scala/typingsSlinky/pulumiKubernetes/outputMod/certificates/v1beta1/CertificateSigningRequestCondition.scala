package typingsSlinky.pulumiKubernetes.outputMod.certificates.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  */
@js.native
trait CertificateSigningRequestCondition extends js.Object {
  /**
    * timestamp for the last update to this condition
    */
  val lastUpdateTime: String = js.native
  /**
    * human readable message with details about the request state
    */
  val message: String = js.native
  /**
    * brief reason for the request state
    */
  val reason: String = js.native
  /**
    * request approval state, currently Approved or Denied.
    */
  val `type`: String = js.native
}

object CertificateSigningRequestCondition {
  @scala.inline
  def apply(lastUpdateTime: String, message: String, reason: String, `type`: String): CertificateSigningRequestCondition = {
    val __obj = js.Dynamic.literal(lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestCondition]
  }
  @scala.inline
  implicit class CertificateSigningRequestConditionOps[Self <: CertificateSigningRequestCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

