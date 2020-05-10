package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkAclResult extends js.Object {
  /**
    * Information about the network ACL.
    */
  var NetworkAcl: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NetworkAcl] = js.native
}

object CreateNetworkAclResult {
  @scala.inline
  def apply(): CreateNetworkAclResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkAclResult]
  }
  @scala.inline
  implicit class CreateNetworkAclResultOps[Self <: CreateNetworkAclResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkAcl(value: NetworkAcl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAcl")(js.undefined)
        ret
    }
  }
  
}

