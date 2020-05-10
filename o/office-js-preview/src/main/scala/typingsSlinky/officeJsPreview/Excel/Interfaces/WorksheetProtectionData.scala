package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.WorksheetProtectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `worksheetProtection.toJSON()`. */
@js.native
trait WorksheetProtectionData extends js.Object {
  /**
    *
    * Sheet protection options. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var options: js.UndefOr[WorksheetProtectionOptions] = js.native
  /**
    *
    * Indicates if the worksheet is protected. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var `protected`: js.UndefOr[Boolean] = js.native
}

object WorksheetProtectionData {
  @scala.inline
  def apply(): WorksheetProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionData]
  }
  @scala.inline
  implicit class WorksheetProtectionDataOps[Self <: WorksheetProtectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: WorksheetProtectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
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

