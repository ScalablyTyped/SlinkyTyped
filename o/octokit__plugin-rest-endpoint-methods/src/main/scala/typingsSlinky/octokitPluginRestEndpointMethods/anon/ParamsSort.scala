package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsSort extends js.Object {
  var method: String
  var params: Sort
  var url: String
}

object ParamsSort {
  @scala.inline
  def apply(method: String, params: Sort, url: String): ParamsSort = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsSort]
  }
}

