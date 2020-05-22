package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagePerpage extends js.Object {
  var page: Type
  var per_page: Type
}

object PagePerpage {
  @scala.inline
  def apply(page: Type, per_page: Type): PagePerpage = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePerpage]
  }
}

