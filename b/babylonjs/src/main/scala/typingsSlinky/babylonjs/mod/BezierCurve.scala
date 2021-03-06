package typingsSlinky.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "BezierCurve")
@js.native
class BezierCurve ()
  extends typingsSlinky.babylonjs.legacyMod.BezierCurve
/* static members */
object BezierCurve {
  
  /**
    * Returns the cubic Bezier interpolated value (float) at "t" (float) from the given x1, y1, x2, y2 floats
    * @param t defines the time
    * @param x1 defines the left coordinate on X axis
    * @param y1 defines the left coordinate on Y axis
    * @param x2 defines the right coordinate on X axis
    * @param y2 defines the right coordinate on Y axis
    * @returns the interpolated value
    */
  @JSImport("babylonjs", "BezierCurve.Interpolate")
  @js.native
  def Interpolate(t: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
}
