package typingsSlinky.awsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[D, E] extends js.Object {
  @JSName("$response")
  var $response: typingsSlinky.awsSdk.responseMod.Response[D, E] = js.native
}

object Response {
  @scala.inline
  def apply[D, E]($response: typingsSlinky.awsSdk.responseMod.Response[D, E]): Response[D, E] = {
    val __obj = js.Dynamic.literal($response = $response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[D, E]]
  }
  @scala.inline
  implicit class ResponseOps[Self[d, e] <: Response[d, e], D, E] (val x: Self[D, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, E]) with Other]
    @scala.inline
    def with$response(value: typingsSlinky.awsSdk.responseMod.Response[D, E]): Self[D, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

