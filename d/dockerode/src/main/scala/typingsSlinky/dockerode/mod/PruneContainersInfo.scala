package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PruneContainersInfo extends StObject {
  
  var ContainersDeleted: js.Array[String] = js.native
  
  var SpaceReclaimed: Double = js.native
}
object PruneContainersInfo {
  
  @scala.inline
  def apply(ContainersDeleted: js.Array[String], SpaceReclaimed: Double): PruneContainersInfo = {
    val __obj = js.Dynamic.literal(ContainersDeleted = ContainersDeleted.asInstanceOf[js.Any], SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneContainersInfo]
  }
  
  @scala.inline
  implicit class PruneContainersInfoMutableBuilder[Self <: PruneContainersInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainersDeleted(value: js.Array[String]): Self = StObject.set(x, "ContainersDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersDeletedVarargs(value: String*): Self = StObject.set(x, "ContainersDeleted", js.Array(value :_*))
    
    @scala.inline
    def setSpaceReclaimed(value: Double): Self = StObject.set(x, "SpaceReclaimed", value.asInstanceOf[js.Any])
  }
}
