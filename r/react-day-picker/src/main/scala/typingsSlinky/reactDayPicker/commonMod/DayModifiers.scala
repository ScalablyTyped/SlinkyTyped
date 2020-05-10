package typingsSlinky.reactDayPicker.commonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayModifiers
  extends /* other */ StringDictionary[js.UndefOr[Boolean]] {
  var outside: js.UndefOr[Boolean] = js.native
  var today: js.UndefOr[Boolean] = js.native
}

object DayModifiers {
  @scala.inline
  def apply(): DayModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayModifiers]
  }
  @scala.inline
  implicit class DayModifiersOps[Self <: DayModifiers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside")(js.undefined)
        ret
    }
    @scala.inline
    def withToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(js.undefined)
        ret
    }
  }
  
}

