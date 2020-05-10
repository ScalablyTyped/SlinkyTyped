package typingsSlinky.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchCustomFieldWithDateParams extends PatchCustomFieldParams {
  var initialDate: js.UndefOr[String] = js.native
  var initialShift: js.UndefOr[Double] = js.native
  var initialValueType: js.UndefOr[Double] = js.native
  var max: js.UndefOr[String] = js.native
  var min: js.UndefOr[String] = js.native
}

object PatchCustomFieldWithDateParams {
  @scala.inline
  def apply(): PatchCustomFieldWithDateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchCustomFieldWithDateParams]
  }
  @scala.inline
  implicit class PatchCustomFieldWithDateParamsOps[Self <: PatchCustomFieldWithDateParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDate")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialShift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialShift")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialValueType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValueType")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
  }
  
}

