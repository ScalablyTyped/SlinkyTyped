package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.gamepadCameraMod.GamepadCamera
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/Stereoscopic/stereoscopicGamepadCamera", JSImport.Namespace)
@js.native
object stereoscopicGamepadCameraMod extends js.Object {
  @js.native
  class StereoscopicGamepadCamera protected () extends GamepadCamera {
    /**
      * Creates a new StereoscopicGamepadCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
      * @param scene defines the hosting scene
      */
    def this(
      name: String,
      position: Vector3,
      interaxialDistance: Double,
      isStereoscopicSideBySide: Boolean,
      scene: Scene
    ) = this()
  }
  
}

