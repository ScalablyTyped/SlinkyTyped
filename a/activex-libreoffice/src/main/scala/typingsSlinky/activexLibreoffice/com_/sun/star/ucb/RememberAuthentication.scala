package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A specification of how long to remember some authentication data. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait RememberAuthentication extends js.Object

object RememberAuthentication {
  /** Do not remember the authentication data (use it once and immediately forget about it). */
  @scala.inline
  def NO: `0` = 0.asInstanceOf[`0`]
  /** Remember the authentication data "forever". */
  @scala.inline
  def PERSISTENT: `2` = 2.asInstanceOf[`2`]
  /** Remember the authentication data, but only until the end of the current session. */
  @scala.inline
  def SESSION: `1` = 1.asInstanceOf[`1`]
}

