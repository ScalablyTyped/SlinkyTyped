package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataflowEndpointGroupsResponse extends js.Object {
  /**
    * A list of dataflow endpoint groups.
    */
  var dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList] = js.native
  /**
    * Next token returned in the response of a previous ListDataflowEndpointGroups call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListDataflowEndpointGroupsResponse {
  @scala.inline
  def apply(): ListDataflowEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataflowEndpointGroupsResponse]
  }
  @scala.inline
  implicit class ListDataflowEndpointGroupsResponseOps[Self <: ListDataflowEndpointGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataflowEndpointGroupList(value: DataflowEndpointGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointGroupList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataflowEndpointGroupList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointGroupList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

