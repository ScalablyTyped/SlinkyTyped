package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDynamicThingGroupResponse extends js.Object {
  /**
    * The dynamic thing group index name.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The dynamic thing group search query string.
    */
  var queryString: js.UndefOr[QueryString] = js.native
  /**
    * The dynamic thing group query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
  /**
    * The dynamic thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The dynamic thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * The dynamic thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object CreateDynamicThingGroupResponse {
  @scala.inline
  def apply(): CreateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDynamicThingGroupResponse]
  }
  @scala.inline
  implicit class CreateDynamicThingGroupResponseOps[Self <: CreateDynamicThingGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: IndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryString(value: QueryString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryVersion(value: QueryVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryVersion")(js.undefined)
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

