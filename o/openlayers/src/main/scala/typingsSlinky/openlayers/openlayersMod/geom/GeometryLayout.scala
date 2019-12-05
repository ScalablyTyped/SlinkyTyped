package typingsSlinky.openlayers.openlayersMod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The coordinate layout for geometries, indicating whether a 3rd or 4th z ('Z')
  * or measure ('M') coordinate is available. Supported values are `'XY'`,
  * `'XYZ'`, `'XYM'`, `'XYZM'`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.XY
  - typings.openlayers.openlayersStrings.XYZ
  - typings.openlayers.openlayersStrings.XYM
  - typings.openlayers.openlayersStrings.XYZM
*/
trait GeometryLayout extends js.Object

object GeometryLayout {
  @scala.inline
  def XY: typingsSlinky.openlayers.openlayersStrings.XY = this.cast("XY")
  @scala.inline
  def XYM: typingsSlinky.openlayers.openlayersStrings.XYM = this.cast("XYM")
  @scala.inline
  def XYZ: typingsSlinky.openlayers.openlayersStrings.XYZ = this.cast("XYZ")
  @scala.inline
  def XYZM: typingsSlinky.openlayers.openlayersStrings.XYZM = this.cast("XYZM")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

