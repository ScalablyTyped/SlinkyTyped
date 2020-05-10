package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingGroupResponse extends js.Object {
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
    * The dynamic thing group status.
    */
  var status: js.UndefOr[DynamicGroupStatus] = js.native
  /**
    * The thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * Thing group metadata.
    */
  var thingGroupMetadata: js.UndefOr[ThingGroupMetadata] = js.native
  /**
    * The name of the thing group.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
  /**
    * The version of the thing group.
    */
  var version: js.UndefOr[Version] = js.native
}

object DescribeThingGroupResponse {
  @scala.inline
  def apply(): DescribeThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingGroupResponse]
  }
  @scala.inline
  implicit class DescribeThingGroupResponseOps[Self <: DescribeThingGroupResponse] (val x: Self) extends AnyVal {
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
    def withStatus(value: DynamicGroupStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
    def withThingGroupMetadata(value: ThingGroupMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupMetadata")(js.undefined)
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
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

