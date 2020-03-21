package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSince extends js.Object {
  var page: AnonType
  var per_page: AnonType
  var since: AnonType
}

object AnonSince {
  @scala.inline
  def apply(page: AnonType, per_page: AnonType, since: AnonType): AnonSince = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSince]
  }
}

