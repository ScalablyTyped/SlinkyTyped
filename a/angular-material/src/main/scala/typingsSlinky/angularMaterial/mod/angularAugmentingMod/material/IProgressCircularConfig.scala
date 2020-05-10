package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressCircularConfig extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var durationIndeterminate: js.UndefOr[Double] = js.native
  var easeFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.native
  var easeFnIndeterminate: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.native
  var endIndeterminate: js.UndefOr[Double] = js.native
  var progressSize: js.UndefOr[Double] = js.native
  var startIndeterminate: js.UndefOr[Double] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object IProgressCircularConfig {
  @scala.inline
  def apply(): IProgressCircularConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressCircularConfig]
  }
  @scala.inline
  implicit class IProgressCircularConfigOps[Self <: IProgressCircularConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationIndeterminate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationIndeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationIndeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeFn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEaseFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeFn")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseFnIndeterminate(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeFnIndeterminate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEaseFnIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeFnIndeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndIndeterminate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndeterminate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
  }
  
}

