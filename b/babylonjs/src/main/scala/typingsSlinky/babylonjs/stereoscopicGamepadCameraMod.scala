package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.gamepadCameraMod.GamepadCamera
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stereoscopicGamepadCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/stereoscopicGamepadCamera", "StereoscopicGamepadCamera")
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
