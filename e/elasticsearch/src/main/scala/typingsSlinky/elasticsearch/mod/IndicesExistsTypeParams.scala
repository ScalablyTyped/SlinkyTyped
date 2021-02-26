package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesExistsTypeParams extends IndicesExistsParams {
  
  var `type`: NameList = js.native
}
object IndicesExistsTypeParams {
  
  @scala.inline
  def apply(index: NameList, `type`: NameList): IndicesExistsTypeParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesExistsTypeParams]
  }
  
  @scala.inline
  implicit class IndicesExistsTypeParamsMutableBuilder[Self <: IndicesExistsTypeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NameList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
