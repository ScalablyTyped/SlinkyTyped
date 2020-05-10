package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Duration> */
@js.native
trait PartialDuration extends js.Object {
  var complex: js.UndefOr[Double] = js.native
  var enteringScreen: js.UndefOr[Double] = js.native
  var leavingScreen: js.UndefOr[Double] = js.native
  var short: js.UndefOr[Double] = js.native
  var shorter: js.UndefOr[Double] = js.native
  var shortest: js.UndefOr[Double] = js.native
  var standard: js.UndefOr[Double] = js.native
}

object PartialDuration {
  @scala.inline
  def apply(): PartialDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDuration]
  }
  @scala.inline
  implicit class PartialDurationOps[Self <: PartialDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complex")(js.undefined)
        ret
    }
    @scala.inline
    def withEnteringScreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteringScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnteringScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteringScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withLeavingScreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeavingScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withShort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(js.undefined)
        ret
    }
    @scala.inline
    def withShorter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorter")(js.undefined)
        ret
    }
    @scala.inline
    def withShortest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortest")(js.undefined)
        ret
    }
    @scala.inline
    def withStandard(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.undefined)
        ret
    }
  }
  
}

