package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration specifies the type of animation for a text. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
*/
trait TextAnimationKind extends js.Object
object TextAnimationKind {
  
  /** Scroll the text from one side to the other and back. */
  @scala.inline
  def ALTERNATE: `3` = 3.asInstanceOf[`3`]
  
  /** Let this text switch its state from visible to invisible continuously. */
  @scala.inline
  def BLINK: `1` = 1.asInstanceOf[`1`]
  
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
  
  /** Let this text scroll. */
  @scala.inline
  def SCROLL: `2` = 2.asInstanceOf[`2`]
  
  /** Scroll the text from one side to the final position and stop there. */
  @scala.inline
  def SLIDE: `4` = 4.asInstanceOf[`4`]
}
