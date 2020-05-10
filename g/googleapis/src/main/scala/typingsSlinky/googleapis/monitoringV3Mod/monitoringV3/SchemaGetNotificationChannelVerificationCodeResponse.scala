package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The GetNotificationChannelVerificationCode request.
  */
@js.native
trait SchemaGetNotificationChannelVerificationCodeResponse extends js.Object {
  /**
    * The verification code, which may be used to verify other channels that
    * have an equivalent identity (i.e. other channels of the same type with
    * the same fingerprint such as other email channels with the same email
    * address or other sms channels with the same number).
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The expiration time associated with the code that was returned. If an
    * expiration was provided in the request, this is the minimum of the
    * requested expiration in the request and the max permitted expiration.
    */
  var expireTime: js.UndefOr[String] = js.native
}

object SchemaGetNotificationChannelVerificationCodeResponse {
  @scala.inline
  def apply(): SchemaGetNotificationChannelVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetNotificationChannelVerificationCodeResponse]
  }
  @scala.inline
  implicit class SchemaGetNotificationChannelVerificationCodeResponseOps[Self <: SchemaGetNotificationChannelVerificationCodeResponse] (val x: Self) extends AnyVal {
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
    def withExpireTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpireTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(js.undefined)
        ret
    }
  }
  
}

