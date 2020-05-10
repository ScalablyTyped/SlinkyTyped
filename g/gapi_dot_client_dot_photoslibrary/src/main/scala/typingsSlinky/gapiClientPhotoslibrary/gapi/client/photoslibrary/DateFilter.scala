package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFilter extends js.Object {
  /**
    * List of dates that match the media items' creation date. A maximum of
    * 5 dates can be included per request.
    */
  var dates: js.UndefOr[js.Array[Date]] = js.native
  /**
    * List of dates ranges that match the media items' creation date. A
    * maximum of 5 dates ranges can be included per request.
    */
  var ranges: js.UndefOr[js.Array[DateRange]] = js.native
}

object DateFilter {
  @scala.inline
  def apply(): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFilter]
  }
  @scala.inline
  implicit class DateFilterOps[Self <: DateFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDates(value: js.Array[Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dates")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Array[DateRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
  }
  
}

