package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.monacoEditorStrings.always
import typingsSlinky.monacoEditor.monacoEditorStrings.multiline
import typingsSlinky.monacoEditor.monacoEditorStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorFindOptions>> */
@js.native
trait EditorFindOptions extends js.Object {
  
  val addExtraSpaceOnTop: Boolean = js.native
  
  val autoFindInSelection: never | always | multiline = js.native
  
  val cursorMoveOnType: Boolean = js.native
  
  val loop: Boolean = js.native
  
  val seedSearchStringFromSelection: Boolean = js.native
}
object EditorFindOptions {
  
  @scala.inline
  def apply(
    addExtraSpaceOnTop: Boolean,
    autoFindInSelection: never | always | multiline,
    cursorMoveOnType: Boolean,
    loop: Boolean,
    seedSearchStringFromSelection: Boolean
  ): EditorFindOptions = {
    val __obj = js.Dynamic.literal(addExtraSpaceOnTop = addExtraSpaceOnTop.asInstanceOf[js.Any], autoFindInSelection = autoFindInSelection.asInstanceOf[js.Any], cursorMoveOnType = cursorMoveOnType.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], seedSearchStringFromSelection = seedSearchStringFromSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorFindOptions]
  }
  
  @scala.inline
  implicit class EditorFindOptionsOps[Self <: EditorFindOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddExtraSpaceOnTop(value: Boolean): Self = this.set("addExtraSpaceOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFindInSelection(value: never | always | multiline): Self = this.set("autoFindInSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorMoveOnType(value: Boolean): Self = this.set("cursorMoveOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedSearchStringFromSelection(value: Boolean): Self = this.set("seedSearchStringFromSelection", value.asInstanceOf[js.Any])
  }
}
