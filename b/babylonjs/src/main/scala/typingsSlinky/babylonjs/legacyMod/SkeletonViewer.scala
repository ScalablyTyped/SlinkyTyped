package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SkeletonViewer")
@js.native
class SkeletonViewer protected ()
  extends typingsSlinky.babylonjs.indexMod.SkeletonViewer {
  /**
    * Creates a new SkeletonViewer
    * @param skeleton defines the skeleton to render
    * @param mesh defines the mesh attached to the skeleton
    * @param scene defines the hosting scene
    * @param autoUpdateBonesMatrices defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)
    * @param renderingGroupId defines the rendering group id to use with the viewer
    */
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double
  ) = this()
}
