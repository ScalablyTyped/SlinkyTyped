package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingGroupResponse extends js.Object {
  /**
    * The thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * The thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object CreateThingGroupResponse {
  @scala.inline
  def apply(): CreateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThingGroupResponse]
  }
  @scala.inline
  implicit class CreateThingGroupResponseOps[Self <: CreateThingGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withThingGroupId(value: ThingGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupId")(js.undefined)
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
  }
  
}

