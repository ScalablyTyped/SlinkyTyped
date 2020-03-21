package typingsSlinky.jestCli

import typingsSlinky.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionString extends js.Object {
  var description: String
  var `type`: number
}

object AnonDescriptionString {
  @scala.inline
  def apply(description: String, `type`: number): AnonDescriptionString = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionString]
  }
}

