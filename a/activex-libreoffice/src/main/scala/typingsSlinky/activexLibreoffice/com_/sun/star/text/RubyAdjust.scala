package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These enumeration values describe the adjustment of ruby text. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait RubyAdjust extends js.Object
object RubyAdjust {
  
  /** adjusted to both borders / stretched */
  @scala.inline
  def BLOCK: `3` = 3.asInstanceOf[`3`]
  
  /**
    * the object is adjusted to the center.
    *
    * centric adjusted.
    */
  @scala.inline
  def CENTER: `1` = 1.asInstanceOf[`1`]
  
  /** adjusted to both borders except for a small indent on both sides */
  @scala.inline
  def INDENT_BLOCK: `4` = 4.asInstanceOf[`4`]
  
  /**
    * the object is left adjusted.
    *
    * adjusted to the left.
    *
    * text flows to the left side of the object.
    */
  @scala.inline
  def LEFT: `0` = 0.asInstanceOf[`0`]
  
  /**
    * the object is right adjusted.
    *
    * adjusted to the right.
    *
    * text flows to the right side of the object.
    */
  @scala.inline
  def RIGHT: `2` = 2.asInstanceOf[`2`]
}
