package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Formula feeding instruction as structured data
  */
@js.native
trait NutritionOrderEnteralFormulaAdministration extends BackboneElement {
  /**
    * The volume of formula to provide
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Speed with which the formula is provided per period of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Speed with which the formula is provided per period of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.native
  /**
    * Scheduled frequency of enteral feeding
    */
  var schedule: js.UndefOr[Timing] = js.native
}

object NutritionOrderEnteralFormulaAdministration {
  @scala.inline
  def apply(): NutritionOrderEnteralFormulaAdministration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormulaAdministration]
  }
  @scala.inline
  implicit class NutritionOrderEnteralFormulaAdministrationOps[Self <: NutritionOrderEnteralFormulaAdministration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withRateQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withRateRatio(value: Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
  }
  
}

