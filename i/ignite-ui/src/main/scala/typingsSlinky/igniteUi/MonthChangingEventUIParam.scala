package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthChangingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the currently selected date.
  	 */
  var currentSelectedDate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to newly selected date.
  	 */
  var newSelectedDate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object MonthChangingEventUIParam {
  @scala.inline
  def apply(): MonthChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthChangingEventUIParam]
  }
  @scala.inline
  implicit class MonthChangingEventUIParamOps[Self <: MonthChangingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSelectedDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSelectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSelectedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSelectedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSelectedDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSelectedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectedDate")(js.undefined)
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

