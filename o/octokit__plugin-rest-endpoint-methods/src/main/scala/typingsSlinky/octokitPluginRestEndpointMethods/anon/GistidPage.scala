package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistidPage extends js.Object {
  var gist_id: Required
  var page: Type
  var per_page: Type
}

object GistidPage {
  @scala.inline
  def apply(gist_id: Required, page: Type, per_page: Type): GistidPage = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistidPage]
  }
}

