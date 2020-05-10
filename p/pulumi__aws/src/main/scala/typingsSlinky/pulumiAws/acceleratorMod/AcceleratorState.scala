package typingsSlinky.pulumiAws.acceleratorMod

import typingsSlinky.pulumiAws.inputMod.globalaccelerator.AcceleratorAttributes
import typingsSlinky.pulumiAws.inputMod.globalaccelerator.AcceleratorIpSet
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorState extends js.Object {
  /**
    * The attributes of the accelerator. Fields documented below.
    */
  val attributes: js.UndefOr[Input[AcceleratorAttributes]] = js.native
  /**
    * The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
    * * `hostedZoneId` --  The Global Accelerator Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set][1] to the Global Accelerator. This attribute
    * is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The value for the address type must be `IPV4`.
    */
  val ipAddressType: js.UndefOr[Input[String]] = js.native
  /**
    * IP address set associated with the accelerator.
    */
  val ipSets: js.UndefOr[Input[js.Array[Input[AcceleratorIpSet]]]] = js.native
  /**
    * The name of the accelerator.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object AcceleratorState {
  @scala.inline
  def apply(): AcceleratorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorState]
  }
  @scala.inline
  implicit class AcceleratorStateOps[Self <: AcceleratorState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Input[AcceleratorAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddressType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddressType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddressType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddressType")(js.undefined)
        ret
    }
    @scala.inline
    def withIpSets(value: Input[js.Array[Input[AcceleratorIpSet]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipSets")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

