package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMeshOutput extends StObject {
  
  var mesh: MeshData = js.native
}
object UpdateMeshOutput {
  
  @scala.inline
  def apply(mesh: MeshData): UpdateMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMeshOutput]
  }
  
  @scala.inline
  implicit class UpdateMeshOutputMutableBuilder[Self <: UpdateMeshOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMesh(value: MeshData): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
