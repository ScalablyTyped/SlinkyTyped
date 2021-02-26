package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IRange
import typingsSlinky.monacoEditor.mod.editor.EndOfLineSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEdit extends StObject {
  
  var eol: js.UndefOr[EndOfLineSequence] = js.native
  
  var range: IRange = js.native
  
  var text: String = js.native
}
object TextEdit {
  
  @scala.inline
  def apply(range: IRange, text: String): TextEdit = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEdit]
  }
  
  @scala.inline
  implicit class TextEditMutableBuilder[Self <: TextEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEol(value: EndOfLineSequence): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
