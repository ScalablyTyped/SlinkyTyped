package typingsSlinky.jestCli

import typingsSlinky.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionType extends js.Object {
  var description: String
  var `type`: boolean
}

object AnonDescriptionType {
  @scala.inline
  def apply(description: String, `type`: boolean): AnonDescriptionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionType]
  }
}

