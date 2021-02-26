package typingsSlinky.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor extends StObject {
  
  var editor: typingsSlinky.ace.AceAjax.Editor | GetText = js.native
  
  var elementPrefix: js.UndefOr[String] = js.native
  
  var ext: js.UndefOr[String] = js.native
  
  var fields: js.Array[String] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
}
object Editor {
  
  @scala.inline
  def apply(
    editor: typingsSlinky.ace.AceAjax.Editor | GetText,
    fields: js.Array[String],
    `type`: String,
    url: String
  ): Editor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  
  @scala.inline
  implicit class EditorMutableBuilder[Self <: Editor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditor(value: typingsSlinky.ace.AceAjax.Editor | GetText): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPrefix(value: String): Self = StObject.set(x, "elementPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPrefixUndefined: Self = StObject.set(x, "elementPrefix", js.undefined)
    
    @scala.inline
    def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
