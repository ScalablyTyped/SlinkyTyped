package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowAddedEventUIParam extends js.Object {
  /**
  	 * Gets the default value (before editing) for the column with the specified key.
  	 */
  var oldValues: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the value for the column with the specified key.
  	 */
  var values: js.UndefOr[js.Any] = js.native
}

object RowAddedEventUIParam {
  @scala.inline
  def apply(): RowAddedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowAddedEventUIParam]
  }
  @scala.inline
  implicit class RowAddedEventUIParamOps[Self <: RowAddedEventUIParam] (val x: Self) extends AnyVal {
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

