package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Term Valued Item List
  */
@js.native
trait ContractTermValuedItem extends BackboneElement {
  /**
    * Contains extended information for property 'effectiveTime'.
    */
  var _effectiveTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'points'.
    */
  var _points: js.UndefOr[Element] = js.native
  /**
    * Contract Term Valued Item Effective Tiem
    */
  var effectiveTime: js.UndefOr[dateTime] = js.native
  /**
    * Contract Term Valued Item Type
    */
  var entityCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Contract Term Valued Item Type
    */
  var entityReference: js.UndefOr[Reference] = js.native
  /**
    * Contract Term Valued Item Price Scaling Factor
    */
  var factor: js.UndefOr[decimal] = js.native
  /**
    * Contract Term Valued Item Number
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Total Contract Term Valued Item Value
    */
  var net: js.UndefOr[Money] = js.native
  /**
    * Contract Term Valued Item Difficulty Scaling Factor
    */
  var points: js.UndefOr[decimal] = js.native
  /**
    * Contract Term Valued Item Count
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Contract Term Valued Item fee, charge, or cost
    */
  var unitPrice: js.UndefOr[Money] = js.native
}

object ContractTermValuedItem {
  @scala.inline
  def apply(): ContractTermValuedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTermValuedItem]
  }
  @scala.inline
  implicit class ContractTermValuedItemOps[Self <: ContractTermValuedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_effectiveTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effectiveTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_effectiveTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effectiveTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_factor(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_factor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_factor")(js.undefined)
        ret
    }
    @scala.inline
    def with_points(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_points: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_points")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityReference")(js.undefined)
        ret
    }
    @scala.inline
    def withFactor(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withNet(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
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
    def withUnitPrice(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(js.undefined)
        ret
    }
  }
  
}

