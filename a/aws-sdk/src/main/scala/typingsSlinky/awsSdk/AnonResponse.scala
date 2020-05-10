package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.responseMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResponse[D, E] extends js.Object {
  @JSName("$response")
  var $response: Response[D, E] = js.native
}

object AnonResponse {
  @scala.inline
  def apply[D, E]($response: Response[D, E]): AnonResponse[D, E] = {
    val __obj = js.Dynamic.literal($response = $response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResponse[D, E]]
  }
  @scala.inline
  implicit class AnonResponseOps[Self[d, e] <: AnonResponse[d, e], D, E] (val x: Self[D, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, E]) with Other]
    @scala.inline
    def with$response(value: Response[D, E]): Self[D, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

