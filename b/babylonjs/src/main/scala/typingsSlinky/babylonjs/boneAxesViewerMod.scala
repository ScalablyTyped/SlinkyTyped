package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.axesViewerMod.AxesViewer
import typingsSlinky.babylonjs.boneMod.Bone
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Debug/boneAxesViewer", JSImport.Namespace)
@js.native
object boneAxesViewerMod extends js.Object {
  
  @js.native
  class BoneAxesViewer protected () extends AxesViewer {
    /**
      * Creates a new BoneAxesViewer
      * @param scene defines the hosting scene
      * @param bone defines the target bone
      * @param mesh defines the target mesh
      * @param scaleLines defines a scaling factor for line length (1 by default)
      */
    def this(scene: Scene, bone: Bone, mesh: Mesh) = this()
    def this(scene: Scene, bone: Bone, mesh: Mesh, scaleLines: Double) = this()
    
    /**
      * Gets or sets the target bone where to display the axes viewer
      */
    var bone: Nullable[Bone] = js.native
    
    /**
      * Gets or sets the target mesh where to display the axes viewer
      */
    var mesh: Nullable[Mesh] = js.native
    
    /** Gets current position */
    var pos: Vector3 = js.native
    
    /**
      * Force the viewer to update
      */
    def update(): Unit = js.native
    
    /** Gets direction of X axis */
    var xaxis: Vector3 = js.native
    
    /** Gets direction of Y axis */
    var yaxis: Vector3 = js.native
    
    /** Gets direction of Z axis */
    var zaxis: Vector3 = js.native
  }
}
