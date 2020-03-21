package typingsSlinky.rrule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDtstart extends js.Object {
  var dtstart: js.UndefOr[js.Date | Null] = js.undefined
  var exdatevals: js.Array[js.Date]
  var exrulevals: js.Array[PartialOptions]
  var rdatevals: js.Array[js.Date]
  var rrulevals: js.Array[PartialOptions]
  var tzid: js.UndefOr[String | Null] = js.undefined
}

object AnonDtstart {
  @scala.inline
  def apply(
    exdatevals: js.Array[js.Date],
    exrulevals: js.Array[PartialOptions],
    rdatevals: js.Array[js.Date],
    rrulevals: js.Array[PartialOptions],
    dtstart: js.Date = null,
    tzid: String = null
  ): AnonDtstart = {
    val __obj = js.Dynamic.literal(exdatevals = exdatevals.asInstanceOf[js.Any], exrulevals = exrulevals.asInstanceOf[js.Any], rdatevals = rdatevals.asInstanceOf[js.Any], rrulevals = rrulevals.asInstanceOf[js.Any])
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart.asInstanceOf[js.Any])
    if (tzid != null) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDtstart]
  }
}

