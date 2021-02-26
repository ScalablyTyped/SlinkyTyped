package typingsSlinky.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var id: ResourceId = js.native
}
object Resource {
  
  @scala.inline
  def apply(id: ResourceId): Resource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
