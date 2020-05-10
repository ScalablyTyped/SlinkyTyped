package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPolicy extends js.Object {
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[ClientPolicyTls] = js.native
}

object ClientPolicy {
  @scala.inline
  def apply(): ClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientPolicy]
  }
  @scala.inline
  implicit class ClientPolicyOps[Self <: ClientPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTls(value: ClientPolicyTls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
  }
  
}

