package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersContenttype extends js.Object {
  var headers: Contenttype
  var method: String
  var params: Data
  var url: String
}

object HeadersContenttype {
  @scala.inline
  def apply(headers: Contenttype, method: String, params: Data, url: String): HeadersContenttype = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersContenttype]
  }
}

