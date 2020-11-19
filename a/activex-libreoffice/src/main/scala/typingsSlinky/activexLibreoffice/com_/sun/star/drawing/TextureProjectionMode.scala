package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines how the texture is mapped to the object.
  *
  * It can be set independently for X and Y texture directions.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait TextureProjectionMode extends js.Object
object TextureProjectionMode {
  
  /** This value specifies that the standard object projection method is used. */
  @scala.inline
  def OBJECTSPECIFIC: `0` = 0.asInstanceOf[`0`]
  
  /**
    * the 3D objects are drawn in the parallel projection.
    *
    * This value specifies a flat parallel projection in the specified degree of freedom (X or Y).
    */
  @scala.inline
  def PARALLEL: `1` = 1.asInstanceOf[`1`]
  
  /**
    * forces normals to think that the object is a sphere.
    *
    * This value forces projection to wrapping in X and/or Y.
    */
  @scala.inline
  def SPHERE: `2` = 2.asInstanceOf[`2`]
}
