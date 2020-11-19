package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Card authentication method enum string.
  *
  * Options:
  *
  * - `PAN_ONLY`:
  *   Authenticate using a PAN (personal account number) only.
  *
  *   Note: in addition to the PAN (personal account number) there will
  *   also be an expiration month and year.
  *
  *   If you are using [[PaymentMethodTokenizationType|`PAYMENT_GATEWAY`]],
  *   you will not need to handle this sensitive data as it will be
  *   delivered to your gateway.
  *
  *   Warning: do not rely on the PAN returned being stable or being able
  *   to be used to reauthorize new transactions as the PAN is meant for
  *   one-time use only. Authorization for new transactions may fail if you
  *   reuse the credential across unrelated transactions.
  *
  * - `CRYPTOGRAM_3DS`:
  *   Authenticate using the a 3-D Secure (3DS) cryptogram.
  *
  *   Note: in addition to the 3DS cryptogram there will also be an
  *   associated PAN (personal account number), expiration month and year,
  *   and Electronic Commerce Indicator for certain card networks.
  *
  *   If you are using [[PaymentMethodTokenizationType|`PAYMENT_GATEWAY`]],
  *   you will not need to handle this sensitive data as it will be
  *   delivered to your gateway.
  *
  *   Warning: do not rely on the PAN returned being stable or being able
  *   to be used to reauthorize new transactions as the PAN and associated
  *   3DS cryptogram are meant for one-time use only. Authorization for new
  *   transactions may fail if you reuse the credential across unrelated
  *   transactions.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.PAN_ONLY
  - typingsSlinky.googlepay.googlepayStrings.CRYPTOGRAM_3DS
*/
trait CardAuthMethod extends js.Object
object CardAuthMethod {
  
  @scala.inline
  def CRYPTOGRAM_3DS: typingsSlinky.googlepay.googlepayStrings.CRYPTOGRAM_3DS = "CRYPTOGRAM_3DS".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.CRYPTOGRAM_3DS]
  
  @scala.inline
  def PAN_ONLY: typingsSlinky.googlepay.googlepayStrings.PAN_ONLY = "PAN_ONLY".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.PAN_ONLY]
}
