package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsGistidPage extends js.Object {
  var method: String
  var params: GistidPage
  var url: String
}

object ParamsGistidPage {
  @scala.inline
  def apply(method: String, params: GistidPage, url: String): ParamsGistidPage = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsGistidPage]
  }
}

