package typingsSlinky.pulumiAws.staticIpAttachmentMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticIpAttachmentState extends js.Object {
  /**
    * The name of the Lightsail instance to attach the IP to
    */
  val instanceName: js.UndefOr[Input[String]] = js.native
  /**
    * The allocated static IP address
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the allocated static IP
    */
  val staticIpName: js.UndefOr[Input[String]] = js.native
}

object StaticIpAttachmentState {
  @scala.inline
  def apply(): StaticIpAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticIpAttachmentState]
  }
  @scala.inline
  implicit class StaticIpAttachmentStateOps[Self <: StaticIpAttachmentState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticIpName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticIpName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticIpName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticIpName")(js.undefined)
        ret
    }
  }
  
}

