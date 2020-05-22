package typingsSlinky.rrule.rrulestrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RRuleStrOptions extends js.Object {
  var cache: Boolean
  var compatible: Boolean
  var dtstart: js.Date | Null
  var forceset: Boolean
  var tzid: String | Null
  var unfold: Boolean
}

object RRuleStrOptions {
  @scala.inline
  def apply(
    cache: Boolean,
    compatible: Boolean,
    forceset: Boolean,
    unfold: Boolean,
    dtstart: js.Date = null,
    tzid: String = null
  ): RRuleStrOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], compatible = compatible.asInstanceOf[js.Any], forceset = forceset.asInstanceOf[js.Any], unfold = unfold.asInstanceOf[js.Any], dtstart = dtstart.asInstanceOf[js.Any], tzid = tzid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RRuleStrOptions]
  }
}

