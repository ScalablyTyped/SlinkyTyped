package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBoxStateChangedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the grid the RowSelectors are initialized for.
  	 */
  var grid: js.UndefOr[js.Any] = js.native
  /**
  	 * Checks if the header check box is the one being clicked. In this case no row related args are passed.
  	 */
  var isHeader: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets reference to the igGridRowSelectors.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the row the clicked row selector resides in.
  	 */
  var row: js.UndefOr[String] = js.native
  /**
  	 * Gets the index of the row the clicked row selector resides in.
  	 */
  var rowIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets the key of the row the clicked row selector resides in.
  	 */
  var rowKey: js.UndefOr[String] = js.native
  /**
  	 * Gets reference to the row selector cell.
  	 */
  var rowSelector: js.UndefOr[String] = js.native
  /**
  	 * Gets the state of the checkbox ("on","off").
  	 */
  var state: js.UndefOr[String] = js.native
}

object CheckBoxStateChangedEventUIParam {
  @scala.inline
  def apply(): CheckBoxStateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckBoxStateChangedEventUIParam]
  }
  @scala.inline
  implicit class CheckBoxStateChangedEventUIParamOps[Self <: CheckBoxStateChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeader")(js.undefined)
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
    def withRow(value: String): Self = {
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
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRowKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

