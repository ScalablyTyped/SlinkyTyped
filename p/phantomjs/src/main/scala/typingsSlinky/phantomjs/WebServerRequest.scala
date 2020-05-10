package typingsSlinky.phantomjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServerRequest extends js.Object {
  var headers: StringDictionary[String] = js.native
  var httpVersion: Double = js.native
  var method: String = js.native
  var post: String = js.native
  var postRaw: String = js.native
  var url: String = js.native
}

object WebServerRequest {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    httpVersion: Double,
    method: String,
    post: String,
    postRaw: String,
    url: String
  ): WebServerRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], postRaw = postRaw.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebServerRequest]
  }
  @scala.inline
  implicit class WebServerRequestOps[Self <: WebServerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

