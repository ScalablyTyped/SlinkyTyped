package typingsSlinky.jestCli

import typingsSlinky.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: js.UndefOr[scala.Nothing] = js.undefined
  var description: String
  var `type`: boolean
}

object AnonDefault {
  @scala.inline
  def apply(description: String, `type`: boolean, default: js.UndefOr[scala.Nothing] = js.undefined): AnonDefault = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

