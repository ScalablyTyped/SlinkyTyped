package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/centerconstraint", JSImport.Namespace)
@js.native
object centerconstraintMod extends js.Object {
  def createExtent(extent: Extent, onlyCenter: Boolean, smooth: Boolean): Type = js.native
  def none(): Coordinate = js.native
  def none(center: Coordinate): Coordinate = js.native
  type Type = js.Function4[
    /* p0 */ js.UndefOr[Coordinate], 
    /* p1 */ Double, 
    /* p2 */ Size, 
    /* p3 */ js.UndefOr[Boolean], 
    Coordinate
  ]
}

