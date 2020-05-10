package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDynamicThingGroupRequest extends js.Object {
  /**
    * The dynamic thing group index name.  Currently one index is supported: "AWS_Things". 
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The dynamic thing group search query string. See Query Syntax for information about query string syntax.
    */
  var queryString: QueryString = js.native
  /**
    * The dynamic thing group query version.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
  /**
    * Metadata which can be used to manage the dynamic thing group.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The dynamic thing group name to create.
    */
  var thingGroupName: ThingGroupName = js.native
  /**
    * The dynamic thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
}

object CreateDynamicThingGroupRequest {
  @scala.inline
  def apply(queryString: QueryString, thingGroupName: ThingGroupName): CreateDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any], thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDynamicThingGroupRequest]
  }
  @scala.inline
  implicit class CreateDynamicThingGroupRequestOps[Self <: CreateDynamicThingGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryString(value: QueryString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThingGroupName(value: ThingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupName")(value.asInstanceOf[js.Any])
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
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
  }
  
}

