package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConvertToAxisDataType extends js.Object {
  var checkTypeForAllData: js.UndefOr[Boolean] = js.native
  var convertToAxisDataType: js.UndefOr[Boolean] = js.native
  var sortingMethod: js.UndefOr[Boolean | (js.Function2[/* a */ AnonArg, /* b */ AnonArg, Double])] = js.native
}

object AnonConvertToAxisDataType {
  @scala.inline
  def apply(): AnonConvertToAxisDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConvertToAxisDataType]
  }
  @scala.inline
  implicit class AnonConvertToAxisDataTypeOps[Self <: AnonConvertToAxisDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckTypeForAllData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkTypeForAllData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckTypeForAllData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkTypeForAllData")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertToAxisDataType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertToAxisDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertToAxisDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertToAxisDataType")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingMethodFunction2(value: (/* a */ AnonArg, /* b */ AnonArg) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortingMethod(value: Boolean | (js.Function2[/* a */ AnonArg, /* b */ AnonArg, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingMethod")(js.undefined)
        ret
    }
  }
  
}

