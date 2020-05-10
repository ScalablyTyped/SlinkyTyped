package typingsSlinky.egjsAxes.axesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxesOption extends js.Object {
  var deceleration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  var interruptable: js.UndefOr[Boolean] = js.native
  var maximumDuration: js.UndefOr[Double] = js.native
  var minimumDuration: js.UndefOr[Double] = js.native
}

object AxesOption {
  @scala.inline
  def apply(): AxesOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesOption]
  }
  @scala.inline
  implicit class AxesOptionOps[Self <: AxesOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: /* x */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withInterruptable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterruptable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDuration")(js.undefined)
        ret
    }
  }
  
}

