package typingsSlinky.babylonjs.babylonjsIndexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/index", "MeshLODLevel")
@js.native
class MeshLODLevel protected ()
  extends typingsSlinky.babylonjs.meshLODLevelMod.MeshLODLevel {
  /**
    * Creates a new LOD level
    * @param distance defines the distance where this level should star being displayed
    * @param mesh defines the mesh to use to render this level
    */
  def this(
    /** Defines the distance where this level should start being displayed */
  distance: Double,
    /** Defines the mesh to use to render this level */
  mesh: Nullable[typingsSlinky.babylonjs.meshMod.Mesh]
  ) = this()
}

