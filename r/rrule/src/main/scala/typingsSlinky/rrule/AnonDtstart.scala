package typingsSlinky.rrule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDtstart extends js.Object {
  var dtstart: js.UndefOr[js.Date | Null] = js.native
  var exdatevals: js.Array[js.Date] = js.native
  var exrulevals: js.Array[PartialOptions] = js.native
  var rdatevals: js.Array[js.Date] = js.native
  var rrulevals: js.Array[PartialOptions] = js.native
  var tzid: js.UndefOr[String | Null] = js.native
}

object AnonDtstart {
  @scala.inline
  def apply(
    exdatevals: js.Array[js.Date],
    exrulevals: js.Array[PartialOptions],
    rdatevals: js.Array[js.Date],
    rrulevals: js.Array[PartialOptions]
  ): AnonDtstart = {
    val __obj = js.Dynamic.literal(exdatevals = exdatevals.asInstanceOf[js.Any], exrulevals = exrulevals.asInstanceOf[js.Any], rdatevals = rdatevals.asInstanceOf[js.Any], rrulevals = rrulevals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDtstart]
  }
  @scala.inline
  implicit class AnonDtstartOps[Self <: AnonDtstart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExdatevals(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exdatevals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExrulevals(value: js.Array[PartialOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exrulevals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdatevals(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdatevals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRrulevals(value: js.Array[PartialOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrulevals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtstart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(js.undefined)
        ret
    }
    @scala.inline
    def withDtstartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(null)
        ret
    }
    @scala.inline
    def withTzid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTzid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(js.undefined)
        ret
    }
    @scala.inline
    def withTzidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(null)
        ret
    }
  }
  
}

