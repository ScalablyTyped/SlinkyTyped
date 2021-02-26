package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stereoscopicIndexMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "AnaglyphArcRotateCamera")
  @js.native
  class AnaglyphArcRotateCamera protected ()
    extends typingsSlinky.babylonjs.anaglyphArcRotateCameraMod.AnaglyphArcRotateCamera {
    /**
      * Creates a new AnaglyphArcRotateCamera
      * @param name defines camera name
      * @param alpha defines alpha angle (in radians)
      * @param beta defines beta angle (in radians)
      * @param radius defines radius
      * @param target defines camera target
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      interaxialDistance: Double,
      scene: Scene
    ) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "AnaglyphFreeCamera")
  @js.native
  class AnaglyphFreeCamera protected ()
    extends typingsSlinky.babylonjs.anaglyphFreeCameraMod.AnaglyphFreeCamera {
    /**
      * Creates a new AnaglyphFreeCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "AnaglyphGamepadCamera")
  @js.native
  class AnaglyphGamepadCamera protected ()
    extends typingsSlinky.babylonjs.anaglyphGamepadCameraMod.AnaglyphGamepadCamera {
    /**
      * Creates a new AnaglyphGamepadCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "AnaglyphUniversalCamera")
  @js.native
  class AnaglyphUniversalCamera protected ()
    extends typingsSlinky.babylonjs.anaglyphUniversalCameraMod.AnaglyphUniversalCamera {
    /**
      * Creates a new AnaglyphUniversalCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "StereoscopicArcRotateCamera")
  @js.native
  class StereoscopicArcRotateCamera protected ()
    extends typingsSlinky.babylonjs.stereoscopicArcRotateCameraMod.StereoscopicArcRotateCamera {
    /**
      * Creates a new StereoscopicArcRotateCamera
      * @param name defines camera name
      * @param alpha defines alpha angle (in radians)
      * @param beta defines beta angle (in radians)
      * @param radius defines radius
      * @param target defines camera target
      * @param interaxialDistance defines distance between each color axis
      * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
      * @param scene defines the hosting scene
      */
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      interaxialDistance: Double,
      isStereoscopicSideBySide: Boolean,
      scene: Scene
    ) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "StereoscopicFreeCamera")
  @js.native
  class StereoscopicFreeCamera protected ()
    extends typingsSlinky.babylonjs.stereoscopicFreeCameraMod.StereoscopicFreeCamera {
    /**
      * Creates a new StereoscopicFreeCamera
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
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "StereoscopicGamepadCamera")
  @js.native
  class StereoscopicGamepadCamera protected ()
    extends typingsSlinky.babylonjs.stereoscopicGamepadCameraMod.StereoscopicGamepadCamera {
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
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "StereoscopicUniversalCamera")
  @js.native
  class StereoscopicUniversalCamera protected ()
    extends typingsSlinky.babylonjs.stereoscopicUniversalCameraMod.StereoscopicUniversalCamera {
    /**
      * Creates a new StereoscopicUniversalCamera
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
