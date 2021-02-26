package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
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
object Bone {
  
  @JSImport("babylonjs/Legacy/legacy", "Bone")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "Bone._tmpMats")
  @js.native
  def _tmpMats: js.Any = js.native
  @scala.inline
  def _tmpMats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpMats")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "Bone._tmpQuat")
  @js.native
  def _tmpQuat: js.Any = js.native
  @scala.inline
  def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "Bone._tmpVecs")
  @js.native
  def _tmpVecs: js.Any = js.native
  @scala.inline
  def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
}
