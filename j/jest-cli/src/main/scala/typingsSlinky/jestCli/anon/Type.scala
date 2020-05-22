package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var default: Boolean
  var description: java.lang.String
  var `type`: boolean
}

object Type {
  @scala.inline
  def apply(default: Boolean, description: java.lang.String, `type`: boolean): Type = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

