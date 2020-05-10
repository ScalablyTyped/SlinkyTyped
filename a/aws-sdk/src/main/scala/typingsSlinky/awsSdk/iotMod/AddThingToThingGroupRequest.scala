package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddThingToThingGroupRequest extends js.Object {
  /**
    * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.native
  /**
    * The ARN of the thing to add to a group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The ARN of the group to which you are adding a thing.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The name of the group to which you are adding a thing.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * The name of the thing to add to a group.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object AddThingToThingGroupRequest {
  @scala.inline
  def apply(): AddThingToThingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddThingToThingGroupRequest]
  }
  @scala.inline
  implicit class AddThingToThingGroupRequestOps[Self <: AddThingToThingGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverrideDynamicGroups(value: OverrideDynamicGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideDynamicGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideDynamicGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideDynamicGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withThingArn(value: ThingArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingArn")(js.undefined)
        ret
    }
    @scala.inline
    def withThingGroupArn(value: ThingGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withThingGroupName(value: ThingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(js.undefined)
        ret
    }
  }
  
}

