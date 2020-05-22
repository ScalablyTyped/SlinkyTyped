package typingsSlinky.astTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawRawValue extends js.Object {
  var raw: String
  var rawValue: Double
}

object RawRawValue {
  @scala.inline
  def apply(raw: String, rawValue: Double): RawRawValue = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawRawValue]
  }
}

