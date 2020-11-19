package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Bone")
@js.native
class Bone protected ()
  extends typingsSlinky.babylonjs.BABYLON.Bone {
  /**
    * Create a new bone
    * @param name defines the bone name
    * @param skeleton defines the parent skeleton
    * @param parentBone defines the parent (can be null if the bone is the root)
    * @param localMatrix defines the local matrix
    * @param restPose defines the rest pose matrix
    * @param baseMatrix defines the base matrix
    * @param index defines index of the bone in the hiearchy
    */
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.BABYLON.Skeleton
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsSlinky.babylonjs.BABYLON.Bone]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.BABYLON.Skeleton,
    parentBone: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Bone]],
    localMatrix: Nullable[typingsSlinky.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.BABYLON.Skeleton,
    parentBone: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Bone]],
    localMatrix: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Matrix]],
    restPose: Nullable[typingsSlinky.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.BABYLON.Skeleton,
    parentBone: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Bone]],
    localMatrix: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Matrix]],
    restPose: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Matrix]],
    baseMatrix: Nullable[typingsSlinky.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.BABYLON.Skeleton,
    parentBone: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Bone]],
    localMatrix: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Matrix]],
    restPose: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Matrix]],
    baseMatrix: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Matrix]],
    index: Nullable[Double]
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.Bone")
@js.native
object Bone extends js.Object {
  
  var _tmpMats: js.Any = js.native
  
  var _tmpQuat: js.Any = js.native
  
  var _tmpVecs: js.Any = js.native
}
