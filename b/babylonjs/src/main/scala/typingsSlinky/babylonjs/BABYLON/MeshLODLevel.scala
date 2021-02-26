package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshLODLevel extends StObject {
  
  /** Defines the distance where this level should start being displayed */
  var distance: Double = js.native
  
  /** Defines the mesh to use to render this level */
  var mesh: Nullable[Mesh] = js.native
}
object MeshLODLevel {
  
  @scala.inline
  def apply(distance: Double): MeshLODLevel = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshLODLevel]
  }
  
  @scala.inline
  implicit class MeshLODLevelMutableBuilder[Self <: MeshLODLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(value: Nullable[Mesh]): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshNull: Self = StObject.set(x, "mesh", null)
  }
}
