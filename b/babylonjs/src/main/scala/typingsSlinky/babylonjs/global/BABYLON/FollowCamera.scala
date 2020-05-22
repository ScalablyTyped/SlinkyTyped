package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Behavior
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.FollowCamera")
@js.native
class FollowCamera protected ()
  extends typingsSlinky.babylonjs.BABYLON.FollowCamera {
  /**
    * Instantiates the follow camera.
    * @see http://doc.babylonjs.com/features/cameras#follow-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the position of the camera
    * @param scene Define the scene the camera belong to
    * @param lockedTarget Define the target of the camera
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
    lockedTarget: Nullable[typingsSlinky.babylonjs.BABYLON.AbstractMesh]
  ) = this()
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typingsSlinky.babylonjs.BABYLON.Node]): typingsSlinky.babylonjs.BABYLON.Node = js.native
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typingsSlinky.babylonjs.BABYLON.Node]] = js.native
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typingsSlinky.babylonjs.BABYLON.Node]): typingsSlinky.babylonjs.BABYLON.Node = js.native
}

