package typingsSlinky.rrule.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rrule.rrule/dist/esm/src/iterresult.IterArgs> */
trait PartialIterArgs extends js.Object {
  var _value: js.UndefOr[js.Date | js.Array[js.Date]] = js.undefined
  var after: js.UndefOr[js.Date] = js.undefined
  var before: js.UndefOr[js.Date] = js.undefined
  var dt: js.UndefOr[js.Date] = js.undefined
  var inc: js.UndefOr[Boolean] = js.undefined
}

object PartialIterArgs {
  @scala.inline
  def apply(
    _value: js.Date | js.Array[js.Date] = null,
    after: js.Date = null,
    before: js.Date = null,
    dt: js.Date = null,
    inc: js.UndefOr[Boolean] = js.undefined
  ): PartialIterArgs = {
    val __obj = js.Dynamic.literal()
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (dt != null) __obj.updateDynamic("dt")(dt.asInstanceOf[js.Any])
    if (!js.isUndefined(inc)) __obj.updateDynamic("inc")(inc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIterArgs]
  }
}

