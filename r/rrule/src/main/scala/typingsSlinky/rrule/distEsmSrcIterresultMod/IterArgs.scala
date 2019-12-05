package typingsSlinky.rrule.distEsmSrcIterresultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterArgs extends js.Object {
  var _value: js.Date | js.Array[js.Date] | Null
  var after: js.Date
  var before: js.Date
  var dt: js.Date
  var inc: Boolean
}

object IterArgs {
  @scala.inline
  def apply(
    after: js.Date,
    before: js.Date,
    dt: js.Date,
    inc: Boolean,
    _value: js.Date | js.Array[js.Date] = null
  ): IterArgs = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], inc = inc.asInstanceOf[js.Any])
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterArgs]
  }
}

