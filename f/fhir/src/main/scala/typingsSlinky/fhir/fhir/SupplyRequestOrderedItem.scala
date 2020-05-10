package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The item being requested
  */
@js.native
trait SupplyRequestOrderedItem extends BackboneElement {
  /**
    * Medication, Substance, or Device requested to be supplied
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Medication, Substance, or Device requested to be supplied
    */
  var itemReference: js.UndefOr[Reference] = js.native
  /**
    * The requested amount of the item indicated
    */
  var quantity: Quantity = js.native
}

object SupplyRequestOrderedItem {
  @scala.inline
  def apply(quantity: Quantity): SupplyRequestOrderedItem = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplyRequestOrderedItem]
  }
  @scala.inline
  implicit class SupplyRequestOrderedItemOps[Self <: SupplyRequestOrderedItem] (val x: Self) extends AnyVal {
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
  }
  
}

