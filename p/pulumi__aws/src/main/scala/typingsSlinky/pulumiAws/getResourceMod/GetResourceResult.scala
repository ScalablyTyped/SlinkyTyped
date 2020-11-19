package typingsSlinky.pulumiAws.getResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceResult extends js.Object {
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Set to the ID of the parent Resource.
    */
  val parentId: String = js.native
  
  val path: String = js.native
  
  /**
    * Set to the path relative to the parent Resource.
    */
  val pathPart: String = js.native
  
  val restApiId: String = js.native
}
object GetResourceResult {
  
  @scala.inline
  def apply(id: String, parentId: String, path: String, pathPart: String, restApiId: String): GetResourceResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceResult]
  }
  
  @scala.inline
  implicit class GetResourceResultOps[Self <: GetResourceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathPart(value: String): Self = this.set("pathPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
  }
}
