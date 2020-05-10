package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item containing charge code(s) associated with the provision of healthcare provider products
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ChargeItem extends DomainResource {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'enteredDate'.
    */
  var _enteredDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'factorOverride'.
    */
  var _factorOverride: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'overrideReason'.
    */
  var _overrideReason: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Account to place this charge
    */
  var account: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Anatomical location, if relevant
    */
  var bodysite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * A code that identifies the charge, like a billing code
    */
  var code: CodeableConcept = js.native
  /**
    * Encounter / Episode associated with event
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Defining information about the code of this charge item
    */
  var definition: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Date the charge item was entered
    */
  var enteredDate: js.UndefOr[dateTime] = js.native
  /**
    * Individual who was entering
    */
  var enterer: js.UndefOr[Reference] = js.native
  /**
    * Factor overriding the associated rules
    */
  var factorOverride: js.UndefOr[decimal] = js.native
  /**
    * Business Identifier for item
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Comments made about the ChargeItem
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When the charged service was applied
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When the charged service was applied
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  /**
    * When the charged service was applied
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.native
  /**
    * Reason for overriding the list price/factor
    */
  var overrideReason: js.UndefOr[String] = js.native
  /**
    * Part of referenced ChargeItem
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who performed charged service
    */
  var participant: js.UndefOr[js.Array[ChargeItemParticipant]] = js.native
  /**
    * Organization providing the charged sevice
    */
  var performingOrganization: js.UndefOr[Reference] = js.native
  /**
    * Price overriding the associated rules
    */
  var priceOverride: js.UndefOr[Money] = js.native
  /**
    * Quantity of which the charge item has been serviced
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Why was the charged  service rendered?
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Organization requesting the charged service
    */
  var requestingOrganization: js.UndefOr[Reference] = js.native
  /**
    * Which rendered service is being charged?
    */
  var service: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * planned | billable | not-billable | aborted | billed | entered-in-error | unknown
    */
  var status: code = js.native
  /**
    * Individual service was done for/to
    */
  var subject: Reference = js.native
  /**
    * Further information supporting the this charge
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
}

object ChargeItem {
  @scala.inline
  def apply(code: CodeableConcept, status: code, subject: Reference): ChargeItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeItem]
  }
  @scala.inline
  implicit class ChargeItemOps[Self <: ChargeItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_definition(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_definition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_definition")(js.undefined)
        ret
    }
    @scala.inline
    def with_enteredDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enteredDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_enteredDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enteredDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_factorOverride(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_factorOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_factorOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_factorOverride")(js.undefined)
        ret
    }
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
    def with_overrideReason(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_overrideReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_overrideReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_overrideReason")(js.undefined)
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
    def withAccount(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withBodysite(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodysite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodysite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodysite")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: js.Array[uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withEnteredDate(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteredDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnteredDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteredDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterer")(js.undefined)
        ret
    }
    @scala.inline
    def withFactorOverride(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactorOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorOverride")(js.undefined)
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
    def withNote(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
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
    def withOverrideReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideReason")(js.undefined)
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
    def withParticipant(value: js.Array[ChargeItemParticipant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformingOrganization(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performingOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformingOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performingOrganization")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceOverride(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceOverride")(js.undefined)
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
    def withReason(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestingOrganization(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestingOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestingOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestingOrganization")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportingInformation(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportingInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingInformation")(js.undefined)
        ret
    }
  }
  
}

