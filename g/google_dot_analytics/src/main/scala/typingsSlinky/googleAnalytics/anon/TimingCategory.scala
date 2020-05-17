package typingsSlinky.googleAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimingCategory extends js.Object {
  var timingCategory: String = js.native
  var timingValue: Double = js.native
  var timingVar: String = js.native
}

object TimingCategory {
  @scala.inline
  def apply(timingCategory: String, timingValue: Double, timingVar: String): TimingCategory = {
    val __obj = js.Dynamic.literal(timingCategory = timingCategory.asInstanceOf[js.Any], timingValue = timingValue.asInstanceOf[js.Any], timingVar = timingVar.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingCategory]
  }
  @scala.inline
  implicit class TimingCategoryOps[Self <: TimingCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimingCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimingValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimingVar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingVar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

