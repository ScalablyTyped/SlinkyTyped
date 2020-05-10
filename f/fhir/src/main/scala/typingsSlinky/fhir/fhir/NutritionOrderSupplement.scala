package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supplement components
  */
@js.native
trait NutritionOrderSupplement extends BackboneElement {
  /**
    * Contains extended information for property 'instruction'.
    */
  var _instruction: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'productName'.
    */
  var _productName: js.UndefOr[Element] = js.native
  /**
    * Instructions or additional information about the oral supplement
    */
  var instruction: js.UndefOr[String] = js.native
  /**
    * Product or brand name of the nutritional supplement
    */
  var productName: js.UndefOr[String] = js.native
  /**
    * Amount of the nutritional supplement
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Scheduled frequency of supplement
    */
  var schedule: js.UndefOr[js.Array[Timing]] = js.native
  /**
    * Type of supplement product requested
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object NutritionOrderSupplement {
  @scala.inline
  def apply(): NutritionOrderSupplement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderSupplement]
  }
  @scala.inline
  implicit class NutritionOrderSupplementOps[Self <: NutritionOrderSupplement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_instruction(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_instruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_instruction")(js.undefined)
        ret
    }
    @scala.inline
    def with_productName(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_productName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_productName")(js.undefined)
        ret
    }
    @scala.inline
    def withInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(js.undefined)
        ret
    }
    @scala.inline
    def withProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(js.undefined)
        ret
    }
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
    def withSchedule(value: js.Array[Timing]): Self = {
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
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

