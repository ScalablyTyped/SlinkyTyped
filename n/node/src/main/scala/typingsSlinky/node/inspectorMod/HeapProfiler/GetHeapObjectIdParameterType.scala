package typingsSlinky.node.inspectorMod.HeapProfiler

import typingsSlinky.node.inspectorMod.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHeapObjectIdParameterType extends StObject {
  
  /**
    * Identifier of the object to get heap object id for.
    */
  var objectId: RemoteObjectId = js.native
}
object GetHeapObjectIdParameterType {
  
  @scala.inline
  def apply(objectId: RemoteObjectId): GetHeapObjectIdParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdParameterType]
  }
  
  @scala.inline
  implicit class GetHeapObjectIdParameterTypeMutableBuilder[Self <: GetHeapObjectIdParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
