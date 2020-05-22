package typingsSlinky.hapiAddress.mod.uri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  /**
    * The raw regular expression string.
    */
  var raw: String
  /**
    * The regular expression.
    */
  var regex: js.RegExp
}

object Expression {
  @scala.inline
  def apply(raw: String, regex: js.RegExp): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

