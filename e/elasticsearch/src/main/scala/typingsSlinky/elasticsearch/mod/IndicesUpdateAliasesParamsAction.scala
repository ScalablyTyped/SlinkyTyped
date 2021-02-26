package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.anon.Alias
import typingsSlinky.elasticsearch.anon.IndexString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesUpdateAliasesParamsAction extends StObject {
  
  var add: js.UndefOr[Alias] = js.native
  
  var remove: js.UndefOr[typingsSlinky.elasticsearch.anon.Indices] = js.native
  
  var remove_index: js.UndefOr[IndexString] = js.native
}
object IndicesUpdateAliasesParamsAction {
  
  @scala.inline
  def apply(): IndicesUpdateAliasesParamsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesParamsAction]
  }
  
  @scala.inline
  implicit class IndicesUpdateAliasesParamsActionMutableBuilder[Self <: IndicesUpdateAliasesParamsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Alias): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setRemove(value: typingsSlinky.elasticsearch.anon.Indices): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setRemove_index(value: IndexString): Self = StObject.set(x, "remove_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove_indexUndefined: Self = StObject.set(x, "remove_index", js.undefined)
  }
}
