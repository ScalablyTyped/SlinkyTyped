package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPolicyTls extends js.Object {
  /**
    * Whether the policy is enforced. The default is True, if a value isn't specified.
    */
  var enforce: js.UndefOr[Boolean] = js.native
  /**
    * The range of ports that the policy is enforced for.
    */
  var ports: js.UndefOr[PortSet] = js.native
  /**
    * A reference to an object that represents a TLS validation context.
    */
  var validation: TlsValidationContext = js.native
}

object ClientPolicyTls {
  @scala.inline
  def apply(validation: TlsValidationContext): ClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPolicyTls]
  }
  @scala.inline
  implicit class ClientPolicyTlsOps[Self <: ClientPolicyTls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidation(value: TlsValidationContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: PortSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
  }
  
}

