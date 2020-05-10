package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataflowEndpointListItem extends js.Object {
  /**
    * ARN of a dataflow endpoint group.
    */
  var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.native
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.native
}

object DataflowEndpointListItem {
  @scala.inline
  def apply(): DataflowEndpointListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataflowEndpointListItem]
  }
  @scala.inline
  implicit class DataflowEndpointListItemOps[Self <: DataflowEndpointListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataflowEndpointGroupArn(value: DataflowEndpointGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataflowEndpointGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDataflowEndpointGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataflowEndpointGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointGroupId")(js.undefined)
        ret
    }
  }
  
}

