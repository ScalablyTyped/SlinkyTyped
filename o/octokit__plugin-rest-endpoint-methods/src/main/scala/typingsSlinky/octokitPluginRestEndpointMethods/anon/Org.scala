package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Org extends js.Object {
  @JSName("org")
  var org_ : Required
  var page: Type
  var per_page: Type
  var username: Required
}

object Org {
  @scala.inline
  def apply(org_ : Required, page: Type, per_page: Type, username: Required): Org = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Org]
  }
}

