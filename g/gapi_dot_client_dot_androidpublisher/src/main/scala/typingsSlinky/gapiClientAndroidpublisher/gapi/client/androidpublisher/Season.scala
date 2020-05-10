package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Season extends js.Object {
  /** Inclusive end date of the recurrence period. */
  var end: js.UndefOr[MonthDay] = js.native
  /**
    * Optionally present list of prorations for the season. Each proration is a one-off discounted entry into a subscription. Each proration contains the
    * first date on which the discount is available and the new pricing information.
    */
  var prorations: js.UndefOr[js.Array[Prorate]] = js.native
  /** Inclusive start date of the recurrence period. */
  var start: js.UndefOr[MonthDay] = js.native
}

object Season {
  @scala.inline
  def apply(): Season = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Season]
  }
  @scala.inline
  implicit class SeasonOps[Self <: Season] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: MonthDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withProrations(value: js.Array[Prorate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prorations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prorations")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: MonthDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

