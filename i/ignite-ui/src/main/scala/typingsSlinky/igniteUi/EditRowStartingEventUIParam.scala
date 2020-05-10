package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditRowStartingEventUIParam extends js.Object {
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
}

object EditRowStartingEventUIParam {
  @scala.inline
  def apply(): EditRowStartingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRowStartingEventUIParam]
  }
  @scala.inline
  implicit class EditRowStartingEventUIParamOps[Self <: EditRowStartingEventUIParam] (val x: Self) extends AnyVal {
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
  }
  
}

