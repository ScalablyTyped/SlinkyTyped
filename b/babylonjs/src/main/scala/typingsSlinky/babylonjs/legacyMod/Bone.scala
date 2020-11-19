package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Bone")
@js.native
class Bone protected ()
  extends typingsSlinky.babylonjs.indexMod.Bone {
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
    skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    parentBone: Nullable[typingsSlinky.babylonjs.boneMod.Bone]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    parentBone: js.UndefOr[Nullable[typingsSlinky.babylonjs.boneMod.Bone]],
    localMatrix: Nullable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    parentBone: js.UndefOr[Nullable[typingsSlinky.babylonjs.boneMod.Bone]],
    localMatrix: js.UndefOr[Nullable[typingsSlinky.babylonjs.mathVectorMod.Matrix]],
    restPose: Nullable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    parentBone: js.UndefOr[Nullable[typingsSlinky.babylonjs.boneMod.Bone]],
    localMatrix: js.UndefOr[Nullable[typingsSlinky.babylonjs.mathVectorMod.Matrix]],
    restPose: js.UndefOr[Nullable[typingsSlinky.babylonjs.mathVectorMod.Matrix]],
    baseMatrix: Nullable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    parentBone: js.UndefOr[Nullable[typingsSlinky.babylonjs.boneMod.Bone]],
    localMatrix: js.UndefOr[Nullable[typingsSlinky.babylonjs.mathVectorMod.Matrix]],
    restPose: js.UndefOr[Nullable[typingsSlinky.babylonjs.mathVectorMod.Matrix]],
    baseMatrix: js.UndefOr[Nullable[typingsSlinky.babylonjs.mathVectorMod.Matrix]],
    index: Nullable[Double]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "Bone")
@js.native
object Bone extends js.Object {
  
  var _tmpMats: js.Any = js.native
  
  var _tmpQuat: js.Any = js.native
  
  var _tmpVecs: js.Any = js.native
}
