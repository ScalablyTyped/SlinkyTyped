package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditRowEndedEventUIParam extends js.Object {
  /**
  	 * Gets the old value for the column with the specified key.
  	 */
  var oldValues: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Check if the edit mode is for adding a new row.
  	 */
  var rowAdding: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the row's PK value.
  	 */
  var rowID: js.UndefOr[js.Any] = js.native
  /**
  	 * Check if any of the values is changed which will cause update in the data source.
  	 */
  var update: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the new value for the column with the specified key.
  	 */
  var values: js.UndefOr[js.Any] = js.native
}

object EditRowEndedEventUIParam {
  @scala.inline
  def apply(): EditRowEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRowEndedEventUIParam]
  }
  @scala.inline
  implicit class EditRowEndedEventUIParamOps[Self <: EditRowEndedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValues")(js.undefined)
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
    def withUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

