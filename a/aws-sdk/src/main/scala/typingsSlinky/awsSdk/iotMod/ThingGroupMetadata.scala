package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupMetadata extends js.Object {
  /**
    * The UNIX timestamp of when the thing group was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The parent thing group name.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * The root parent thing group.
    */
  var rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.native
}

object ThingGroupMetadata {
  @scala.inline
  def apply(): ThingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupMetadata]
  }
  @scala.inline
  implicit class ThingGroupMetadataOps[Self <: ThingGroupMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
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
    def withRootToParentThingGroups(value: ThingGroupNameAndArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootToParentThingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootToParentThingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootToParentThingGroups")(js.undefined)
        ret
    }
  }
  
}

