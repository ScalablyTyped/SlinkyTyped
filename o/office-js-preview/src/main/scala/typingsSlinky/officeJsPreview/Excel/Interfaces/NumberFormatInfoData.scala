package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `numberFormatInfo.toJSON()`. */
@js.native
trait NumberFormatInfoData extends js.Object {
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberDecimalSeparator: js.UndefOr[String] = js.native
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberGroupSeparator: js.UndefOr[String] = js.native
}

object NumberFormatInfoData {
  @scala.inline
  def apply(): NumberFormatInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatInfoData]
  }
  @scala.inline
  implicit class NumberFormatInfoDataOps[Self <: NumberFormatInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberDecimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberDecimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberGroupSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberGroupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberGroupSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberGroupSeparator")(js.undefined)
        ret
    }
  }
  
}

