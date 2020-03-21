package typingsSlinky.jestCli

import typingsSlinky.jestCli.jestCliBooleans.`true`
import typingsSlinky.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonString extends js.Object {
  var description: String
  var string: `true`
  var `type`: array
}

object AnonString {
  @scala.inline
  def apply(description: String, string: `true`, `type`: array): AnonString = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonString]
  }
}

