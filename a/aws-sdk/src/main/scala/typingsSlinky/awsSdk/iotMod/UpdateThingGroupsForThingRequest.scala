package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThingGroupsForThingRequest extends js.Object {
  /**
    * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.native
  /**
    * The groups to which the thing will be added.
    */
  var thingGroupsToAdd: js.UndefOr[ThingGroupList] = js.native
  /**
    * The groups from which the thing will be removed.
    */
  var thingGroupsToRemove: js.UndefOr[ThingGroupList] = js.native
  /**
    * The thing whose group memberships will be updated.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object UpdateThingGroupsForThingRequest {
  @scala.inline
  def apply(): UpdateThingGroupsForThingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThingGroupsForThingRequest]
  }
  @scala.inline
  implicit class UpdateThingGroupsForThingRequestOps[Self <: UpdateThingGroupsForThingRequest] (val x: Self) extends AnyVal {
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
    def withThingGroupsToAdd(value: ThingGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupsToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupsToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupsToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withThingGroupsToRemove(value: ThingGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupsToRemove")(js.undefined)
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

