package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `removeDuplicatesResult.toJSON()`. */
@js.native
trait RemoveDuplicatesResultData extends js.Object {
  /**
    *
    * Number of duplicated rows removed by the operation.
    *
    * [Api set: ExcelApi 1.9]
    */
  var removed: js.UndefOr[Double] = js.native
  /**
    *
    * Number of remaining unique rows present in the resulting range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var uniqueRemaining: js.UndefOr[Double] = js.native
}

object RemoveDuplicatesResultData {
  @scala.inline
  def apply(): RemoveDuplicatesResultData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveDuplicatesResultData]
  }
  @scala.inline
  implicit class RemoveDuplicatesResultDataOps[Self <: RemoveDuplicatesResultData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueRemaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueRemaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueRemaining")(js.undefined)
        ret
    }
  }
  
}

