package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDialogButtonApplyClickEventUIParam extends js.Object {
  /**
  	 * Gets the array of column layouts.
  	 */
  var groupedColumnLayouts: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets the array of grouped columns.
  	 */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets a reference to the modal dialog element. This is a jQuery object.
  	 */
  var modalDialogElement: js.UndefOr[String] = js.native
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the array of sorted columns.
  	 */
  var sortingExpr: js.UndefOr[js.Array[_]] = js.native
}

object ModalDialogButtonApplyClickEventUIParam {
  @scala.inline
  def apply(): ModalDialogButtonApplyClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogButtonApplyClickEventUIParam]
  }
  @scala.inline
  implicit class ModalDialogButtonApplyClickEventUIParamOps[Self <: ModalDialogButtonApplyClickEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupedColumnLayouts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumnLayouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedColumnLayouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumnLayouts")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedColumns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogElement")(js.undefined)
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
    @scala.inline
    def withSortingExpr(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortingExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingExpr")(js.undefined)
        ret
    }
  }
  
}

