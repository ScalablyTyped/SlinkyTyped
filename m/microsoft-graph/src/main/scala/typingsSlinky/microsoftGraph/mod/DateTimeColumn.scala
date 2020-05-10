package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeColumn extends js.Object {
  /**
    * How the value should be presented in the UX. Must be one of default, friendly, or standard. See below for more details.
    * If unspecified, treated as default.
    */
  var displayAs: js.UndefOr[String] = js.native
  // Indicates whether the value should be presented as a date only or a date and time. Must be one of dateOnly or dateTime
  var format: js.UndefOr[String] = js.native
}

object DateTimeColumn {
  @scala.inline
  def apply(): DateTimeColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeColumn]
  }
  @scala.inline
  implicit class DateTimeColumnOps[Self <: DateTimeColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAs")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

