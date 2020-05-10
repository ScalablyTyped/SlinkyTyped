package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDevEndpointsResponse extends js.Object {
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.native
  /**
    * A list of DevEndpoints not found.
    */
  var DevEndpointsNotFound: js.UndefOr[DevEndpointNames] = js.native
}

object BatchGetDevEndpointsResponse {
  @scala.inline
  def apply(): BatchGetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDevEndpointsResponse]
  }
  @scala.inline
  implicit class BatchGetDevEndpointsResponseOps[Self <: BatchGetDevEndpointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevEndpoints(value: DevEndpointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withDevEndpointsNotFound(value: DevEndpointNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpointsNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevEndpointsNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpointsNotFound")(js.undefined)
        ret
    }
  }
  
}

