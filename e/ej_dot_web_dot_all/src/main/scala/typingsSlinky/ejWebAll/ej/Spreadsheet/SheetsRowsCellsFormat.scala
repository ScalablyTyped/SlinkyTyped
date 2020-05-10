package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsRowsCellsFormat extends js.Object {
  /** Specifies the number of decimal places for the given input.
    * @Default {2}
    */
  var decimalPlaces: js.UndefOr[Double] = js.native
  /** Specifies the string format for the given input.
    */
  var formatStr: js.UndefOr[String] = js.native
  /** Specifies the thousand separator for the given input.
    * @Default {false}
    */
  var thousandSeparator: js.UndefOr[Boolean] = js.native
  /** Specifies the type of the format in Spreadsheet.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SheetsRowsCellsFormat {
  @scala.inline
  def apply(): SheetsRowsCellsFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRowsCellsFormat]
  }
  @scala.inline
  implicit class SheetsRowsCellsFormatOps[Self <: SheetsRowsCellsFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalPlaces(value: Double): Self = {
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
    def withThousandSeparator(value: Boolean): Self = {
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

