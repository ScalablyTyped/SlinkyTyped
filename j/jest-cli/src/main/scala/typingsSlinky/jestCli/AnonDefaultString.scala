package typingsSlinky.jestCli

import typingsSlinky.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultString extends js.Object {
  var default: String
  var description: String
  var `type`: string
}

object AnonDefaultString {
  @scala.inline
  def apply(default: String, description: String, `type`: string): AnonDefaultString = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultString]
  }
}

