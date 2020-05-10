package typingsSlinky.pulumiAws.customerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerGatewayArgs extends js.Object {
  /**
    * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: Input[Double] = js.native
  /**
    * The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: Input[String] = js.native
  /**
    * Tags to apply to the gateway.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of customer gateway. The only type AWS
    * supports at this time is "ipsec.1".
    */
  val `type`: Input[String] = js.native
}

object CustomerGatewayArgs {
  @scala.inline
  def apply(bgpAsn: Input[Double], ipAddress: Input[String], `type`: Input[String]): CustomerGatewayArgs = {
    val __obj = js.Dynamic.literal(bgpAsn = bgpAsn.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerGatewayArgs]
  }
  @scala.inline
  implicit class CustomerGatewayArgsOps[Self <: CustomerGatewayArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgpAsn(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

