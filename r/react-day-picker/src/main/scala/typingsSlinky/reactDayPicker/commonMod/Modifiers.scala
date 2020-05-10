package typingsSlinky.reactDayPicker.commonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modifiers
  extends /* other */ StringDictionary[js.UndefOr[Modifier | js.Array[Modifier]]] {
  var outside: Modifier | js.Array[Modifier] = js.native
  var today: Modifier | js.Array[Modifier] = js.native
}

object Modifiers {
  @scala.inline
  def apply(): Modifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modifiers]
  }
  @scala.inline
  implicit class ModifiersOps[Self <: Modifiers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutsideDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutsideFunction1(value: /* date */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutside(value: Modifier | js.Array[Modifier]): Self = {
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
    def withTodayDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTodayFunction1(value: /* date */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToday(value: Modifier | js.Array[Modifier]): Self = {
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

