package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ShadeMode determines the quality of displaying the object. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait ShadeMode extends js.Object
object ShadeMode {
  
  /** DRAFT is a special mode which uses a BSP tree and triangle subdivision for displaying. */
  @scala.inline
  def DRAFT: `3` = 3.asInstanceOf[`3`]
  
  /**
    * forces one normal per flat part.
    *
    * With FLAT shading, the faces of the object are rendered in a solid color.
    */
  @scala.inline
  def FLAT: `0` = 0.asInstanceOf[`0`]
  
  /** With PHONG shading, the normal itself is interpolated to get more realistic colors and light reflections. */
  @scala.inline
  def PHONG: `1` = 1.asInstanceOf[`1`]
  
  /**
    * the point is smooth, the first derivation from the curve discussion view.
    *
    * With SMOOTH shading, the colors of the lit vertices is interpolated.
    */
  @scala.inline
  def SMOOTH: `2` = 2.asInstanceOf[`2`]
}
