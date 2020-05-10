package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingGroupRequest extends js.Object {
  /**
    * The name of the parent thing group.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * Metadata which can be used to manage the thing group.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The thing group name to create.
    */
  var thingGroupName: ThingGroupName = js.native
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
}

object CreateThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName): CreateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingGroupRequest]
  }
  @scala.inline
  implicit class CreateThingGroupRequestOps[Self <: CreateThingGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingGroupName(value: ThingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentGroupName(value: ThingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withThingGroupProperties(value: ThingGroupProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupProperties")(js.undefined)
        ret
    }
  }
  
}

