package typingsSlinky.jestCli

import typingsSlinky.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var default: Boolean
  var description: String
  var `type`: boolean
}

object AnonType {
  @scala.inline
  def apply(default: Boolean, description: String, `type`: boolean): AnonType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

