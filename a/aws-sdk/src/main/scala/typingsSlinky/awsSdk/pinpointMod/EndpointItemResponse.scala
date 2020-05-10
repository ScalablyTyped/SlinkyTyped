package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointItemResponse extends js.Object {
  /**
    * The custom message that's returned in the response as a result of processing the endpoint data.
    */
  var Message: js.UndefOr[string] = js.native
  /**
    * The status code that's returned in the response as a result of processing the endpoint data.
    */
  var StatusCode: js.UndefOr[integer] = js.native
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
    def withMessage(value: string): Self = {
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
    def withStatusCode(value: integer): Self = {
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

