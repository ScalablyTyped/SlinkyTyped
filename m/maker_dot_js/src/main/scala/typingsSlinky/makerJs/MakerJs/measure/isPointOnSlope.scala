package typingsSlinky.makerJs.MakerJs.measure

import typingsSlinky.makerJs.MakerJs.IPoint
import typingsSlinky.makerJs.MakerJs.ISlope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isPointOnSlope")
@js.native
object isPointOnSlope extends js.Object {
  /**
    * Find out if point is on a slope.
    *
    * @param p Point to check.
    * @param b Slope.
    * @returns true if point is on the slope
    */
  def apply(p: IPoint, slope: ISlope): Boolean = js.native
  def apply(p: IPoint, slope: ISlope, withinDistance: Double): Boolean = js.native
}

