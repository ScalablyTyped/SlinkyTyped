package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDescription extends js.Object {
  var default: js.UndefOr[scala.Nothing] = js.undefined
  var description: java.lang.String
  var `type`: string
}

object DefaultDescription {
  @scala.inline
  def apply(description: java.lang.String, `type`: string): DefaultDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescription]
  }
}

