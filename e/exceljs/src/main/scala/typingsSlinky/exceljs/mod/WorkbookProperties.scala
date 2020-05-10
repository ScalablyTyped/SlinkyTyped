package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookProperties extends js.Object {
  /**
  	 * Set workbook dates to 1904 date system
  	 */
  var date1904: Boolean = js.native
}

object WorkbookProperties {
  @scala.inline
  def apply(date1904: Boolean): WorkbookProperties = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookProperties]
  }
  @scala.inline
  implicit class WorkbookPropertiesOps[Self <: WorkbookProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate1904(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date1904")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

