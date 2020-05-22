package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsEvent extends js.Object {
  var method: String
  var params: Event
  var url: String
}

object ParamsEvent {
  @scala.inline
  def apply(method: String, params: Event, url: String): ParamsEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsEvent]
  }
}

