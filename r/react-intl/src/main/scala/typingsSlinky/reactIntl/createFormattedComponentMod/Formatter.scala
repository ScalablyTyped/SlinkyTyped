package typingsSlinky.reactIntl.createFormattedComponentMod

import typingsSlinky.reactIntl.typesMod.FormatDateOptions
import typingsSlinky.reactIntl.typesMod.FormatDisplayNameOptions
import typingsSlinky.reactIntl.typesMod.FormatListOptions
import typingsSlinky.reactIntl.typesMod.FormatNumberOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatter extends js.Object {
  var formatDate: FormatDateOptions = js.native
  var formatDisplayName: FormatDisplayNameOptions = js.native
  var formatList: FormatListOptions = js.native
  var formatNumber: FormatNumberOptions = js.native
  var formatTime: FormatDateOptions = js.native
}

object Formatter {
  @scala.inline
  def apply(
    formatDate: FormatDateOptions,
    formatDisplayName: FormatDisplayNameOptions,
    formatList: FormatListOptions,
    formatNumber: FormatNumberOptions,
    formatTime: FormatDateOptions
  ): Formatter = {
    val __obj = js.Dynamic.literal(formatDate = formatDate.asInstanceOf[js.Any], formatDisplayName = formatDisplayName.asInstanceOf[js.Any], formatList = formatList.asInstanceOf[js.Any], formatNumber = formatNumber.asInstanceOf[js.Any], formatTime = formatTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatter]
  }
  @scala.inline
  implicit class FormatterOps[Self <: Formatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatDate(value: FormatDateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatDisplayName(value: FormatDisplayNameOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatList(value: FormatListOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatNumber(value: FormatNumberOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatTime(value: FormatDateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

