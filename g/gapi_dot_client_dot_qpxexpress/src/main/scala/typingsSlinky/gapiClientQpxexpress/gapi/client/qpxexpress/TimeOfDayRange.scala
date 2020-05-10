package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeOfDayRange extends js.Object {
  /** The earliest time of day in HH:MM format. */
  var earliestTime: js.UndefOr[String] = js.native
  /**
    * Identifies this as a time of day range object, representing two times in a single day defining a time range. Value: the fixed string
    * qpxexpress#timeOfDayRange.
    */
  var kind: js.UndefOr[String] = js.native
  /** The latest time of day in HH:MM format. */
  var latestTime: js.UndefOr[String] = js.native
}

object TimeOfDayRange {
  @scala.inline
  def apply(): TimeOfDayRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOfDayRange]
  }
  @scala.inline
  implicit class TimeOfDayRangeOps[Self <: TimeOfDayRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEarliestTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earliestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarliestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earliestTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestTime")(js.undefined)
        ret
    }
  }
  
}

