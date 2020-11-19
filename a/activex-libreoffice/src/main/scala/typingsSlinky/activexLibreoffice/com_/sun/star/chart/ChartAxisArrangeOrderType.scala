package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Values specify the arrangement of the axes descriptions. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait ChartAxisArrangeOrderType extends js.Object
object ChartAxisArrangeOrderType {
  
  /**
    * The descriptions are arranged automatically. <p>If there is enough space to put them side by side, this
    *
    * arrangement is preferred. If the descriptions would overlap
    *
    * when arranged side by side, they are staggered.</p>
    */
  @scala.inline
  def AUTO: `0` = 0.asInstanceOf[`0`]
  
  /** The descriptions are arranged side by side. */
  @scala.inline
  def SIDE_BY_SIDE: `1` = 1.asInstanceOf[`1`]
  
  /** The descriptions are alternately put on two lines with the even values out of the normal line. */
  @scala.inline
  def STAGGER_EVEN: `2` = 2.asInstanceOf[`2`]
  
  /** The descriptions are alternately put on two lines with the odd values out of the normal line. */
  @scala.inline
  def STAGGER_ODD: `3` = 3.asInstanceOf[`3`]
}
