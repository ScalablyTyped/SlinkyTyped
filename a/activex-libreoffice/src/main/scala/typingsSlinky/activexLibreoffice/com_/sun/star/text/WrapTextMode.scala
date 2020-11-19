package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enumeration values specify the text wrap around objects in a text. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait WrapTextMode extends js.Object
object WrapTextMode {
  
  /** text flow depends on the situation. The text formatting decides the best way. */
  @scala.inline
  def DYNAMIC: `3` = 3.asInstanceOf[`3`]
  
  /**
    * the object is left adjusted.
    *
    * adjusted to the left.
    *
    * text flows to the left side of the object.
    */
  @scala.inline
  def LEFT: `4` = 4.asInstanceOf[`4`]
  
  /** text does not flow around the object. */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** text flows to the left and right of the object. */
  @scala.inline
  def PARALLEL: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the object is right adjusted.
    *
    * adjusted to the right.
    *
    * text flows to the right side of the object.
    */
  @scala.inline
  def RIGHT: `5` = 5.asInstanceOf[`5`]
  
  /** text flow ignores the object. */
  @scala.inline
  def THROUGHT: `1` = 1.asInstanceOf[`1`]
}
