package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookWorksheetProtection extends Entity {
  // Sheet protection options. Read-only.
  var options: js.UndefOr[WorkbookWorksheetProtectionOptions] = js.native
  // Indicates if the worksheet is protected. Read-only.
  var `protected`: js.UndefOr[Boolean] = js.native
}

object WorkbookWorksheetProtection {
  @scala.inline
  def apply(): WorkbookWorksheetProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheetProtection]
  }
  @scala.inline
  implicit class WorkbookWorksheetProtectionOps[Self <: WorkbookWorksheetProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: WorkbookWorksheetProtectionOptions): Self = {
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

