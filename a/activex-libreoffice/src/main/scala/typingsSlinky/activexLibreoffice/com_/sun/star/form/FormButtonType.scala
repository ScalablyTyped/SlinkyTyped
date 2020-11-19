package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the action to execute when a button is pressed.
  * @see com.sun.star.form.component.CommandButton
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait FormButtonType extends js.Object
object FormButtonType {
  
  /** requires the button to act like a common push button, means no special action is triggered. */
  @scala.inline
  def PUSH: `0` = 0.asInstanceOf[`0`]
  
  /** When the button is clicked, it performs a reset on its containing form. */
  @scala.inline
  def RESET: `2` = 2.asInstanceOf[`2`]
  
  /** When the button is clicked, it performs a submit on its containing form. */
  @scala.inline
  def SUBMIT: `1` = 1.asInstanceOf[`1`]
  
  /**
    * When the button is clicked, an URL set for the button is opened.
    * @see com.sun.star.form.component.CommandButton.TargetURL
    * @see com.sun.star.form.component.CommandButton.TargetFrame Specifies to use "application/x-www-form-urlencoded" as submit encoding.  Usually used if t
    */
  @scala.inline
  def URL: `3` = 3.asInstanceOf[`3`]
}
