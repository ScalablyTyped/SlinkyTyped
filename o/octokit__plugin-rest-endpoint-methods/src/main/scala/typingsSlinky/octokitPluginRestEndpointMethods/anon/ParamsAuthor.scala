package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAuthor extends js.Object {
  var method: String
  var params: Author
  var url: String
}

object ParamsAuthor {
  @scala.inline
  def apply(method: String, params: Author, url: String): ParamsAuthor = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAuthor]
  }
}

