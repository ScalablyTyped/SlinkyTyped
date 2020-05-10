package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSelectionChangedEventUIParam extends js.Object {
  /**
  	 * Gets reference to GridSelection.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets reference to the row object.
  	 */
  var row: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets reference to rows object array.
  	 */
  var selectedRows: js.UndefOr[js.Array[_]] = js.native
}

object RowSelectionChangedEventUIParam {
  @scala.inline
  def apply(): RowSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectionChangedEventUIParam]
  }
  @scala.inline
  implicit class RowSelectionChangedEventUIParamOps[Self <: RowSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def withRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(js.undefined)
        ret
    }
  }
  
}

