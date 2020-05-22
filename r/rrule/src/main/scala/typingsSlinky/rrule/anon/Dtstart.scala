package typingsSlinky.rrule.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dtstart extends js.Object {
  var dtstart: js.UndefOr[js.Date | Null] = js.undefined
  var exdatevals: js.Array[js.Date]
  var exrulevals: js.Array[PartialOptions]
  var rdatevals: js.Array[js.Date]
  var rrulevals: js.Array[PartialOptions]
  var tzid: js.UndefOr[String | Null] = js.undefined
}

object Dtstart {
  @scala.inline
  def apply(
    exdatevals: js.Array[js.Date],
    exrulevals: js.Array[PartialOptions],
    rdatevals: js.Array[js.Date],
    rrulevals: js.Array[PartialOptions],
    dtstart: js.UndefOr[Null | js.Date] = js.undefined,
    tzid: js.UndefOr[Null | String] = js.undefined
  ): Dtstart = {
    val __obj = js.Dynamic.literal(exdatevals = exdatevals.asInstanceOf[js.Any], exrulevals = exrulevals.asInstanceOf[js.Any], rdatevals = rdatevals.asInstanceOf[js.Any], rrulevals = rrulevals.asInstanceOf[js.Any])
    if (!js.isUndefined(dtstart)) __obj.updateDynamic("dtstart")(dtstart.asInstanceOf[js.Any])
    if (!js.isUndefined(tzid)) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dtstart]
  }
}

