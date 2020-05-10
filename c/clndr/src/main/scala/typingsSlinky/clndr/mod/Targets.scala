package typingsSlinky.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Targets extends js.Object {
  var day: js.UndefOr[String] = js.native
  var empty: js.UndefOr[String] = js.native
  var nextButton: js.UndefOr[String] = js.native
  var nextYearButton: js.UndefOr[String] = js.native
  var previousButton: js.UndefOr[String] = js.native
  var previousYearButton: js.UndefOr[String] = js.native
  var todayButton: js.UndefOr[String] = js.native
}

object Targets {
  @scala.inline
  def apply(): Targets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Targets]
  }
  @scala.inline
  implicit class TargetsOps[Self <: Targets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withNextYearButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextYearButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYearButton")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousButton")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousYearButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousYearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousYearButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousYearButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButton")(js.undefined)
        ret
    }
  }
  
}

