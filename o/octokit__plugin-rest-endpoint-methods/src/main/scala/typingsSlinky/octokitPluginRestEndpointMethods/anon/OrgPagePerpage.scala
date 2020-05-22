package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgPagePerpage extends js.Object {
  @JSName("org")
  var org_ : Required
  var page: Type
  var per_page: Type
  var state: Enum
}

object OrgPagePerpage {
  @scala.inline
  def apply(org_ : Required, page: Type, per_page: Type, state: Enum): OrgPagePerpage = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgPagePerpage]
  }
}

