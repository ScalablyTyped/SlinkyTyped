package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveWorksheetChangedEventUIParam extends js.Object {
  /**
  	 * Gets the current active [worksheet](ig.excel.Worksheet).
  	 */
  var newActiveWorksheet: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the name of the new active worksheet or null if newActiveWorksheet is null.
  	 */
  var newActiveWorksheetName: js.UndefOr[String] = js.native
  /**
  	 * Gets the previous active [worksheet](ig.excel.Worksheet).
  	 */
  var oldActiveWorksheet: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the name of the previous active worksheet or null if oldActiveWorksheet is null.
  	 */
  var oldActiveWorksheetName: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ActiveWorksheetChangedEventUIParam {
  @scala.inline
  def apply(): ActiveWorksheetChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveWorksheetChangedEventUIParam]
  }
  @scala.inline
  implicit class ActiveWorksheetChangedEventUIParamOps[Self <: ActiveWorksheetChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewActiveWorksheet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActiveWorksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewActiveWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActiveWorksheet")(js.undefined)
        ret
    }
    @scala.inline
    def withNewActiveWorksheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActiveWorksheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewActiveWorksheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActiveWorksheetName")(js.undefined)
        ret
    }
    @scala.inline
    def withOldActiveWorksheet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldActiveWorksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldActiveWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldActiveWorksheet")(js.undefined)
        ret
    }
    @scala.inline
    def withOldActiveWorksheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldActiveWorksheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldActiveWorksheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldActiveWorksheetName")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

