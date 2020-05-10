package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataflowEndpointGroupIdResponse extends js.Object {
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.native
}

object DataflowEndpointGroupIdResponse {
  @scala.inline
  def apply(): DataflowEndpointGroupIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataflowEndpointGroupIdResponse]
  }
  @scala.inline
  implicit class DataflowEndpointGroupIdResponseOps[Self <: DataflowEndpointGroupIdResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

