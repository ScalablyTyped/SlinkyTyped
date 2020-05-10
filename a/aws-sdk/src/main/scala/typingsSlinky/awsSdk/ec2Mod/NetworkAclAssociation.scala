package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclAssociation extends js.Object {
  /**
    * The ID of the association between a network ACL and a subnet.
    */
  var NetworkAclAssociationId: js.UndefOr[String] = js.native
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
}

object NetworkAclAssociation {
  @scala.inline
  def apply(): NetworkAclAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAclAssociation]
  }
  @scala.inline
  implicit class NetworkAclAssociationOps[Self <: NetworkAclAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkAclAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAclAssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkAclAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAclAssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkAclId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAclId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkAclId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAclId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
  }
  
}

