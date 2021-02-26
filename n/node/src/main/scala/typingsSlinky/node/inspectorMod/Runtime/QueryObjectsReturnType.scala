package typingsSlinky.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryObjectsReturnType extends StObject {
  
  /**
    * Array with objects.
    */
  var objects: RemoteObject = js.native
}
object QueryObjectsReturnType {
  
  @scala.inline
  def apply(objects: RemoteObject): QueryObjectsReturnType = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsReturnType]
  }
  
  @scala.inline
  implicit class QueryObjectsReturnTypeMutableBuilder[Self <: QueryObjectsReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjects(value: RemoteObject): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
  }
}
