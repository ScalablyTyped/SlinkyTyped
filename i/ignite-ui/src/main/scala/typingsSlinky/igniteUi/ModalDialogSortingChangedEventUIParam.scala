package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDialogSortingChangedEventUIParam extends js.Object {
  /**
  	 * Gets the column key.
  	 */
  var columnKey: js.UndefOr[String] = js.native
  /**
  	 * Gets whether column should be ascending or not. If true it should be ascending
  	 */
  var isAsc: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets a reference to the modal dialog element. This is a jQuery object.
  	 */
  var modalDialogElement: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to GridSorting.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ModalDialogSortingChangedEventUIParam {
  @scala.inline
  def apply(): ModalDialogSortingChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogSortingChangedEventUIParam]
  }
  @scala.inline
  implicit class ModalDialogSortingChangedEventUIParamOps[Self <: ModalDialogSortingChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAsc")(js.undefined)
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
  }
  
}

