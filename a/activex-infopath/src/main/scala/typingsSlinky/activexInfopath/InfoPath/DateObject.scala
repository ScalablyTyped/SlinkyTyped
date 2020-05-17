package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateObject extends js.Object {
  @JSName("InfoPath.DateObject_typekey")
  var InfoPathDotDateObject_typekey: DateObject = js.native
  def AddDays(pvarDate: js.Any, pvarDays: js.Any): js.Any = js.native
  def AddSeconds(pvarTime: js.Any, pvarSeconds: js.Any): js.Any = js.native
  def Now(): js.Any = js.native
  def Today(): js.Any = js.native
}

object DateObject {
  @scala.inline
  def apply(
    AddDays: (js.Any, js.Any) => js.Any,
    AddSeconds: (js.Any, js.Any) => js.Any,
    InfoPathDotDateObject_typekey: DateObject,
    Now: () => js.Any,
    Today: () => js.Any
  ): DateObject = {
    val __obj = js.Dynamic.literal(AddDays = js.Any.fromFunction2(AddDays), AddSeconds = js.Any.fromFunction2(AddSeconds), Now = js.Any.fromFunction0(Now), Today = js.Any.fromFunction0(Today))
    __obj.updateDynamic("InfoPath.DateObject_typekey")(InfoPathDotDateObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObject]
  }
  @scala.inline
  implicit class DateObjectOps[Self <: DateObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDays(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddDays")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddSeconds(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSeconds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInfoPathDotDateObject_typekey(value: DateObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.DateObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNow(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Now")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToday(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Today")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

