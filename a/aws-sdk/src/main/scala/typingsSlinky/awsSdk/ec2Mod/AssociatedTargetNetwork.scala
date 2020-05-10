package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatedTargetNetwork extends js.Object {
  /**
    * The ID of the subnet.
    */
  var NetworkId: js.UndefOr[String] = js.native
  /**
    * The target network type.
    */
  var NetworkType: js.UndefOr[AssociatedNetworkType] = js.native
}

object AssociatedTargetNetwork {
  @scala.inline
  def apply(): AssociatedTargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedTargetNetwork]
  }
  @scala.inline
  implicit class AssociatedTargetNetworkOps[Self <: AssociatedTargetNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkType(value: AssociatedNetworkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkType")(js.undefined)
        ret
    }
  }
  
}

