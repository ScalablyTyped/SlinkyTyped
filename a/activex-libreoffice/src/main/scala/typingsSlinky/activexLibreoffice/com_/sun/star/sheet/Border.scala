package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to select one of the four borders of a cell range. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait Border extends StObject
object Border {
  
  /** selects the bottom border. */
  @scala.inline
  def BOTTOM: `1` = 1.asInstanceOf[`1`]
  
  /**
    * selects the left border.
    *
    * the cells to the right of the deleted cells are moved left.
    */
  @scala.inline
  def LEFT: `3` = 3.asInstanceOf[`3`]
  
  /**
    * selects the right border.
    *
    * the cells to the right of the inserted cells are moved right.
    */
  @scala.inline
  def RIGHT: `2` = 2.asInstanceOf[`2`]
  
  /** selects the top border. */
  @scala.inline
  def TOP: `0` = 0.asInstanceOf[`0`]
}
