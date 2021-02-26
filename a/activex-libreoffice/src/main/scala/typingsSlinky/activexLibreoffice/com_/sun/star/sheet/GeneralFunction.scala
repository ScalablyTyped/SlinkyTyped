package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`10`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`11`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`12`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify a function to be calculated from values. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`10`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`11`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`12`
*/
trait GeneralFunction extends StObject
object GeneralFunction {
  
  /**
    * specifies the use of a user-defined list. <p>The cells are filled using a user-defined series.</p>
    *
    *
    *
    * function is determined automatically. <p>If the values are all numerical, SUM is used, otherwise COUNT.</p>
    */
  @scala.inline
  def AUTO: `1` = 1.asInstanceOf[`1`]
  
  /** average of all numerical values is calculated. */
  @scala.inline
  def AVERAGE: `4` = 4.asInstanceOf[`4`]
  
  /** all values, including non-numerical values, are counted. */
  @scala.inline
  def COUNT: `3` = 3.asInstanceOf[`3`]
  
  /** numerical values are counted. */
  @scala.inline
  def COUNTNUMS: `8` = 8.asInstanceOf[`8`]
  
  /** maximum value of all numerical values is calculated. */
  @scala.inline
  def MAX: `5` = 5.asInstanceOf[`5`]
  
  /** minimum value of all numerical values is calculated. */
  @scala.inline
  def MIN: `6` = 6.asInstanceOf[`6`]
  
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
  
  /** product of all numerical values is calculated. */
  @scala.inline
  def PRODUCT: `7` = 7.asInstanceOf[`7`]
  
  /** standard deviation is calculated based on a sample. */
  @scala.inline
  def STDEV: `9` = 9.asInstanceOf[`9`]
  
  /** standard deviation is calculated based on the entire population. */
  @scala.inline
  def STDEVP: `10` = 10.asInstanceOf[`10`]
  
  /** sum of all numerical values is calculated. */
  @scala.inline
  def SUM: `2` = 2.asInstanceOf[`2`]
  
  /** variance is calculated based on a sample. */
  @scala.inline
  def VAR: `11` = 11.asInstanceOf[`11`]
  
  /** variance is calculated based on the entire population. */
  @scala.inline
  def VARP: `12` = 12.asInstanceOf[`12`]
}
