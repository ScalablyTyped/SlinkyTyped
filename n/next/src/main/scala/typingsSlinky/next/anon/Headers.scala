package typingsSlinky.next.anon

import typingsSlinky.next.checkCustomRoutesMod.Header
import typingsSlinky.next.checkCustomRoutesMod.Redirect
import typingsSlinky.next.checkCustomRoutesMod.Rewrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var headers: js.Array[Header]
  var redirects: js.Array[Redirect]
  var rewrites: js.Array[Rewrite]
}

object Headers {
  @scala.inline
  def apply(headers: js.Array[Header], redirects: js.Array[Redirect], rewrites: js.Array[Rewrite]): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

