package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Card network enum string.
  *
  * Options:
  *
  * - `AMEX`:
  *   American Express card network.
  *
  * - `DISCOVER`:
  *   Discover card network.
  *
  * - `ELECTRON`:
  *   Visa's Electron card network.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to `"BR"`, and
  *   [[CardParameters.allowedCardNetworks|`CardParameters.allowedCardNetworks`]]
  *   must also contain [[CardNetwork|`VISA`]]
  *
  *   For processing purposes, you should use this as an indication that
  *   the card must be processed through the Electron debit network.
  *
  * - `ELO`:
  *   Elo card network.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to `"BR"`.
  *
  * - `ELO_DEBIT`:
  *   Elo's debit network rail.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to
  *   `"BR"`, and
  *   [[CardParameters.allowedCardNetworks|`CardParameters.allowedCardNetworks`]]
  *   must also contain [[CardNetwork|`ELO`]]
  *
  *   For processing purposes, you should use this as an indication that
  *   the card must be processed through the ELO debit network.
  *
  * - `INTERAC`:
  *   Interac card network.
  *
  * - `JCB`:
  *   JCB card network.
  *
  * - `MAESTRO`:
  *   Maestro card network.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to `"BR"`, and
  *   [[CardParameters.allowedCardNetworks|`CardParameters.allowedCardNetworks`]]
  *   must also contain [[CardNetwork|`MASTERCARD`]]
  *
  *   For processing purposes, you should use this as an indication that
  *   the card must be processed through the Maestro debit network.
  *
  * - `MASTERCARD`:
  *   Mastercard card network.
  *
  * - `VISA`:
  *   Visa card network.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.AMEX
  - typingsSlinky.googlepay.googlepayStrings.DISCOVER
  - typingsSlinky.googlepay.googlepayStrings.ELECTRON
  - typingsSlinky.googlepay.googlepayStrings.ELO
  - typingsSlinky.googlepay.googlepayStrings.ELO_DEBIT
  - typingsSlinky.googlepay.googlepayStrings.INTERAC
  - typingsSlinky.googlepay.googlepayStrings.JCB
  - typingsSlinky.googlepay.googlepayStrings.MAESTRO
  - typingsSlinky.googlepay.googlepayStrings.MASTERCARD
  - typingsSlinky.googlepay.googlepayStrings.VISA
*/
trait CardNetwork extends js.Object

object CardNetwork {
  @scala.inline
  def AMEX: typingsSlinky.googlepay.googlepayStrings.AMEX = "AMEX".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.AMEX]
  @scala.inline
  def DISCOVER: typingsSlinky.googlepay.googlepayStrings.DISCOVER = "DISCOVER".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.DISCOVER]
  @scala.inline
  def ELECTRON: typingsSlinky.googlepay.googlepayStrings.ELECTRON = "ELECTRON".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.ELECTRON]
  @scala.inline
  def ELO: typingsSlinky.googlepay.googlepayStrings.ELO = "ELO".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.ELO]
  @scala.inline
  def ELO_DEBIT: typingsSlinky.googlepay.googlepayStrings.ELO_DEBIT = "ELO_DEBIT".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.ELO_DEBIT]
  @scala.inline
  def INTERAC: typingsSlinky.googlepay.googlepayStrings.INTERAC = "INTERAC".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.INTERAC]
  @scala.inline
  def JCB: typingsSlinky.googlepay.googlepayStrings.JCB = "JCB".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.JCB]
  @scala.inline
  def MAESTRO: typingsSlinky.googlepay.googlepayStrings.MAESTRO = "MAESTRO".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.MAESTRO]
  @scala.inline
  def MASTERCARD: typingsSlinky.googlepay.googlepayStrings.MASTERCARD = "MASTERCARD".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.MASTERCARD]
  @scala.inline
  def VISA: typingsSlinky.googlepay.googlepayStrings.VISA = "VISA".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.VISA]
}

