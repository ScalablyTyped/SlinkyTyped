package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `workbookProtection.toJSON()`. */
@js.native
trait WorkbookProtectionData extends js.Object {
  /**
    *
    * Indicates if the workbook is protected. Read-Only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `protected`: js.UndefOr[Boolean] = js.native
}

object WorkbookProtectionData {
  @scala.inline
  def apply(): WorkbookProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookProtectionData]
  }
  @scala.inline
  implicit class WorkbookProtectionDataOps[Self <: WorkbookProtectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(js.undefined)
        ret
    }
  }
  
}

