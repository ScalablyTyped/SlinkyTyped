package typingsSlinky.jpm.requestMod

import typingsSlinky.jpm.FFAddonSDK.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait STRequest[ResponseType] extends BaseRequest {
  var response: STResponse[ResponseType] = js.native
}

object STRequest {
  @scala.inline
  def apply[ResponseType](
    content: String,
    contentType: String,
    delete: () => Unit,
    get: () => Unit,
    head: () => Unit,
    headers: js.Object,
    post: () => Unit,
    put: () => Unit,
    response: STResponse[ResponseType],
    url: String | SDKURL
  ): STRequest[ResponseType] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers.asInstanceOf[js.Any], post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), response = response.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[STRequest[ResponseType]]
  }
  @scala.inline
  implicit class STRequestOps[Self[responsetype] <: STRequest[responsetype], ResponseType] (val x: Self[ResponseType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ResponseType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ResponseType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ResponseType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ResponseType] with Other]
    @scala.inline
    def withResponse(value: STResponse[ResponseType]): Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

