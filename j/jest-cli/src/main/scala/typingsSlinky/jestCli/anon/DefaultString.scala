package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultString extends js.Object {
  var default: java.lang.String
  var description: java.lang.String
  var `type`: string
}

object DefaultString {
  @scala.inline
  def apply(default: java.lang.String, description: java.lang.String, `type`: string): DefaultString = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultString]
  }
}

