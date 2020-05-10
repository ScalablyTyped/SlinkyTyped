package typingsSlinky.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpoint extends js.Object {
  var endpoint: js.Any = js.native
  var endpointResource: js.Any = js.native
}

object AnonEndpoint {
  @scala.inline
  def apply(endpoint: js.Any, endpointResource: js.Any): AnonEndpoint = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], endpointResource = endpointResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndpoint]
  }
  @scala.inline
  implicit class AnonEndpointOps[Self <: AnonEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointResource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointResource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

