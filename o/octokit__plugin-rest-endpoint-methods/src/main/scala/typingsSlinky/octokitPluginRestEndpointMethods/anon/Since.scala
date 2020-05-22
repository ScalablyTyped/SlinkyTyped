package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Since extends js.Object {
  var page: Type
  var per_page: Type
  var since: Type
}

object Since {
  @scala.inline
  def apply(page: Type, per_page: Type, since: Type): Since = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.asInstanceOf[Since]
  }
}

