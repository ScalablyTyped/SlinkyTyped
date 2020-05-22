package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlString extends js.Object {
  var method: String
  var url: String
}

object UrlString {
  @scala.inline
  def apply(method: String, url: String): UrlString = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlString]
  }
}

