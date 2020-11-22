package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IClipPlanesHolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ThinMaterialHelper")
@js.native
class ThinMaterialHelper ()
  extends typingsSlinky.babylonjs.BABYLON.ThinMaterialHelper
/* static members */
@JSGlobal("BABYLON.ThinMaterialHelper")
@js.native
object ThinMaterialHelper extends js.Object {
  
  /**
    * Binds the clip plane information from the holder to the effect.
    * @param effect The effect we are binding the data to
    * @param holder The entity containing the clip plane information
    */
  def BindClipPlane(effect: typingsSlinky.babylonjs.BABYLON.Effect, holder: IClipPlanesHolder): Unit = js.native
}
