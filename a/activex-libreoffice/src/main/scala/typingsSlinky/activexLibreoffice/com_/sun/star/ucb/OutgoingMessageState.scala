package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These are the possible values for {@link RecipientInfo.State} . */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait OutgoingMessageState extends js.Object
object OutgoingMessageState {
  
  /** Message has been sent upstream to all recipients. */
  @scala.inline
  def COMPLETELY_LOCALLY_SENT: `2` = 2.asInstanceOf[`2`]
  
  /** Recipient confirmed reading. */
  @scala.inline
  def CONFIRMED: `7` = 7.asInstanceOf[`7`]
  
  /** Global fatal error (e.g. last member in SMTP chain could not deliver the message). */
  @scala.inline
  def EXTERNAL_ERROR: `5` = 5.asInstanceOf[`5`]
  
  /** Local fatal error (e.g. first SMTP server upstream did not accept the message). */
  @scala.inline
  def NONRECOVERABLE_LOCAL_ERROR: `4` = 4.asInstanceOf[`4`]
  
  /** Message has been sent upstream to some recipients. */
  @scala.inline
  def PARTIALLY_LOCALLY_SENT: `1` = 1.asInstanceOf[`1`]
  
  /** Local, non-fatal error (e.g. network temporarily not available). */
  @scala.inline
  def RECOVERABLE_LOCAL_ERROR: `3` = 3.asInstanceOf[`3`]
  
  /** Message was sent; we are waiting for confirmation. */
  @scala.inline
  def WAITING_CONFIRMATION: `6` = 6.asInstanceOf[`6`]
  
  /** Message has just been placed into the out tray. */
  @scala.inline
  def WRITTEN: `0` = 0.asInstanceOf[`0`]
}
