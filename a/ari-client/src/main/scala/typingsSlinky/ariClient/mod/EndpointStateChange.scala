package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointStateChange extends Event {
  /* Properties */
  var endpoint: Endpoint = js.native
}

object EndpointStateChange {
  @scala.inline
  def apply(application: String, endpoint: Endpoint, timestamp: js.Date, `type`: String): EndpointStateChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointStateChange]
  }
  @scala.inline
  implicit class EndpointStateChangeOps[Self <: EndpointStateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

