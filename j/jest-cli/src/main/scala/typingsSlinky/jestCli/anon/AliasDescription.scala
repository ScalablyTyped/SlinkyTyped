package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasDescription extends js.Object {
  var alias: java.lang.String
  var description: java.lang.String
  var `type`: string
}

object AliasDescription {
  @scala.inline
  def apply(alias: java.lang.String, description: java.lang.String, `type`: string): AliasDescription = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDescription]
  }
}

