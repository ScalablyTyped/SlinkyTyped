package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Behavior
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VirtualJoysticksCamera")
@js.native
class VirtualJoysticksCamera protected ()
  extends typingsSlinky.babylonjs.BABYLON.VirtualJoysticksCamera {
  /**
    * Intantiates a VirtualJoysticksCamera. It can be useful in First Person Shooter game for instance.
    * It is identical to the Free Camera and simply adds by default a virtual joystick.
    * Virtual Joysticks are on-screen 2D graphics that are used to control the camera or other scene items.
    * @see http://doc.babylonjs.com/features/cameras#virtual-joysticks-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
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

