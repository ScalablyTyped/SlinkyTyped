package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify how invalid cell contents are treated. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait ValidationAlertStyle extends js.Object

object ValidationAlertStyle {
  /** information message is shown and the user is asked whether the change will be accepted (defaulted to "Yes"). */
  @scala.inline
  def INFO: `2` = 2.asInstanceOf[`2`]
  /** macro is executed. */
  @scala.inline
  def MACRO: `3` = 3.asInstanceOf[`3`]
  /** error message is shown and the change is rejected. */
  @scala.inline
  def STOP: `0` = 0.asInstanceOf[`0`]
  /** warning message is shown and the user is asked whether the change will be accepted (defaulted to "No"). */
  @scala.inline
  def WARNING: `1` = 1.asInstanceOf[`1`]
}

