package typingsSlinky.gapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedSearchTime extends js.Object {
  var formattedSearchTime: js.UndefOr[String] = js.native
  var formattedTotalResults: js.UndefOr[String] = js.native
  var searchTime: js.UndefOr[Double] = js.native
  var totalResults: js.UndefOr[String] = js.native
}

object FormattedSearchTime {
  @scala.inline
  def apply(): FormattedSearchTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormattedSearchTime]
  }
  @scala.inline
  implicit class FormattedSearchTimeOps[Self <: FormattedSearchTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedSearchTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedSearchTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedSearchTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedSearchTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedTotalResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedTotalResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedTotalResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedTotalResults")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(js.undefined)
        ret
    }
  }
  
}

