package typingsSlinky.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathItemObject extends StObject {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  var del: js.UndefOr[OperationObject] = js.native
  
  var delete: js.UndefOr[OperationObject] = js.native
  
  var get: js.UndefOr[OperationObject] = js.native
  
  var head: js.UndefOr[OperationObject] = js.native
  
  var options: js.UndefOr[OperationObject] = js.native
  
  var parameters: js.UndefOr[Parameters] = js.native
  
  var patch: js.UndefOr[OperationObject] = js.native
  
  var post: js.UndefOr[OperationObject] = js.native
  
  var put: js.UndefOr[OperationObject] = js.native
}
object PathItemObject {
  
  @scala.inline
  def apply(): PathItemObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathItemObject]
  }
  
  @scala.inline
  implicit class PathItemObjectMutableBuilder[Self <: PathItemObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    @scala.inline
    def setDel(value: OperationObject): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
    
    @scala.inline
    def setDelete(value: OperationObject): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setGet(value: OperationObject): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setHead(value: OperationObject): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    @scala.inline
    def setOptions(value: OperationObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: (ReferenceObject | Parameter)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setPatch(value: OperationObject): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    @scala.inline
    def setPost(value: OperationObject): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPut(value: OperationObject): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
  }
}
