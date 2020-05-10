package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupDocument extends js.Object {
  /**
    * The thing group attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * Parent group names.
    */
  var parentGroupNames: js.UndefOr[ThingGroupNameList] = js.native
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.native
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * The thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object ThingGroupDocument {
  @scala.inline
  def apply(): ThingGroupDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupDocument]
  }
  @scala.inline
  implicit class ThingGroupDocumentOps[Self <: ThingGroupDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withParentGroupNames(value: ThingGroupNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withThingGroupDescription(value: ThingGroupDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupDescription")(js.undefined)
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

