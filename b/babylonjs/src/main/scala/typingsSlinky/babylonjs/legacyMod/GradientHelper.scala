package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.gradientsMod.IValueGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GradientHelper")
@js.native
class GradientHelper ()
  extends typingsSlinky.babylonjs.indexMod.GradientHelper
/* static members */
@JSImport("babylonjs/Legacy/legacy", "GradientHelper")
@js.native
object GradientHelper extends js.Object {
  
  /**
    * Gets the current gradient from an array of IValueGradient
    * @param ratio defines the current ratio to get
    * @param gradients defines the array of IValueGradient
    * @param updateFunc defines the callback function used to get the final value from the selected gradients
    */
  def GetCurrentGradient(
    ratio: Double,
    gradients: js.Array[IValueGradient],
    updateFunc: js.Function3[/* current */ IValueGradient, /* next */ IValueGradient, /* scale */ Double, Unit]
  ): Unit = js.native
}
