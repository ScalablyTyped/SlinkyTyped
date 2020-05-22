package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsNote extends js.Object {
  var deprecated: String
  var method: String
  var params: Note
  var url: String
}

object ParamsNote {
  @scala.inline
  def apply(deprecated: String, method: String, params: Note, url: String): ParamsNote = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsNote]
  }
}

