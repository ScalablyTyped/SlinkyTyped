package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies how the TAB key should be used in a form.
  *
  * If the last control of a form is focused, and the user pressed the TAB key, there are several possibilities how a {@link FormController} should handle
  * this. TabulatorCycle specifies these possibilities.
  *
  * Note that the TabulatorCycle determines what happens when SHIFT-TAB is pressed on the **first** control of a form, as well as when TAB is pressed on
  * the **last** control.
  *
  * **First** and **last** refers to the tabbing order of controls.
  * @see FormControlModel.TabIndex
  * @see FormController
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait TabulatorCycle extends StObject
object TabulatorCycle {
  
  /**
    * a navigation bar is provided and navigation will be performed on the current/active form.
    *
    * This is the default and most often encountered mode.
    *
    * pressing the TAB key from the last control moves the focus to the first control in the tab order of the same record.
    */
  @scala.inline
  def CURRENT: `1` = 1.asInstanceOf[`1`]
  
  /** pressing the TAB key from the last control of a form moves the focus to the first control of the next form in the tab order. */
  @scala.inline
  def PAGE: `2` = 2.asInstanceOf[`2`]
  
  /** pressing the TAB key from the last control moves the focus to the first control in the tab order of the next record. */
  @scala.inline
  def RECORDS: `0` = 0.asInstanceOf[`0`]
}
