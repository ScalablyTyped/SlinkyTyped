package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDynamicThingGroupRequest extends js.Object {
  /**
    * The expected version of the dynamic thing group to delete.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * The name of the dynamic thing group to delete.
    */
  var thingGroupName: ThingGroupName = js.native
}

object DeleteDynamicThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName): DeleteDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDynamicThingGroupRequest]
  }
  @scala.inline
  implicit class DeleteDynamicThingGroupRequestOps[Self <: DeleteDynamicThingGroupRequest] (val x: Self) extends AnyVal {
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

