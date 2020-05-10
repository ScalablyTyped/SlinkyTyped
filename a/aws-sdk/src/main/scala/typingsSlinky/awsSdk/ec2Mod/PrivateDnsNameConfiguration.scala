package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateDnsNameConfiguration extends js.Object {
  /**
    * The name of the record subdomain the service provider needs to create. The service provider adds the value text to the name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The verification state of the VPC endpoint service. &gt;Consumers of the endpoint service can use the private name only when the state is verified.
    */
  var State: js.UndefOr[DnsNameState] = js.native
  /**
    * The endpoint service verification type, for example TXT.
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * The value the service provider adds to the private DNS name domain record before verification.
    */
  var Value: js.UndefOr[String] = js.native
}

object PrivateDnsNameConfiguration {
  @scala.inline
  def apply(): PrivateDnsNameConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateDnsNameConfiguration]
  }
  @scala.inline
  implicit class PrivateDnsNameConfigurationOps[Self <: PrivateDnsNameConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
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
    def withState(value: DnsNameState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

