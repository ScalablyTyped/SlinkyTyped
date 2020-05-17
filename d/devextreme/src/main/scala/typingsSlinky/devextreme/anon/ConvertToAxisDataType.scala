package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertToAxisDataType extends js.Object {
  var checkTypeForAllData: js.UndefOr[Boolean] = js.native
  var convertToAxisDataType: js.UndefOr[Boolean] = js.native
  var sortingMethod: js.UndefOr[Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])] = js.native
}

object ConvertToAxisDataType {
  @scala.inline
  def apply(): ConvertToAxisDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertToAxisDataType]
  }
  @scala.inline
  implicit class ConvertToAxisDataTypeOps[Self <: ConvertToAxisDataType] (val x: Self) extends AnyVal {
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
    def withSortingMethodFunction2(value: (/* a */ Arg, /* b */ Arg) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortingMethod(value: Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])): Self = {
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

