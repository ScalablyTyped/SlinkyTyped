package typingsSlinky.activexLibreoffice.com_.sun.star.inspection

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes possible results of an interactive selection of a property value in an object inspector
  * @see XPropertyHandler.onInteractivePropertySelection
  * @since OOo 2.0.3
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait InteractiveSelectionResult extends js.Object
object InteractiveSelectionResult {
  
  /** The interactive selection of a property value was canceled. */
  @scala.inline
  def Cancelled: `0` = 0.asInstanceOf[`0`]
  
  /**
    * The interactive selection of a property value succeeded, a new property value has been obtained, but not yet set at the inspected component.
    *
    * In this case, the obtained value is passed to the caller of {@link XPropertyHandler.onInteractivePropertySelection()} , which is responsible for
    * forwarding this value to the inspected component.
    */
  @scala.inline
  def ObtainedValue: `2` = 2.asInstanceOf[`2`]
  
  /** The interactive selection of a property value is still pending. <p>This is usually used when this selection involves non-modal user interface.</p> */
  @scala.inline
  def Pending: `3` = 3.asInstanceOf[`3`]
  
  /**
    * The interactive selection of a property value succeeded, and the new property value chosen by the user has already been set at the inspected
    * component.
    */
  @scala.inline
  def Success: `1` = 1.asInstanceOf[`1`]
}
