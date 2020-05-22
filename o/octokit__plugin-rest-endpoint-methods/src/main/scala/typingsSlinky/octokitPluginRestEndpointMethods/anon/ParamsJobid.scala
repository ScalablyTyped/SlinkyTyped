package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsJobid extends js.Object {
  var method: String
  var params: Jobid
  var url: String
}

object ParamsJobid {
  @scala.inline
  def apply(method: String, params: Jobid, url: String): ParamsJobid = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsJobid]
  }
}

