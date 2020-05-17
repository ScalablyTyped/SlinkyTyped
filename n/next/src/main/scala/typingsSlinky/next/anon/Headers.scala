package typingsSlinky.next.anon

import typingsSlinky.next.checkCustomRoutesMod.Header
import typingsSlinky.next.checkCustomRoutesMod.Redirect
import typingsSlinky.next.checkCustomRoutesMod.Rewrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  var headers: js.Array[Header] = js.native
  var redirects: js.Array[Redirect] = js.native
  var rewrites: js.Array[Rewrite] = js.native
}

object Headers {
  @scala.inline
  def apply(headers: js.Array[Header], redirects: js.Array[Redirect], rewrites: js.Array[Rewrite]): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Array[Header]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirects(value: js.Array[Redirect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRewrites(value: js.Array[Rewrite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrites")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

