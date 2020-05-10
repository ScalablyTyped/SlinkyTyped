package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description The event payload sent from {@link HostedFields#on|on} or {@link HostedFields#getState|getState}.
  * @property {HostedFields~hostedFieldsCard[]} cards
  * This will return an array of potential {@link HostedFields~hostedFieldsCard|cards}. If the card type has been determined, the array will contain only one card.
  * Internally, Hosted Fields uses <a href="https://github.com/braintree/credit-card-type">credit-card-type</a>,
  * an open-source card detection library.
  * @property {string} emittedBy
  * The name of the field associated with an event. This will not be included if returned by {@link HostedFields#getState|getState}. It will be one of the following strings:<br>
  * - `"number"`
  * - `"cvv"`
  * - `"expirationDate"`
  * - `"expirationMonth"`
  * - `"expirationYear"`
  * - `"postalCode"`
  * @property {object} fields
  * @property {?HostedFields~hostedFieldsFieldData} fields.number {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the number field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.cvv {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the CVV field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.expirationDate {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the expiration date field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.expirationMonth {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the expiration month field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.expirationYear {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the expiration year field, if it is present.
  * @property {?HostedFields~hostedFieldsFieldData} fields.postalCode {@link HostedFields~hostedFieldsFieldData|hostedFieldsFieldData} for the postal code field, if it is present.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintreeWeb.braintreeWebStrings.number
  - typingsSlinky.braintreeWeb.braintreeWebStrings.cvv
  - typingsSlinky.braintreeWeb.braintreeWebStrings.expirationDate
  - typingsSlinky.braintreeWeb.braintreeWebStrings.expirationMonth
  - typingsSlinky.braintreeWeb.braintreeWebStrings.expirationYear
  - typingsSlinky.braintreeWeb.braintreeWebStrings.postalCode
*/
trait HostedFieldsHostedFieldsFieldName extends js.Object

object HostedFieldsHostedFieldsFieldName {
  @scala.inline
  def cvv: typingsSlinky.braintreeWeb.braintreeWebStrings.cvv = "cvv".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.cvv]
  @scala.inline
  def expirationDate: typingsSlinky.braintreeWeb.braintreeWebStrings.expirationDate = "expirationDate".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.expirationDate]
  @scala.inline
  def expirationMonth: typingsSlinky.braintreeWeb.braintreeWebStrings.expirationMonth = "expirationMonth".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.expirationMonth]
  @scala.inline
  def expirationYear: typingsSlinky.braintreeWeb.braintreeWebStrings.expirationYear = "expirationYear".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.expirationYear]
  @scala.inline
  def number: typingsSlinky.braintreeWeb.braintreeWebStrings.number = "number".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.number]
  @scala.inline
  def postalCode: typingsSlinky.braintreeWeb.braintreeWebStrings.postalCode = "postalCode".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.postalCode]
}

