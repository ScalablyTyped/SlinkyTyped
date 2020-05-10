package typingsSlinky.pulumiAws.inputMod.wafregional

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpSetIpSetDescriptor extends js.Object {
  /**
    * The string like IPV4 or IPV6.
    */
  var `type`: Input[String] = js.native
  /**
    * The CIDR notation.
    */
  var value: Input[String] = js.native
}

object IpSetIpSetDescriptor {
  @scala.inline
  def apply(`type`: Input[String], value: Input[String]): IpSetIpSetDescriptor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetIpSetDescriptor]
  }
  @scala.inline
  implicit class IpSetIpSetDescriptorOps[Self <: IpSetIpSetDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

