package typingsSlinky.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GroundMesh")
@js.native
class GroundMesh protected ()
  extends typingsSlinky.babylonjs.indexMod.GroundMesh {
  def this(name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object GroundMesh {
  
  /**
    * Parses a serialized ground mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the ground mesh in
    * @returns the created ground mesh
    */
  @JSImport("babylonjs/Legacy/legacy", "GroundMesh.Parse")
  @js.native
  def Parse(parsedMesh: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
}
