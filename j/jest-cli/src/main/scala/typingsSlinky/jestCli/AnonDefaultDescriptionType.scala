package typingsSlinky.jestCli

import typingsSlinky.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultDescriptionType extends js.Object {
  var default: Double
  var description: String
  var `type`: number
}

object AnonDefaultDescriptionType {
  @scala.inline
  def apply(default: Double, description: String, `type`: number): AnonDefaultDescriptionType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultDescriptionType]
  }
}

