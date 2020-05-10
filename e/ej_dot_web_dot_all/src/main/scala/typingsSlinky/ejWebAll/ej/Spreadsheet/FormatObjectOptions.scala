package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatObjectOptions extends js.Object {
  /** Pass the decimal places in cell
    */
  var decimalPlaces: js.UndefOr[String] = js.native
  /** Pass the format str in cell
    */
  var formatStr: js.UndefOr[String] = js.native
  /** Pass the style object in a cell
    */
  var style: js.UndefOr[js.Any] = js.native
  /** Pass the thousand separator in cell
    */
  var thousandSeparator: js.UndefOr[String] = js.native
  /** Pass the type of cell
    */
  var `type`: js.UndefOr[String] = js.native
}

object FormatObjectOptions {
  @scala.inline
  def apply(): FormatObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatObjectOptions]
  }
  @scala.inline
  implicit class FormatObjectOptionsOps[Self <: FormatObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalPlaces(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatStr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatStr")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withThousandSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousandSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

