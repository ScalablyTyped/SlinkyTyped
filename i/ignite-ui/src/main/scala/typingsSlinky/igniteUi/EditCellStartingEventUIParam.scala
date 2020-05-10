package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditCellStartingEventUIParam extends js.Object {
  /**
  	 * Gets the index of the column.
  	 */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets the key of the column.
  	 */
  var columnKey: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the editor used for editing the column.
  	 */
  var editor: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Checks if the edit mode is for adding a new row.
  	 */
  var rowAdding: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the row's PK value.
  	 */
  var rowID: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or set the value of the editor.
  	 */
  var value: js.UndefOr[js.Any] = js.native
}

object EditCellStartingEventUIParam {
  @scala.inline
  def apply(): EditCellStartingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditCellStartingEventUIParam]
  }
  @scala.inline
  implicit class EditCellStartingEventUIParamOps[Self <: EditCellStartingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
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
    def withEditor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
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
    def withRowAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withRowID(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowID")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

