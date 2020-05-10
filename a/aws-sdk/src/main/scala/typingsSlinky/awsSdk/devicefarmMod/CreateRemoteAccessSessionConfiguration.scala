package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRemoteAccessSessionConfiguration extends js.Object {
  /**
    * The billing method for the remote access session.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  /**
    * An array of ARNs included in the VPC endpoint configuration.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.native
}

object CreateRemoteAccessSessionConfiguration {
  @scala.inline
  def apply(): CreateRemoteAccessSessionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRemoteAccessSessionConfiguration]
  }
  @scala.inline
  implicit class CreateRemoteAccessSessionConfigurationOps[Self <: CreateRemoteAccessSessionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingMethod(value: BillingMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withVpceConfigurationArns(value: AmazonResourceNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurationArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpceConfigurationArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurationArns")(js.undefined)
        ret
    }
  }
  
}

