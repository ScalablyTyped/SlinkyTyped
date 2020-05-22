package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDescriptionType extends js.Object {
  var default: Double
  var description: java.lang.String
  var `type`: number
}

object DefaultDescriptionType {
  @scala.inline
  def apply(default: Double, description: java.lang.String, `type`: number): DefaultDescriptionType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescriptionType]
  }
}

