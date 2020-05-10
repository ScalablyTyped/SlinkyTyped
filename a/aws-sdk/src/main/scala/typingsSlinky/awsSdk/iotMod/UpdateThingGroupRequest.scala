package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThingGroupRequest extends js.Object {
  /**
    * The expected version of the thing group. If this does not match the version of the thing group being updated, the update will fail.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * The thing group to update.
    */
  var thingGroupName: ThingGroupName = js.native
  /**
    * The thing group properties.
    */
  var thingGroupProperties: ThingGroupProperties = js.native
}

object UpdateThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName, thingGroupProperties: ThingGroupProperties): UpdateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any], thingGroupProperties = thingGroupProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingGroupRequest]
  }
  @scala.inline
  implicit class UpdateThingGroupRequestOps[Self <: UpdateThingGroupRequest] (val x: Self) extends AnyVal {
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
    def withThingGroupProperties(value: ThingGroupProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpectedVersion(value: OptionalVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedVersion")(js.undefined)
        ret
    }
  }
  
}

