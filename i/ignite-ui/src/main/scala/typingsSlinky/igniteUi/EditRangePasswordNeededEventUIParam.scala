package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditRangePasswordNeededEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Get an array of [protected range](ig.excel.WorksheetProtectedRange) objects that should be unlocked.
  	 */
  var ranges: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Get a parameterless function that may be invoked to unlock the associated ranges.
  	 */
  var unprotect: js.UndefOr[js.Any] = js.native
}

object EditRangePasswordNeededEventUIParam {
  @scala.inline
  def apply(): EditRangePasswordNeededEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRangePasswordNeededEventUIParam]
  }
  @scala.inline
  implicit class EditRangePasswordNeededEventUIParamOps[Self <: EditRangePasswordNeededEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withRanges(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprotect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprotect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotect")(js.undefined)
        ret
    }
  }
  
}

