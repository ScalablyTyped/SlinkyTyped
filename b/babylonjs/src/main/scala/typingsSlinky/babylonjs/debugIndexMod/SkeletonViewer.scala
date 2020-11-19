package typingsSlinky.babylonjs.debugIndexMod

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.skeletonMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Debug/index", "SkeletonViewer")
@js.native
class SkeletonViewer protected ()
  extends typingsSlinky.babylonjs.skeletonViewerMod.SkeletonViewer {
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
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    scene: Scene
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double
  ) = this()
}
