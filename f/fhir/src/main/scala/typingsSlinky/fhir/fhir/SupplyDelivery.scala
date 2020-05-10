package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Delivery of bulk Supplies
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait SupplyDelivery extends DomainResource {
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Fulfills plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Where the Supply was sent
    */
  var destination: js.UndefOr[Reference] = js.native
  /**
    * External identifier
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * When event occurred
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When event occurred
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  /**
    * When event occurred
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.native
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Patient for whom the item is supplied
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Who collected the Supply
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * in-progress | completed | abandoned | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * The item that is delivered or supplied
    */
  var suppliedItem: js.UndefOr[SupplyDeliverySuppliedItem] = js.native
  /**
    * Dispenser
    */
  var supplier: js.UndefOr[Reference] = js.native
  /**
    * Category of dispense event
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object SupplyDelivery {
  @scala.inline
  def apply(): SupplyDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyDelivery]
  }
  @scala.inline
  implicit class SupplyDeliveryOps[Self <: SupplyDelivery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_occurrenceDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_occurrenceDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_occurrenceDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_occurrenceDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def withBasedOn(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
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
    def withOccurrenceDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrencePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrencePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrenceTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withPartOf(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOf")(js.undefined)
        ret
    }
    @scala.inline
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiver(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppliedItem(value: SupplyDeliverySuppliedItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppliedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppliedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppliedItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSupplier(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplier")(js.undefined)
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

