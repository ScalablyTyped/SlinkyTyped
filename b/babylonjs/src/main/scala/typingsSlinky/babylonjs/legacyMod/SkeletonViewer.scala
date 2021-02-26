package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.anon.PartialISkeletonViewerOpt
import typingsSlinky.babylonjs.iskeletonviewerMod.IBoneWeightShaderOptions
import typingsSlinky.babylonjs.iskeletonviewerMod.ISkeletonMapShaderOptions
import org.scalablytyped.runtime.StObject
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
    * @param options All of the extra constructor options for the SkeletonViewer
    */
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    /** The Scene scope*/
  scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    /** The Scene scope*/
  scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    /** The Scene scope*/
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
    /** The Scene scope*/
  scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    /** The Scene scope*/
  scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: js.UndefOr[scala.Nothing],
    /** is the options for the viewer */
  options: PartialISkeletonViewerOpt
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    /** The Scene scope*/
  scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double,
    /** is the options for the viewer */
  options: PartialISkeletonViewerOpt
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    /** The Scene scope*/
  scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: js.UndefOr[scala.Nothing],
    /** is the options for the viewer */
  options: PartialISkeletonViewerOpt
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: typingsSlinky.babylonjs.skeletonMod.Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    /** The Scene scope*/
  scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double,
    /** is the options for the viewer */
  options: PartialISkeletonViewerOpt
  ) = this()
}
/* static members */
object SkeletonViewer {
  
  @JSImport("babylonjs/Legacy/legacy", "SkeletonViewer")
  @js.native
  val ^ : js.Any = js.native
  
  /** public static method to create a BoneWeight Shader
    * @param options The constructor options
    * @param scene The scene that the shader is scoped to
    * @returns The created ShaderMaterial
    * @see http://www.babylonjs-playground.com/#1BZJVJ#395
    */
  @JSImport("babylonjs/Legacy/legacy", "SkeletonViewer.CreateBoneWeightShader")
  @js.native
  def CreateBoneWeightShader(options: IBoneWeightShaderOptions, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.shaderMaterialMod.ShaderMaterial = js.native
  
  /** public static method to create a BoneWeight Shader
    * @param options The constructor options
    * @param scene The scene that the shader is scoped to
    * @returns The created ShaderMaterial
    */
  @JSImport("babylonjs/Legacy/legacy", "SkeletonViewer.CreateSkeletonMapShader")
  @js.native
  def CreateSkeletonMapShader(options: ISkeletonMapShaderOptions, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.shaderMaterialMod.ShaderMaterial = js.native
  
  /** public Display constants BABYLON.SkeletonViewer.DISPLAY_LINES */
  @JSImport("babylonjs/Legacy/legacy", "SkeletonViewer.DISPLAY_LINES")
  @js.native
  val DISPLAY_LINES: Double = js.native
  
  /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERES */
  @JSImport("babylonjs/Legacy/legacy", "SkeletonViewer.DISPLAY_SPHERES")
  @js.native
  val DISPLAY_SPHERES: Double = js.native
  
  /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERE_AND_SPURS */
  @JSImport("babylonjs/Legacy/legacy", "SkeletonViewer.DISPLAY_SPHERE_AND_SPURS")
  @js.native
  val DISPLAY_SPHERE_AND_SPURS: Double = js.native
  
  /** private static method to create a BoneWeight Shader
    * @param size The size of the buffer to create (usually the bone count)
    * @param colorMap The gradient data to generate
    * @param scene The scene that the shader is scoped to
    * @returns an Array of floats from the color gradient values
    */
  @JSImport("babylonjs/Legacy/legacy", "SkeletonViewer._CreateBoneMapColorBuffer")
  @js.native
  def _CreateBoneMapColorBuffer: js.Any = js.native
  @scala.inline
  def _CreateBoneMapColorBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateBoneMapColorBuffer")(x.asInstanceOf[js.Any])
}
