package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IValueGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GradientHelper")
@js.native
class GradientHelper ()
  extends typingsSlinky.babylonjs.BABYLON.GradientHelper
/* static members */
@JSGlobal("BABYLON.GradientHelper")
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
