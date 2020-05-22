package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionString extends js.Object {
  var description: java.lang.String
  var `type`: number
}

object DescriptionString {
  @scala.inline
  def apply(description: java.lang.String, `type`: number): DescriptionString = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionString]
  }
}

