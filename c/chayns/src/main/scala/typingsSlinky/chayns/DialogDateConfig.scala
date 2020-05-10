package typingsSlinky.chayns

import typingsSlinky.chayns.chayns.dialog.dateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.dialog.date()
@js.native
trait DialogDateConfig extends js.Object {
  var dateType: typingsSlinky.chayns.chayns.dialog.dateType = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var preSelect: js.UndefOr[js.Date] = js.native
}

object DialogDateConfig {
  @scala.inline
  def apply(dateType: dateType): DialogDateConfig = {
    val __obj = js.Dynamic.literal(dateType = dateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogDateConfig]
  }
  @scala.inline
  implicit class DialogDateConfigOps[Self <: DialogDateConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateType(value: dateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPreSelect(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preSelect")(js.undefined)
        ret
    }
  }
  
}

