package typingsSlinky.pulumiKubernetes.inputMod.authentication.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenRequestStatus is the result of a token request.
  */
@js.native
trait TokenRequestStatus extends js.Object {
  /**
    * ExpirationTimestamp is the time of expiration of the returned token.
    */
  var expirationTimestamp: Input[String] = js.native
  /**
    * Token is the opaque bearer token.
    */
  var token: Input[String] = js.native
}

object TokenRequestStatus {
  @scala.inline
  def apply(expirationTimestamp: Input[String], token: Input[String]): TokenRequestStatus = {
    val __obj = js.Dynamic.literal(expirationTimestamp = expirationTimestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRequestStatus]
  }
  @scala.inline
  implicit class TokenRequestStatusOps[Self <: TokenRequestStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationTimestamp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

