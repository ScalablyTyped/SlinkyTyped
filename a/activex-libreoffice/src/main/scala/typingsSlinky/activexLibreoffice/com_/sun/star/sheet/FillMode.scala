package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify the series type used to fill cells. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait FillMode extends js.Object
object FillMode {
  
  /**
    * specifies the use of a user-defined list. <p>The cells are filled using a user-defined series.</p>
    *
    *
    *
    * function is determined automatically. <p>If the values are all numerical, SUM is used, otherwise COUNT.</p>
    */
  @scala.inline
  def AUTO: `4` = 4.asInstanceOf[`4`]
  
  /**
    * specifies an arithmetic series for date values. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by a specified number of days</p>
    * @@see com::sun::star::sheet::FillDateMode  any date value matching the specified condition is valid.
    */
  @scala.inline
  def DATE: `3` = 3.asInstanceOf[`3`]
  
  /**
    * specifies a geometric series. <p>Cell by cell, the value used to fill the cells is multiplied
    *
    * by a specified value.</p>
    */
  @scala.inline
  def GROWTH: `2` = 2.asInstanceOf[`2`]
  
  /**
    * specifies an arithmetic series. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by an additive value.</p>
    */
  @scala.inline
  def LINEAR: `1` = 1.asInstanceOf[`1`]
  
  /** specifies a constant series. <p>All cells are filled with the same value.</p> */
  @scala.inline
  def SIMPLE: `0` = 0.asInstanceOf[`0`]
}
