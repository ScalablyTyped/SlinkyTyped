package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The LineCap defines rendering of ends of thick lines */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait LineCap extends StObject
object LineCap {
  
  /** the line will end without any additional shape */
  @scala.inline
  def BUTT: `0` = 0.asInstanceOf[`0`]
  
  /**
    * the dash is a point
    *
    * the line will get a half circle as additional cap
    *
    * the lines join with an arc
    */
  @scala.inline
  def ROUND: `1` = 1.asInstanceOf[`1`]
  
  /**
    * the line will get a half square as additional cap
    *
    * the line uses a square for the line end.
    */
  @scala.inline
  def SQUARE: `2` = 2.asInstanceOf[`2`]
}
