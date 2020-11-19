package typingsSlinky.openlayers.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The coordinate layout for geometries, indicating whether a 3rd or 4th z ('Z')
  * or measure ('M') coordinate is available. Supported values are `'XY'`,
  * `'XYZ'`, `'XYM'`, `'XYZM'`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openlayers.openlayersStrings.XY
  - typingsSlinky.openlayers.openlayersStrings.XYZ
  - typingsSlinky.openlayers.openlayersStrings.XYM
  - typingsSlinky.openlayers.openlayersStrings.XYZM
*/
trait GeometryLayout extends js.Object
object GeometryLayout {
  
  @scala.inline
  def XY: typingsSlinky.openlayers.openlayersStrings.XY = "XY".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.XY]
  
  @scala.inline
  def XYM: typingsSlinky.openlayers.openlayersStrings.XYM = "XYM".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.XYM]
  
  @scala.inline
  def XYZ: typingsSlinky.openlayers.openlayersStrings.XYZ = "XYZ".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.XYZ]
  
  @scala.inline
  def XYZM: typingsSlinky.openlayers.openlayersStrings.XYZM = "XYZM".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.XYZM]
}
