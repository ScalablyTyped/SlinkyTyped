package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowNull extends js.Object {
  var allowNull: Boolean
  var `type`: String
}

object AllowNull {
  @scala.inline
  def apply(allowNull: Boolean, `type`: String): AllowNull = {
    val __obj = js.Dynamic.literal(allowNull = allowNull.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowNull]
  }
}

