package typingsSlinky.blueprintjsCore.numericInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumericInputState extends js.Object {
  var prevMaxProp: js.UndefOr[Double] = js.native
  var prevMinProp: js.UndefOr[Double] = js.native
  var prevValueProp: js.UndefOr[Double | String] = js.native
  var shouldSelectAfterUpdate: Boolean = js.native
  var stepMaxPrecision: Double = js.native
  var value: String = js.native
}

object INumericInputState {
  @scala.inline
  def apply(shouldSelectAfterUpdate: Boolean, stepMaxPrecision: Double, value: String): INumericInputState = {
    val __obj = js.Dynamic.literal(shouldSelectAfterUpdate = shouldSelectAfterUpdate.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumericInputState]
  }
  @scala.inline
  implicit class INumericInputStateOps[Self <: INumericInputState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShouldSelectAfterUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSelectAfterUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepMaxPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMaxPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevMaxProp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMaxProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevMaxProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMaxProp")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevMinProp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMinProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevMinProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMinProp")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevValueProp(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevValueProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevValueProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevValueProp")(js.undefined)
        ret
    }
  }
  
}

