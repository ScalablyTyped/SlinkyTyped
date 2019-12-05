package typingsSlinky.rrule

import typingsSlinky.rrule.distEsmSrcTypesMod.Options
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dtstart extends js.Object {
  var dtstart: js.UndefOr[js.Date | Null] = js.undefined
  var exdatevals: js.Array[js.Date]
  var exrulevals: js.Array[Partial[Options]]
  var rdatevals: js.Array[js.Date]
  var rrulevals: js.Array[Partial[Options]]
  var tzid: js.UndefOr[String | Null] = js.undefined
}

object Anon_Dtstart {
  @scala.inline
  def apply(
    exdatevals: js.Array[js.Date],
    exrulevals: js.Array[Partial[Options]],
    rdatevals: js.Array[js.Date],
    rrulevals: js.Array[Partial[Options]],
    dtstart: js.Date = null,
    tzid: String = null
  ): Anon_Dtstart = {
    val __obj = js.Dynamic.literal(exdatevals = exdatevals.asInstanceOf[js.Any], exrulevals = exrulevals.asInstanceOf[js.Any], rdatevals = rdatevals.asInstanceOf[js.Any], rrulevals = rrulevals.asInstanceOf[js.Any])
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart.asInstanceOf[js.Any])
    if (tzid != null) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dtstart]
  }
}

