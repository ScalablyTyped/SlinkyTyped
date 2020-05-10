package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdentifier extends js.Object {
  /**
    * The ARN of a resource.
    */
  var ResourceArn: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.ResourceArn] = js.native
  /**
    * The resource type of a resource, such as AWS::EC2::Instance.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.ResourceType] = js.native
}

object ResourceIdentifier {
  @scala.inline
  def apply(): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifier]
  }
  @scala.inline
  implicit class ResourceIdentifierOps[Self <: ResourceIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
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
  }
  
}

