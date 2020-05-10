package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddThingsToThingGroupParams extends js.Object {
  /**
    * Specifies if this mitigation action can move the things that triggered the mitigation action even if they are part of one or more dynamic things groups.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.native
  /**
    * The list of groups to which you want to add the things that triggered the mitigation action. You can add a thing to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
    */
  var thingGroupNames: ThingGroupNames = js.native
}

object AddThingsToThingGroupParams {
  @scala.inline
  def apply(thingGroupNames: ThingGroupNames): AddThingsToThingGroupParams = {
    val __obj = js.Dynamic.literal(thingGroupNames = thingGroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddThingsToThingGroupParams]
  }
  @scala.inline
  implicit class AddThingsToThingGroupParamsOps[Self <: AddThingsToThingGroupParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingGroupNames(value: ThingGroupNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

