package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies how an area will be filled. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait FillStyle extends StObject
object FillStyle {
  
  /** use a bitmap to fill the area. */
  @scala.inline
  def BITMAP: `4` = 4.asInstanceOf[`4`]
  
  /** use a gradient color to fill the area. */
  @scala.inline
  def GRADIENT: `2` = 2.asInstanceOf[`2`]
  
  /** use a hatch to fill the area. */
  @scala.inline
  def HATCH: `3` = 3.asInstanceOf[`3`]
  
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
    * use a solid color to fill the area.
    *
    * the line is solid.
    */
  @scala.inline
  def SOLID: `1` = 1.asInstanceOf[`1`]
}
