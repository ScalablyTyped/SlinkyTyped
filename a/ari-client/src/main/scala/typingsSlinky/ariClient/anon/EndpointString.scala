package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointString extends js.Object {
  var endpoint: String = js.native
}

object EndpointString {
  @scala.inline
  def apply(endpoint: String): EndpointString = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointString]
  }
  @scala.inline
  implicit class EndpointStringOps[Self <: EndpointString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

