package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionType extends js.Object {
  var description: java.lang.String
  var `type`: boolean
}

object DescriptionType {
  @scala.inline
  def apply(description: java.lang.String, `type`: boolean): DescriptionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionType]
  }
}

