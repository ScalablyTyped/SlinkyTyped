package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliBooleans.`true`
import typingsSlinky.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  var description: java.lang.String
  var string: `true`
  var `type`: array
}

object String {
  @scala.inline
  def apply(description: java.lang.String, string: `true`, `type`: array): String = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

