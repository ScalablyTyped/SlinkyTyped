package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAcl extends js.Object {
  /**
    * Any associations between the network ACL and one or more subnets
    */
  var Associations: js.UndefOr[NetworkAclAssociationList] = js.native
  /**
    * One or more entries (rules) in the network ACL.
    */
  var Entries: js.UndefOr[NetworkAclEntryList] = js.native
  /**
    * Indicates whether this is the default network ACL for the VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the network ACL.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the network ACL.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC for the network ACL.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object NetworkAcl {
  @scala.inline
  def apply(): NetworkAcl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAcl]
  }
  @scala.inline
  implicit class NetworkAclOps[Self <: NetworkAcl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociations(value: NetworkAclAssociationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Associations")(js.undefined)
        ret
    }
    @scala.inline
    def withEntries(value: NetworkAclEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(js.undefined)
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
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

