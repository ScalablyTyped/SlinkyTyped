package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Behavior
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TransformNode")
@js.native
class TransformNode protected ()
  extends typingsSlinky.babylonjs.BABYLON.TransformNode {
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]) = this()
  def this(name: String, scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene], isPure: Boolean) = this()
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

/* static members */
@JSGlobal("BABYLON.TransformNode")
@js.native
object TransformNode extends js.Object {
  /**
    * Object will rotate to face the camera
    */
  var BILLBOARDMODE_ALL: Double = js.native
  /**
    * Object will not rotate to face the camera
    */
  var BILLBOARDMODE_NONE: Double = js.native
  /**
    * Object will rotate to face the camera's position instead of orientation
    */
  var BILLBOARDMODE_USE_POSITION: Double = js.native
  /**
    * Object will rotate to face the camera but only on the x axis
    */
  var BILLBOARDMODE_X: Double = js.native
  /**
    * Object will rotate to face the camera but only on the y axis
    */
  var BILLBOARDMODE_Y: Double = js.native
  /**
    * Object will rotate to face the camera but only on the z axis
    */
  var BILLBOARDMODE_Z: Double = js.native
  var _lookAtVectorCache: js.Any = js.native
  var _rotationAxisCache: js.Any = js.native
  /**
    * Returns a new TransformNode object parsed from the source provided.
    * @param parsedTransformNode is the source.
    * @param scene the scne the object belongs to
    * @param rootUrl is a string, it's the root URL to prefix the `delayLoadingFile` property with
    * @returns a new TransformNode object parsed from the source provided.
    */
  def Parse(parsedTransformNode: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene, rootUrl: String): typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
}

