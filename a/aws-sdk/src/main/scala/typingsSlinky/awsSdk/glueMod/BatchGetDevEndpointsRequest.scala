package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDevEndpointsRequest extends js.Object {
  /**
    * The list of DevEndpoint names, which might be the names returned from the ListDevEndpoint operation.
    */
  var DevEndpointNames: typingsSlinky.awsSdk.glueMod.DevEndpointNames = js.native
}

object BatchGetDevEndpointsRequest {
  @scala.inline
  def apply(DevEndpointNames: DevEndpointNames): BatchGetDevEndpointsRequest = {
    val __obj = js.Dynamic.literal(DevEndpointNames = DevEndpointNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDevEndpointsRequest]
  }
  @scala.inline
  implicit class BatchGetDevEndpointsRequestOps[Self <: BatchGetDevEndpointsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevEndpointNames(value: DevEndpointNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpointNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

