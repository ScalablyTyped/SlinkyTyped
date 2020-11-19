package typingsSlinky.babylonjs.mathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/math", "Viewport")
@js.native
class Viewport protected ()
  extends typingsSlinky.babylonjs.mathViewportMod.Viewport {
  /**
    * Creates a Viewport object located at (x, y) and sized (width, height)
    * @param x defines viewport left coordinate
    * @param y defines viewport top coordinate
    * @param width defines the viewport width
    * @param height defines the viewport height
    */
  def this(
    /** viewport left coordinate */
  x: Double,
    /** viewport top coordinate */
  y: Double,
    /**viewport width */
  width: Double,
    /** viewport height */
  height: Double
  ) = this()
}
