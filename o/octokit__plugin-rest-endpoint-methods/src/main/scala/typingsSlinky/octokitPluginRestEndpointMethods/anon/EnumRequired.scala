package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumRequired extends js.Object {
  var enum: js.Array[String]
  var required: Boolean
  var `type`: String
}

object EnumRequired {
  @scala.inline
  def apply(enum: js.Array[String], required: Boolean, `type`: String): EnumRequired = {
    val __obj = js.Dynamic.literal(enum = enum.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumRequired]
  }
}

