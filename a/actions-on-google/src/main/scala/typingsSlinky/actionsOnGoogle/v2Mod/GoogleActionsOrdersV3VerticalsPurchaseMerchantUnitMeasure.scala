package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure extends js.Object {
  /**
    * Value: Example 1.2.
    */
  var measure: js.UndefOr[Double] = js.native
  /**
    * Unit: Example POUND, GRAM.
    */
  var unit: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureUnit] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureOps[Self <: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeasure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

