package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkProfileResponse extends js.Object {
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.native
}

object CreateNetworkProfileResponse {
  @scala.inline
  def apply(): CreateNetworkProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkProfileResponse]
  }
  @scala.inline
  implicit class CreateNetworkProfileResponseOps[Self <: CreateNetworkProfileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkProfileArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileArn")(js.undefined)
        ret
    }
  }
  
}

