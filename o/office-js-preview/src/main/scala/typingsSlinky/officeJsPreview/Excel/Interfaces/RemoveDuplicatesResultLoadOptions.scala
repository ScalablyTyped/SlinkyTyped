package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the results from the removeDuplicates method on range
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait RemoveDuplicatesResultLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Number of duplicated rows removed by the operation.
    *
    * [Api set: ExcelApi 1.9]
    */
  var removed: js.UndefOr[Boolean] = js.native
  /**
    *
    * Number of remaining unique rows present in the resulting range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var uniqueRemaining: js.UndefOr[Boolean] = js.native
}

object RemoveDuplicatesResultLoadOptions {
  @scala.inline
  def apply(): RemoveDuplicatesResultLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveDuplicatesResultLoadOptions]
  }
  @scala.inline
  implicit class RemoveDuplicatesResultLoadOptionsOps[Self <: RemoveDuplicatesResultLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: Boolean): Self = {
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
    def withUniqueRemaining(value: Boolean): Self = {
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

