package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration defines the style of a dash on a line. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait DashStyle extends StObject
object DashStyle {
  
  /** the dash is a rectangle */
  @scala.inline
  def RECT: `0` = 0.asInstanceOf[`0`]
  
  /** the dash is a rectangle, with the size of the dash given in relation to the length of the line */
  @scala.inline
  def RECTRELATIVE: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the dash is a point
    *
    * the line will get a half circle as additional cap
    *
    * the lines join with an arc
    */
  @scala.inline
  def ROUND: `1` = 1.asInstanceOf[`1`]
  
  /** the dash is a point, with the size of the dash given in relation to the length of the line */
  @scala.inline
  def ROUNDRELATIVE: `3` = 3.asInstanceOf[`3`]
}
