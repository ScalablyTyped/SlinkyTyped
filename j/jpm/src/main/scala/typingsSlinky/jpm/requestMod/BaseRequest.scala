package typingsSlinky.jpm.requestMod

import typingsSlinky.jpm.FFAddonSDK.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseRequest extends js.Object {
  var content: String = js.native
  var contentType: String = js.native
  var headers: js.Object = js.native
  var url: String | SDKURL = js.native
  def delete(): Unit = js.native
  def get(): Unit = js.native
  def head(): Unit = js.native
  def post(): Unit = js.native
  def put(): Unit = js.native
}

object BaseRequest {
  @scala.inline
  def apply(
    content: String,
    contentType: String,
    delete: () => Unit,
    get: () => Unit,
    head: () => Unit,
    headers: js.Object,
    post: () => Unit,
    put: () => Unit,
    url: String | SDKURL
  ): BaseRequest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers.asInstanceOf[js.Any], post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRequest]
  }
  @scala.inline
  implicit class BaseRequestOps[Self <: BaseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHead(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrl(value: String | SDKURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

