package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedDescription extends js.Object {
  var deprecated: Boolean
  var description: String
  var `type`: String
}

object DeprecatedDescription {
  @scala.inline
  def apply(deprecated: Boolean, description: String, `type`: String): DeprecatedDescription = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedDescription]
  }
}

