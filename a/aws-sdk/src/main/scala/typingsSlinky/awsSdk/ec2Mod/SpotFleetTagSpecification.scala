package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetTagSpecification extends js.Object {
  /**
    * The type of resource. Currently, the only resource type that is supported is instance. To tag the Spot Fleet request on creation, use the TagSpecifications parameter in  SpotFleetRequestConfigData .
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ResourceType] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object SpotFleetTagSpecification {
  @scala.inline
  def apply(): SpotFleetTagSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetTagSpecification]
  }
  @scala.inline
  implicit class SpotFleetTagSpecificationOps[Self <: SpotFleetTagSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

