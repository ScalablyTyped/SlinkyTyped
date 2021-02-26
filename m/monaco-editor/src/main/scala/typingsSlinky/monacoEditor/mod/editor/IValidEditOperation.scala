package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidEditOperation extends StObject {
  
  /**
    * The range to replace. This can be empty to emulate a simple insert.
    */
  var range: Range = js.native
  
  /**
    * The text to replace with. This can be empty to emulate a simple delete.
    */
  var text: String = js.native
}
object IValidEditOperation {
  
  @scala.inline
  def apply(range: Range, text: String): IValidEditOperation = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidEditOperation]
  }
  
  @scala.inline
  implicit class IValidEditOperationMutableBuilder[Self <: IValidEditOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
