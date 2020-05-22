package typingsSlinky.astTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawString extends js.Object {
  var raw: String
  var rawValue: String
}

object RawString {
  @scala.inline
  def apply(raw: String, rawValue: String): RawString = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawString]
  }
}

