package typingsSlinky.inputMoment.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputMomentProps extends js.Object {
  var hourStep: js.UndefOr[Double] = js.native
  var minStep: js.UndefOr[Double] = js.native
  var moment: Moment = js.native
  var nextMonthIcon: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[OnChangeListener] = js.native
  var onSave: js.UndefOr[OnSaveListener] = js.native
  var prevMonthIcon: js.UndefOr[String] = js.native
}

object InputMomentProps {
  @scala.inline
  def apply(moment: Moment): InputMomentProps = {
    val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMomentProps]
  }
  @scala.inline
  implicit class InputMomentPropsOps[Self <: InputMomentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoment(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMinStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minStep")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMonthIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonthIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMonthIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonthIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* m */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSave")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevMonthIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMonthIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevMonthIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMonthIcon")(js.undefined)
        ret
    }
  }
  
}

