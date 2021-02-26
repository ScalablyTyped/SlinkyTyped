package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to specify how cells are moved when new cells are inserted. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait CellInsertMode extends StObject
object CellInsertMode {
  
  /**
    * entire columns to the right of the deleted cells are moved left.
    *
    * entire columns to the right of the inserted cells are moved right.
    */
  @scala.inline
  def COLUMNS: `4` = 4.asInstanceOf[`4`]
  
  /** the cells below the inserted cells are moved down. */
  @scala.inline
  def DOWN: `1` = 1.asInstanceOf[`1`]
  
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * selects the right border.
    *
    * the cells to the right of the inserted cells are moved right.
    */
  @scala.inline
  def RIGHT: `2` = 2.asInstanceOf[`2`]
  
  /**
    * entire rows below the deleted cells are moved up.
    *
    * entire rows below the inserted cells are moved down.
    */
  @scala.inline
  def ROWS: `3` = 3.asInstanceOf[`3`]
}
