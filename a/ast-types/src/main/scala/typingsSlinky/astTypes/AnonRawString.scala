package typingsSlinky.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRawString extends js.Object {
  var raw: String
  var rawValue: String
}

object AnonRawString {
  @scala.inline
  def apply(raw: String, rawValue: String): AnonRawString = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRawString]
  }
}

