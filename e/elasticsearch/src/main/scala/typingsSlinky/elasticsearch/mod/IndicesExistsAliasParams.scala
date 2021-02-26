package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesExistsAliasParams extends IndicesExistsParams {
  
  var name: NameList = js.native
}
object IndicesExistsAliasParams {
  
  @scala.inline
  def apply(index: NameList, name: NameList): IndicesExistsAliasParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesExistsAliasParams]
  }
  
  @scala.inline
  implicit class IndicesExistsAliasParamsMutableBuilder[Self <: IndicesExistsAliasParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameList): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
