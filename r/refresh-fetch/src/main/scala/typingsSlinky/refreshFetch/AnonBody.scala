package typingsSlinky.refreshFetch

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBody[ResponseBody] extends js.Object {
  /* tslint:disable-next-line no-unnecessary-generics */
  var body: ResponseBody = js.native
  var response: Response = js.native
}

object AnonBody {
  @scala.inline
  def apply[ResponseBody](body: ResponseBody, response: Response): AnonBody[ResponseBody] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody[ResponseBody]]
  }
  @scala.inline
  implicit class AnonBodyOps[Self[responsebody] <: AnonBody[responsebody], ResponseBody] (val x: Self[ResponseBody]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ResponseBody] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ResponseBody]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ResponseBody] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ResponseBody] with Other]
    @scala.inline
    def withBody(value: ResponseBody): Self[ResponseBody] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Response): Self[ResponseBody] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

