package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.freeCameraMod.FreeCamera
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anaglyphFreeCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/anaglyphFreeCamera", "AnaglyphFreeCamera")
  @js.native
  class AnaglyphFreeCamera protected () extends FreeCamera {
    /**
      * Creates a new AnaglyphFreeCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
}
