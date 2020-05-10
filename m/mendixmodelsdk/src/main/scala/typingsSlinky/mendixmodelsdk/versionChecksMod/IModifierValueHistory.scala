package typingsSlinky.mendixmodelsdk.versionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModifierValueHistory extends js.Object {
  /** descending list of change in previous meta model versions */
  var changedIn: js.UndefOr[js.Array[String]] = js.native
  var currentValue: Boolean = js.native
}

object IModifierValueHistory {
  @scala.inline
  def apply(currentValue: Boolean): IModifierValueHistory = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModifierValueHistory]
  }
  @scala.inline
  implicit class IModifierValueHistoryOps[Self <: IModifierValueHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedIn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedIn")(js.undefined)
        ret
    }
  }
  
}

