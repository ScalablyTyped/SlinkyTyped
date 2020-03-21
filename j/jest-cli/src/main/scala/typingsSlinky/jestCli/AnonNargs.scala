package typingsSlinky.jestCli

import typingsSlinky.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNargs extends js.Object {
  var description: String
  var nargs: Double
  var `type`: string
}

object AnonNargs {
  @scala.inline
  def apply(description: String, nargs: Double, `type`: string): AnonNargs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], nargs = nargs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNargs]
  }
}

