package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsCommitid extends js.Object {
  var method: String
  var params: Commitid
  var url: String
}

object ParamsCommitid {
  @scala.inline
  def apply(method: String, params: Commitid, url: String): ParamsCommitid = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsCommitid]
  }
}

