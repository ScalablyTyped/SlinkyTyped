package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionOrg extends js.Object {
  var direction: Enum
  @JSName("org")
  var org_ : Required
  var page: Type
  var per_page: Type
  var sort: Enum
  var `type`: Enum
}

object DirectionOrg {
  @scala.inline
  def apply(direction: Enum, org_ : Required, page: Type, per_page: Type, sort: Enum, `type`: Enum): DirectionOrg = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionOrg]
  }
}

