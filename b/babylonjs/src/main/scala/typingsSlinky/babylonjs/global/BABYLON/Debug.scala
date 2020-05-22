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
    /* CompleteClass */
    override var _instanced: js.Any = js.native
    /* CompleteClass */
    override var _scaleLinesFactor: js.Any = js.native
    /* CompleteClass */
    override var _xAxis: js.Any = js.native
    /* CompleteClass */
    override var _yAxis: js.Any = js.native
    /* CompleteClass */
    override var _zAxis: js.Any = js.native
    /**
      * Gets or sets a number used to scale line length
      */
    /* CompleteClass */
    override var scaleLines: Double = js.native
    /**
      * Gets the hosting scene
      */
    /* CompleteClass */
    override var scene: typingsSlinky.babylonjs.BABYLON.Scene = js.native
    /**
      * Creates an instance of this axes viewer.
      * @returns a new axes viewer with instanced meshes
      */
    /* CompleteClass */
    override def createInstance(): typingsSlinky.babylonjs.BABYLON.Debug.AxesViewer = js.native
    /** Releases resources */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Force the viewer to update
      * @param position defines the position of the viewer
      * @param xaxis defines the x axis of the viewer
      * @param yaxis defines the y axis of the viewer
      * @param zaxis defines the z axis of the viewer
      */
    /* CompleteClass */
    override def update(
      position: typingsSlinky.babylonjs.BABYLON.Vector3,
      xaxis: typingsSlinky.babylonjs.BABYLON.Vector3,
      yaxis: typingsSlinky.babylonjs.BABYLON.Vector3,
      zaxis: typingsSlinky.babylonjs.BABYLON.Vector3
    ): Unit = js.native
    /** Gets the node hierarchy used to render x-axis */
    /* CompleteClass */
    override def xAxis: typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
    /** Gets the node hierarchy used to render y-axis */
    /* CompleteClass */
    override def yAxis: typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
    /** Gets the node hierarchy used to render z-axis */
    /* CompleteClass */
    override def zAxis: typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
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
    /* CompleteClass */
    override var _instanced: js.Any = js.native
    /* CompleteClass */
    override var _scaleLinesFactor: js.Any = js.native
    /* CompleteClass */
    override var _xAxis: js.Any = js.native
    /* CompleteClass */
    override var _yAxis: js.Any = js.native
    /* CompleteClass */
    override var _zAxis: js.Any = js.native
    /**
      * Gets or sets the target bone where to display the axes viewer
      */
    /* CompleteClass */
    override var bone: Nullable[typingsSlinky.babylonjs.BABYLON.Bone] = js.native
    /**
      * Gets or sets the target mesh where to display the axes viewer
      */
    /* CompleteClass */
    override var mesh: Nullable[typingsSlinky.babylonjs.BABYLON.Mesh] = js.native
    /** Gets current position */
    /* CompleteClass */
    override var pos: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
    /**
      * Gets or sets a number used to scale line length
      */
    /* CompleteClass */
    override var scaleLines: Double = js.native
    /**
      * Gets the hosting scene
      */
    /* CompleteClass */
    override var scene: typingsSlinky.babylonjs.BABYLON.Scene = js.native
    /** Gets direction of X axis */
    /* CompleteClass */
    override var xaxis: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
    /** Gets direction of Y axis */
    /* CompleteClass */
    override var yaxis: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
    /** Gets direction of Z axis */
    /* CompleteClass */
    override var zaxis: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
    /**
      * Creates an instance of this axes viewer.
      * @returns a new axes viewer with instanced meshes
      */
    /* CompleteClass */
    override def createInstance(): typingsSlinky.babylonjs.BABYLON.Debug.AxesViewer = js.native
    /** Releases resources */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Force the viewer to update
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    /**
      * Force the viewer to update
      * @param position defines the position of the viewer
      * @param xaxis defines the x axis of the viewer
      * @param yaxis defines the y axis of the viewer
      * @param zaxis defines the z axis of the viewer
      */
    /* CompleteClass */
    override def update(
      position: typingsSlinky.babylonjs.BABYLON.Vector3,
      xaxis: typingsSlinky.babylonjs.BABYLON.Vector3,
      yaxis: typingsSlinky.babylonjs.BABYLON.Vector3,
      zaxis: typingsSlinky.babylonjs.BABYLON.Vector3
    ): Unit = js.native
    /** Gets the node hierarchy used to render x-axis */
    /* CompleteClass */
    override def xAxis: typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
    /** Gets the node hierarchy used to render y-axis */
    /* CompleteClass */
    override def yAxis: typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
    /** Gets the node hierarchy used to render z-axis */
    /* CompleteClass */
    override def zAxis: typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
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

