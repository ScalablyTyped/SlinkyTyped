package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  var alias: java.lang.String
  var default: js.UndefOr[scala.Nothing] = js.undefined
  var description: java.lang.String
  var `type`: boolean
}

object Alias {
  @scala.inline
  def apply(alias: java.lang.String, description: java.lang.String, `type`: boolean): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
}

