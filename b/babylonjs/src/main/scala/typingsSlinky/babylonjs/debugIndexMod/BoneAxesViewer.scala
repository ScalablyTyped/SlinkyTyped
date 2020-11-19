package typingsSlinky.babylonjs.debugIndexMod

import typingsSlinky.babylonjs.boneMod.Bone
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Debug/index", "BoneAxesViewer")
@js.native
class BoneAxesViewer protected ()
  extends typingsSlinky.babylonjs.boneAxesViewerMod.BoneAxesViewer {
  /**
    * Creates a new BoneAxesViewer
    * @param scene defines the hosting scene
    * @param bone defines the target bone
    * @param mesh defines the target mesh
    * @param scaleLines defines a scaling factor for line length (1 by default)
    */
  def this(scene: Scene, bone: Bone, mesh: Mesh) = this()
  def this(scene: Scene, bone: Bone, mesh: Mesh, scaleLines: Double) = this()
}
