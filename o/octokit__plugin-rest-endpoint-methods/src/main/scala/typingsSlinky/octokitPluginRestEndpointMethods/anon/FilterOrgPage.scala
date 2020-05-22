package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOrgPage extends js.Object {
  var filter: Enum
  @JSName("org")
  var org_ : Required
  var page: Type
  var per_page: Type
}

object FilterOrgPage {
  @scala.inline
  def apply(filter: Enum, org_ : Required, page: Type, per_page: Type): FilterOrgPage = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOrgPage]
  }
}

