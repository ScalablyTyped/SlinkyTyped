package typingsSlinky.pulumiAws.wafIpSetMod

import typingsSlinky.pulumiAws.inputMod.waf.IpSetIpSetDescriptor
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpSetArgs extends js.Object {
  /**
    * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
    */
  val ipSetDescriptors: js.UndefOr[Input[js.Array[Input[IpSetIpSetDescriptor]]]] = js.native
  /**
    * The name or description of the IPSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object IpSetArgs {
  @scala.inline
  def apply(): IpSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpSetArgs]
  }
  @scala.inline
  implicit class IpSetArgsOps[Self <: IpSetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpSetDescriptors(value: Input[js.Array[Input[IpSetIpSetDescriptor]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipSetDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpSetDescriptors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipSetDescriptors")(js.undefined)
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

