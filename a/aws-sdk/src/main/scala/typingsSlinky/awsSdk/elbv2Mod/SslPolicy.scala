package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslPolicy extends js.Object {
  /**
    * The ciphers.
    */
  var Ciphers: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Ciphers] = js.native
  /**
    * The name of the policy.
    */
  var Name: js.UndefOr[SslPolicyName] = js.native
  /**
    * The protocols.
    */
  var SslProtocols: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.SslProtocols] = js.native
}

object SslPolicy {
  @scala.inline
  def apply(): SslPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslPolicy]
  }
  @scala.inline
  implicit class SslPolicyOps[Self <: SslPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCiphers(value: Ciphers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ciphers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ciphers")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: SslPolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSslProtocols(value: SslProtocols): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslProtocols")(js.undefined)
        ret
    }
  }
  
}

