package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointItemResponse extends js.Object {
  /**
    * A custom message associated with the registration of an endpoint when issuing a response.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The status code associated with the merging of an endpoint when issuing a response.
    */
  var StatusCode: js.UndefOr[Double] = js.native
}

object EndpointItemResponse {
  @scala.inline
  def apply(): EndpointItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointItemResponse]
  }
  @scala.inline
  implicit class EndpointItemResponseOps[Self <: EndpointItemResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(js.undefined)
        ret
    }
  }
  
}

