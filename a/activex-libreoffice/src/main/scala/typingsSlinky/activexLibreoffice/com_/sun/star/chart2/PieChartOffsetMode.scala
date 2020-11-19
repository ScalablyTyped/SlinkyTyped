package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Mode used for a pie chart template to determine the initial state of exploded pies. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait PieChartOffsetMode extends js.Object
object PieChartOffsetMode {
  
  /** All pies are exploded by a certain percentage. The default is 10 percent. */
  @scala.inline
  def ALL_EXPLODED: `1` = 1.asInstanceOf[`1`]
  
  /**
    * Default, no pies are exploded.
    *
    * The symbol is invisible
    *
    * no transparency attribute is evaluated
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
}
