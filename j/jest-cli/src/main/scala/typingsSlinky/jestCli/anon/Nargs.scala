package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nargs extends js.Object {
  var description: java.lang.String
  var nargs: Double
  var `type`: string
}

object Nargs {
  @scala.inline
  def apply(description: java.lang.String, nargs: Double, `type`: string): Nargs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], nargs = nargs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nargs]
  }
}

