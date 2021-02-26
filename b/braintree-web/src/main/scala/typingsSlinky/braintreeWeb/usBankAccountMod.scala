package typingsSlinky.braintreeWeb

import typingsSlinky.braintreeWeb.anon.BankDetails
import typingsSlinky.braintreeWeb.anon.Client
import typingsSlinky.braintreeWeb.coreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usBankAccountMod {
  
  @js.native
  trait USBankAccount extends StObject {
    
    var VERSION: String = js.native
    
    def create(options: Client, callback: callback[_]): Unit = js.native
    
    /**
      * Cleanly tear down anything set up by {@link module:braintree-web/us-bank-account.create|create}.
      */
    def teardown(): Unit = js.native
    def teardown(callback: callback[_]): Unit = js.native
    
    /**
      * Tokenizes bank information to return a payment method nonce. You can tokenize bank details by providing
      * information like account and routing numbers. You can also tokenize with a bank login UI that prompts
      * the customer to log into their bank account.         * @example
      * <caption>Tokenizing raw bank details</caption>
      * submitButton.addEventListener('click', function (event) {
      *   var routingNumberInput = document.querySelector('input#routing-number');
      *   var accountNumberInput = document.querySelector('input#account-number');
      *   var accountHolderNameInput = document.querySelector('input#account-holder-name');
      *   var accountTypeInput = document.querySelector('input[name="account-type"]:checked');
      *   var billingAddressStreetInput = document.querySelector('input#street-address');
      *   var billingAddressExtendedInput = document.querySelector('input#extended-address');
      *   var billingAddressLocalityInput = document.querySelector('input#locality');
      *   var billingAddressRegionSelect = document.querySelector('select#region');
      *   var billingAddressPostalInput = document.querySelector('input#postal-code');
      *
      *   event.preventDefault();
      *
      *   usBankAccountInstance.tokenize({
      *     bankDetails: {
      *       routingNumber: routingNumberInput.value,
      *       accountNumber: accountNumberInput.value,
      *       accountHolderName: accountHolderNameInput.value,
      *       accountType: accountTypeInput.value,
      *       billingAddress: {
      *         streetAddress: billingAddressStreetInput.value,
      *         extendedAddress: billingAddressExtendedInput.value,
      *         locality: billingAddressLocalityInput.value,
      *         region: billingAddressRegionSelect.value,
      *         postalCode: billingAddressPostalInput.value
      *       }
      *     },
      *     mandateText: 'I authorize Braintree to debit my bank account on behalf of My Online Store.'
      *   }, function (tokenizeErr, tokenizedPayload) {
      *     if (tokenizeErr) {
      *       console.error('There was an error tokenizing the bank details.');
      *       return;
      *     }
      *
      *     // Send tokenizePayload.nonce to your server here!
      *   });
      * });
      * @example
      * <caption>Tokenizing with bank login UI</caption>
      * bankLoginButton.addEventListener('click', function (event) {
      *   event.preventDefault();
      *
      *   usBankAccountInstance.tokenize({
      *     bankLogin: {
      *       displayName: 'My Online Store'
      *     },
      *     mandateText: 'I authorize Braintree to debit my bank account on behalf of My Online Store.'
      *   }, function (tokenizeErr, tokenizedPayload) {
      *     if (tokenizeErr) {
      *       console.error('There was an error tokenizing the bank details.');
      *       return;
      *     }
      *
      *     // Send tokenizePayload.nonce to your server here!
      *   });
      * });
      */
    def tokenize(options: BankDetails, callback: callback[_]): Unit = js.native
  }
}
