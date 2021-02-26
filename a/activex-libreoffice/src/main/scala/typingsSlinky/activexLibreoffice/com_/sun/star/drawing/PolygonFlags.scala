package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** defines how a Bezier curve goes through a point. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait PolygonFlags extends StObject
object PolygonFlags {
  
  /** the point is a control point, to control the curve from the user interface. */
  @scala.inline
  def CONTROL: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the text is drawn along the path without scaling.
    *
    * the point is normal, from the curve discussion view.
    */
  @scala.inline
  def NORMAL: `0` = 0.asInstanceOf[`0`]
  
  /**
    * the point is smooth, the first derivation from the curve discussion view.
    *
    * With SMOOTH shading, the colors of the lit vertices is interpolated.
    */
  @scala.inline
  def SMOOTH: `1` = 1.asInstanceOf[`1`]
  
  /** the point is symmetric, the second derivation from the curve discussion view. */
  @scala.inline
  def SYMMETRIC: `3` = 3.asInstanceOf[`3`]
}
