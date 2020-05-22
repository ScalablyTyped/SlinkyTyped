package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpageSince extends js.Object {
  var page: Type
  var per_page: Type
  var since: Type
  var username: Required
}

object PerpageSince {
  @scala.inline
  def apply(page: Type, per_page: Type, since: Type, username: Required): PerpageSince = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageSince]
  }
}

