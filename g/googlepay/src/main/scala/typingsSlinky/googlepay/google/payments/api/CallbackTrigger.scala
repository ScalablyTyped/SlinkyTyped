package typingsSlinky.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum string for the callback trigger.
  *
  * Options:
  *
  * - `OFFER_INFO`:
  *   Callback occurs after offer info is changed.
  *
  * - `SHIPPING_ADDRESS`:
  *   Callback occurs after shipping address is changed.
  *
  * - `SHIPPING_OPTION`:
  *   Callback occurs after shipping option is changed.
  *
  * - `INITIALIZE`:
  *   Callback occurs on initialize, every field specified by callback
  *   intent would be returned in
  *   [[IntermediatePaymentData|`IntermediatePaymentData`]] if applicable.
  *
  *   Note that this callback trigger may be triggered multiple times along
  *   a single call to loadPaymentData, so you must make sure you can
  *   handle multiple calls to it. For example, when the user changes
  *   accounts, we will call initialize again with data from the new
  *   account.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.OFFER_INFO
  - typingsSlinky.googlepay.googlepayStrings.SHIPPING_ADDRESS
  - typingsSlinky.googlepay.googlepayStrings.SHIPPING_OPTION
  - typingsSlinky.googlepay.googlepayStrings.INITIALIZE
*/
trait CallbackTrigger extends StObject
object CallbackTrigger {
  
  @scala.inline
  def INITIALIZE: typingsSlinky.googlepay.googlepayStrings.INITIALIZE = "INITIALIZE".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.INITIALIZE]
  
  @scala.inline
  def OFFER_INFO: typingsSlinky.googlepay.googlepayStrings.OFFER_INFO = "OFFER_INFO".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.OFFER_INFO]
  
  @scala.inline
  def SHIPPING_ADDRESS: typingsSlinky.googlepay.googlepayStrings.SHIPPING_ADDRESS = "SHIPPING_ADDRESS".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.SHIPPING_ADDRESS]
  
  @scala.inline
  def SHIPPING_OPTION: typingsSlinky.googlepay.googlepayStrings.SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.SHIPPING_OPTION]
}
