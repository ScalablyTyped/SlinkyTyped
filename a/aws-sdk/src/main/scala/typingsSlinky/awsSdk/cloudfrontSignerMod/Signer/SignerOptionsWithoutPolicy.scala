package typingsSlinky.awsSdk.cloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignerOptionsWithoutPolicy extends js.Object {
  /**
    * A Unix UTC timestamp indicating when the signature should expire. Required unless you pass in a full policy.
    */
  var expires: Double = js.native
  /**
    * The URL to which the signature will grant access. Required unless you pass in a full policy.
    */
  var url: String = js.native
}

object SignerOptionsWithoutPolicy {
  @scala.inline
  def apply(expires: Double, url: String): SignerOptionsWithoutPolicy = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerOptionsWithoutPolicy]
  }
  @scala.inline
  implicit class SignerOptionsWithoutPolicyOps[Self <: SignerOptionsWithoutPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

