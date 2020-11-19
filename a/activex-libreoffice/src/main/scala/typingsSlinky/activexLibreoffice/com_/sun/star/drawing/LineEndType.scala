package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The LineEndType specifies the appearance of the bullet at the end of a line.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait LineEndType extends js.Object
object LineEndType {
  
  /** the line uses an arrow for the line end. */
  @scala.inline
  def ARROW: `1` = 1.asInstanceOf[`1`]
  
  /** the line uses a circle for the line end. */
  @scala.inline
  def CIRCLE: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the area is not filled.
    *
    * the line has no special end.
    *
    * the joint between lines will not be connected
    *
    * the line is hidden.
    *
    * Don't animate this text.
    *
    * the text size is only defined by the font properties
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * not implemented, yet.
    *
    * deprecated
    */
  @scala.inline
  def SPECIAL: `4` = 4.asInstanceOf[`4`]
  
  /**
    * the line will get a half square as additional cap
    *
    * the line uses a square for the line end.
    */
  @scala.inline
  def SQUARE: `3` = 3.asInstanceOf[`3`]
}
