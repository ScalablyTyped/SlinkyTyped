package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) with which the tag is associated, for example: arn:aws:redshift:us-east-2:123456789:cluster:t1.
    */
  var ResourceName: js.UndefOr[String] = js.native
  /**
    * The type of resource with which the tag is associated. Valid resource types are:    Cluster   CIDR/IP   EC2 security group   Snapshot   Cluster security group   Subnet group   HSM connection   HSM certificate   Parameter group   For more information about Amazon Redshift resource types and constructing ARNs, go to Constructing an Amazon Redshift Amazon Resource Name (ARN) in the Amazon Redshift Cluster Management Guide. 
    */
  var ResourceType: js.UndefOr[String] = js.native
  /**
    * The tag for the resource.
    */
  var Tag: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.Tag] = js.native
}

object TaggedResource {
  @scala.inline
  def apply(): TaggedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaggedResource]
  }
  @scala.inline
  implicit class TaggedResourceOps[Self <: TaggedResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: Tag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

