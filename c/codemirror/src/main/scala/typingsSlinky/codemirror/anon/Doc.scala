package typingsSlinky.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Doc extends StObject {
  
  var changed: To | Null = js.native
  
  var doc: typingsSlinky.codemirror.mod.Doc = js.native
  
  var name: String = js.native
}
object Doc {
  
  @scala.inline
  def apply(doc: typingsSlinky.codemirror.mod.Doc, name: String): Doc = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc]
  }
  
  @scala.inline
  implicit class DocMutableBuilder[Self <: Doc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: To): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedNull: Self = StObject.set(x, "changed", null)
    
    @scala.inline
    def setDoc(value: typingsSlinky.codemirror.mod.Doc): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
