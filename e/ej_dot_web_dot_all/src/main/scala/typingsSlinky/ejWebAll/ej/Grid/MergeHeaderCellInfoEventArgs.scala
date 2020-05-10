package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeHeaderCellInfoEventArgs extends js.Object {
  /** Returns the column headers.
    */
  var columnHeaders: js.UndefOr[js.Any] = js.native
  /** Method to merge the header cells.
    */
  var headerCellMerge: js.UndefOr[js.Function2[/* startIndex */ Double, /* count */ Double, Unit]] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
}

object MergeHeaderCellInfoEventArgs {
  @scala.inline
  def apply(): MergeHeaderCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeHeaderCellInfoEventArgs]
  }
  @scala.inline
  implicit class MergeHeaderCellInfoEventArgsOps[Self <: MergeHeaderCellInfoEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCellMerge(value: (/* startIndex */ Double, /* count */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellMerge")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderCellMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellMerge")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

