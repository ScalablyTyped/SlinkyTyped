package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDynamicThingGroupRequest extends js.Object {
  /**
    * The expected version of the dynamic thing group to update.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * The dynamic thing group index to update.  Currently one index is supported: 'AWS_Things'. 
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The dynamic thing group search query string to update.
    */
  var queryString: js.UndefOr[QueryString] = js.native
  /**
    * The dynamic thing group query version to update.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
  /**
    * The name of the dynamic thing group to update.
    */
  var thingGroupName: ThingGroupName = js.native
  /**
    * The dynamic thing group properties to update.
    */
  var thingGroupProperties: ThingGroupProperties = js.native
}

object UpdateDynamicThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName, thingGroupProperties: ThingGroupProperties): UpdateDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any], thingGroupProperties = thingGroupProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDynamicThingGroupRequest]
  }
  @scala.inline
  implicit class UpdateDynamicThingGroupRequestOps[Self <: UpdateDynamicThingGroupRequest] (val x: Self) extends AnyVal {
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
  }
  
}

