package typingsSlinky.anyproxy.mod

import typingsSlinky.anyproxy.PartialResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeSendResponseResult extends js.Object {
  var response: PartialResponse = js.native
}

object BeforeSendResponseResult {
  @scala.inline
  def apply(response: PartialResponse): BeforeSendResponseResult = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeSendResponseResult]
  }
  @scala.inline
  implicit class BeforeSendResponseResultOps[Self <: BeforeSendResponseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponse(value: PartialResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

