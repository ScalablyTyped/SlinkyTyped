package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAmi extends js.Object {
  /**
    * THe ID of the image used to create the custom AMI.
    */
  var ImageId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ImageId] = js.native
  /**
    * The type of virtualization used to create the custom AMI.
    */
  var VirtualizationType: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.VirtualizationType] = js.native
}

object CustomAmi {
  @scala.inline
  def apply(): CustomAmi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAmi]
  }
  @scala.inline
  implicit class CustomAmiOps[Self <: CustomAmi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageId(value: ImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualizationType(value: VirtualizationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualizationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualizationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualizationType")(js.undefined)
        ret
    }
  }
  
}

