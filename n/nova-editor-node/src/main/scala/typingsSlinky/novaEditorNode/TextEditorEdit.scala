package typingsSlinky.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/text-editor-edit/
@js.native
trait TextEditorEdit extends StObject {
  
  def delete(range: Range): Unit = js.native
  
  def insert(position: Double, text: String): Unit = js.native
  
  def replace(range: Range, text: String): Unit = js.native
}
object TextEditorEdit {
  
  @scala.inline
  def apply(delete: Range => Unit, insert: (Double, String) => Unit, replace: (Range, String) => Unit): TextEditorEdit = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction2(insert), replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[TextEditorEdit]
  }
  
  @scala.inline
  implicit class TextEditorEditMutableBuilder[Self <: TextEditorEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: Range => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: (Double, String) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace(value: (Range, String) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
  }
}
