package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies different docking areas a frame based layout manager supports.
  *
  * A frame based layout manager supports four different docking areas where dockable user interface elements can be docked.
  * @see com.sun.star.frame.XLayoutManager
  * @since OOo 2.0
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait DockingArea extends StObject
object DockingArea {
  
  /** the bottom docking area above the status bar. */
  @scala.inline
  def DOCKINGAREA_BOTTOM: `1` = 1.asInstanceOf[`1`]
  
  /** a default docking area. It depends on the implementation how to treat this value. */
  @scala.inline
  def DOCKINGAREA_DEFAULT: `4` = 4.asInstanceOf[`4`]
  
  /** the left side docking area. */
  @scala.inline
  def DOCKINGAREA_LEFT: `2` = 2.asInstanceOf[`2`]
  
  /** the right side docking area. */
  @scala.inline
  def DOCKINGAREA_RIGHT: `3` = 3.asInstanceOf[`3`]
  
  /** the top docking area below the menu bar. */
  @scala.inline
  def DOCKINGAREA_TOP: `0` = 0.asInstanceOf[`0`]
}
