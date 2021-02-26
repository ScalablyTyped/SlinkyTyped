package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderSearchTemplateParams extends GenericParams {
  
  var id: String = js.native
}
object RenderSearchTemplateParams {
  
  @scala.inline
  def apply(id: String): RenderSearchTemplateParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSearchTemplateParams]
  }
  
  @scala.inline
  implicit class RenderSearchTemplateParamsMutableBuilder[Self <: RenderSearchTemplateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
