package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.gamepadCameraMod.GamepadCamera
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anaglyphGamepadCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/anaglyphGamepadCamera", "AnaglyphGamepadCamera")
  @js.native
  class AnaglyphGamepadCamera protected () extends GamepadCamera {
    /**
      * Creates a new AnaglyphGamepadCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
}
