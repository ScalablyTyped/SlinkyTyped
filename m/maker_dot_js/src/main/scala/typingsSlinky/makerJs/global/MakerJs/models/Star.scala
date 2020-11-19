package typingsSlinky.makerJs.global.MakerJs.models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.models.Star")
@js.native
class Star protected ()
  extends typingsSlinky.makerJs.MakerJs.models.Star {
  def this(numberOfPoints: Double, outerRadius: Double) = this()
  def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double) = this()
  def this(
    numberOfPoints: Double,
    outerRadius: Double,
    innerRadius: js.UndefOr[scala.Nothing],
    skipPoints: Double
  ) = this()
  def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double, skipPoints: Double) = this()
}
/* static members */
@JSGlobal("MakerJs.models.Star")
@js.native
object Star extends js.Object {
  
  def InnerRadiusRatio(numberOfPoints: Double, skipPoints: Double): Double = js.native
}
