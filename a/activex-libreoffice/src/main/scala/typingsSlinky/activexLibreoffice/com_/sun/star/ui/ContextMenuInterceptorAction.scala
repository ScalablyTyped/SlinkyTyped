package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** determines the action that is requested from the {@link XContextMenuInterceptor} . */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait ContextMenuInterceptorAction extends StObject
object ContextMenuInterceptorAction {
  
  /** the context menu must not be executed. The next registered {@link XContextMenuInterceptor} should not be notified. */
  @scala.inline
  def CANCELLED: `1` = 1.asInstanceOf[`1`]
  
  /** the menu has been modified and the next registered {@link XContextMenuInterceptor} should be notified. */
  @scala.inline
  def CONTINUE_MODIFIED: `3` = 3.asInstanceOf[`3`]
  
  /** the menu has been modified and should be executed without notifying the next registered {@link XContextMenuInterceptor} . */
  @scala.inline
  def EXECUTE_MODIFIED: `2` = 2.asInstanceOf[`2`]
  
  /** the {@link XContextMenuInterceptor} has ignored the call. The next registered {@link XContextMenuInterceptor} should be notified. */
  @scala.inline
  def IGNORED: `0` = 0.asInstanceOf[`0`]
}
