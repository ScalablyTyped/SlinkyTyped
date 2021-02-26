package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specify how the text content is attached to its surrounding text. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait TextContentAnchorType extends StObject
object TextContentAnchorType {
  
  /**
    * The object is anchored instead of a character.
    *
    * <p>The size of the object influences the height of the text line.</p>
    */
  @scala.inline
  def AS_CHARACTER: `1` = 1.asInstanceOf[`1`]
  
  /**
    * The object is anchored to a character.
    *
    * <p>The position of the object changes if the position of this
    *
    * character is changed.
    *
    * </p>
    */
  @scala.inline
  def AT_CHARACTER: `4` = 4.asInstanceOf[`4`]
  
  /** The object is anchored to a text frame. */
  @scala.inline
  def AT_FRAME: `3` = 3.asInstanceOf[`3`]
  
  /**
    * The object is anchored to the page.
    *
    * <p>The position does not change if the content of the document is changed.</p>
    */
  @scala.inline
  def AT_PAGE: `2` = 2.asInstanceOf[`2`]
  
  /** The anchor of the object is set at the top left position of the paragraph. */
  @scala.inline
  def AT_PARAGRAPH: `0` = 0.asInstanceOf[`0`]
}
