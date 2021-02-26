package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSymbol extends StObject {
  
  var children: js.UndefOr[js.Array[DocumentSymbol]] = js.native
  
  var containerName: js.UndefOr[String] = js.native
  
  var detail: String = js.native
  
  var kind: SymbolKind = js.native
  
  var name: String = js.native
  
  var range: IRange = js.native
  
  var selectionRange: IRange = js.native
  
  var tags: js.Array[SymbolTag] = js.native
}
object DocumentSymbol {
  
  @scala.inline
  def apply(
    detail: String,
    kind: SymbolKind,
    name: String,
    range: IRange,
    selectionRange: IRange,
    tags: js.Array[SymbolTag]
  ): DocumentSymbol = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selectionRange = selectionRange.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbol]
  }
  
  @scala.inline
  implicit class DocumentSymbolMutableBuilder[Self <: DocumentSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[DocumentSymbol]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: DocumentSymbol*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRange(value: IRange): Self = StObject.set(x, "selectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[SymbolTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: SymbolTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
