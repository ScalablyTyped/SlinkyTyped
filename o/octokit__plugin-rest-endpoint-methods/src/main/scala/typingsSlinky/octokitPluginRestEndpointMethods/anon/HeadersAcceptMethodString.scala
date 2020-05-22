package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersAcceptMethodString extends js.Object {
  var headers: Accept
  var method: String
  var url: String
}

object HeadersAcceptMethodString {
  @scala.inline
  def apply(headers: Accept, method: String, url: String): HeadersAcceptMethodString = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersAcceptMethodString]
  }
}

