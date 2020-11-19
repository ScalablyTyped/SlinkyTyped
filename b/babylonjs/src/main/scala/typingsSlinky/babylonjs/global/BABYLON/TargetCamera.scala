package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TargetCamera")
@js.native
class TargetCamera protected ()
  extends typingsSlinky.babylonjs.BABYLON.TargetCamera {
  /**
    * Instantiates a target camera that takes a mesh or position as a target and continues to look at it while it moves.
    * This is the base of the follow, arc rotate cameras and Free camera
    * @see http://doc.babylonjs.com/features/cameras
    * @param name Defines the name of the camera in the scene
    * @param position Defines the start position of the camera in the scene
    * @param scene Defines the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.TargetCamera")
@js.native
object TargetCamera extends js.Object {
  
  var _RigCamTransformMatrix: js.Any = js.native
  
  var _TargetFocalPoint: js.Any = js.native
  
  var _TargetTransformMatrix: js.Any = js.native
}
