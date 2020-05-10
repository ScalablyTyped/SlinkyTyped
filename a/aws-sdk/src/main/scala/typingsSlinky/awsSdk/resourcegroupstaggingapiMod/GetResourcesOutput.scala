package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcesOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  /**
    * A list of resource ARNs and the tags (keys and values) associated with each.
    */
  var ResourceTagMappingList: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ResourceTagMappingList] = js.native
}

object GetResourcesOutput {
  @scala.inline
  def apply(): GetResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesOutput]
  }
  @scala.inline
  implicit class GetResourcesOutputOps[Self <: GetResourcesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaginationToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTagMappingList(value: ResourceTagMappingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTagMappingList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTagMappingList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTagMappingList")(js.undefined)
        ret
    }
  }
  
}

