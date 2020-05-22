package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAssetid extends js.Object {
  var method: String
  var params: Assetid
  var url: String
}

object ParamsAssetid {
  @scala.inline
  def apply(method: String, params: Assetid, url: String): ParamsAssetid = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAssetid]
  }
}

