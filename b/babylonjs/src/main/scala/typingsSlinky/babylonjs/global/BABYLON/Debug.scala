package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Debug")
@js.native
object Debug extends js.Object {
  @js.native
  class AxesViewer protected ()
    extends typingsSlinky.babylonjs.BABYLON.Debug.AxesViewer {
    /**
      * Creates a new AxesViewer
      * @param scene defines the hosting scene
      * @param scaleLines defines a number used to scale line length (1 by default)
      * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
      * @param xAxis defines the node hierarchy used to render the x-axis
      * @param yAxis defines the node hierarchy used to render the y-axis
      * @param zAxis defines the node hierarchy used to render the z-axis
      */
    def this(scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
    def this(scene: typingsSlinky.babylonjs.BABYLON.Scene, scaleLines: Double) = this()
    def this(
      scene: typingsSlinky.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: Nullable[Double]
    ) = this()
    def this(
      scene: typingsSlinky.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: Nullable[Double],
      xAxis: typingsSlinky.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typingsSlinky.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: Nullable[Double],
      xAxis: typingsSlinky.babylonjs.BABYLON.TransformNode,
      yAxis: typingsSlinky.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typingsSlinky.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: Nullable[Double],
      xAxis: typingsSlinky.babylonjs.BABYLON.TransformNode,
      yAxis: typingsSlinky.babylonjs.BABYLON.TransformNode,
      zAxis: typingsSlinky.babylonjs.BABYLON.TransformNode
    ) = this()
  }
  
  @js.native
  class BoneAxesViewer protected ()
    extends typingsSlinky.babylonjs.BABYLON.Debug.BoneAxesViewer {
    /**
      * Creates a new BoneAxesViewer
      * @param scene defines the hosting scene
      * @param bone defines the target bone
      * @param mesh defines the target mesh
      * @param scaleLines defines a scaling factor for line length (1 by default)
      */
    def this(
      scene: typingsSlinky.babylonjs.BABYLON.Scene,
      bone: typingsSlinky.babylonjs.BABYLON.Bone,
      mesh: typingsSlinky.babylonjs.BABYLON.Mesh
    ) = this()
    def this(
      scene: typingsSlinky.babylonjs.BABYLON.Scene,
      bone: typingsSlinky.babylonjs.BABYLON.Bone,
      mesh: typingsSlinky.babylonjs.BABYLON.Mesh,
      scaleLines: Double
    ) = this()
  }
  
  @js.native
  class PhysicsViewer protected ()
    extends typingsSlinky.babylonjs.BABYLON.Debug.PhysicsViewer {
    /**
      * Creates a new PhysicsViewer
      * @param scene defines the hosting scene
      */
    def this(scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  }
  
  @js.native
  class SkeletonViewer protected ()
    extends typingsSlinky.babylonjs.BABYLON.Debug.SkeletonViewer {
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
    skeleton: typingsSlinky.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
      scene: typingsSlinky.babylonjs.BABYLON.Scene
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typingsSlinky.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
      scene: typingsSlinky.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typingsSlinky.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
      scene: typingsSlinky.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
  }
  
  /* static members */
  @js.native
  object AxesViewer extends js.Object {
    var _SetRenderingGroupId: js.Any = js.native
  }
  
}

