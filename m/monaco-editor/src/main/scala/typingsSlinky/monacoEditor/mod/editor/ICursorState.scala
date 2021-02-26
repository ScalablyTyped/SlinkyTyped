package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICursorState extends StObject {
  
  var inSelectionMode: Boolean = js.native
  
  var position: IPosition = js.native
  
  var selectionStart: IPosition = js.native
}
object ICursorState {
  
  @scala.inline
  def apply(inSelectionMode: Boolean, position: IPosition, selectionStart: IPosition): ICursorState = {
    val __obj = js.Dynamic.literal(inSelectionMode = inSelectionMode.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorState]
  }
  
  @scala.inline
  implicit class ICursorStateMutableBuilder[Self <: ICursorState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInSelectionMode(value: Boolean): Self = StObject.set(x, "inSelectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStart(value: IPosition): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
  }
}
