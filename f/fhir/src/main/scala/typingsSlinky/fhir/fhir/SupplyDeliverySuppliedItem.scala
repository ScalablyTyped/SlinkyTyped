package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The item that is delivered or supplied
  */
@js.native
trait SupplyDeliverySuppliedItem extends BackboneElement {
  /**
    * Medication, Substance, or Device supplied
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Medication, Substance, or Device supplied
    */
  var itemReference: js.UndefOr[Reference] = js.native
  /**
    * Amount dispensed
    */
  var quantity: js.UndefOr[Quantity] = js.native
}

object SupplyDeliverySuppliedItem {
  @scala.inline
  def apply(): SupplyDeliverySuppliedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyDeliverySuppliedItem]
  }
  @scala.inline
  implicit class SupplyDeliverySuppliedItemOps[Self <: SupplyDeliverySuppliedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withItemReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemReference")(js.undefined)
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
  }
  
}

