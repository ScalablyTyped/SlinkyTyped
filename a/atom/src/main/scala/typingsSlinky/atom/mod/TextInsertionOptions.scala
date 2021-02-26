package typingsSlinky.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInsertionOptions extends TextEditOptions {
  
  /**
    *  If true, decreases indent level appropriately (for example, when a closing
    *  bracket is inserted).
    */
  var autoDecreaseIndent: js.UndefOr[Boolean] = js.native
  
  /** If true, indents all inserted text appropriately. */
  var autoIndent: js.UndefOr[Boolean] = js.native
  
  /** If true, indent newline appropriately. */
  var autoIndentNewline: js.UndefOr[Boolean] = js.native
  
  /**
    *  By default, when pasting multiple lines, Atom attempts to preserve the relative
    *  indent level between the first line and trailing lines, even if the indent
    *  level of the first line has changed from the copied text. If this option is
    *  true, this behavior is suppressed.
    */
  var preserveTrailingLineIndentation: js.UndefOr[Boolean] = js.native
  
  /** If true, selects the newly added text. */
  var select: js.UndefOr[Boolean] = js.native
}
object TextInsertionOptions {
  
  @scala.inline
  def apply(): TextInsertionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInsertionOptions]
  }
  
  @scala.inline
  implicit class TextInsertionOptionsMutableBuilder[Self <: TextInsertionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDecreaseIndent(value: Boolean): Self = StObject.set(x, "autoDecreaseIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDecreaseIndentUndefined: Self = StObject.set(x, "autoDecreaseIndent", js.undefined)
    
    @scala.inline
    def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIndentNewline(value: Boolean): Self = StObject.set(x, "autoIndentNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIndentNewlineUndefined: Self = StObject.set(x, "autoIndentNewline", js.undefined)
    
    @scala.inline
    def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    @scala.inline
    def setPreserveTrailingLineIndentation(value: Boolean): Self = StObject.set(x, "preserveTrailingLineIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveTrailingLineIndentationUndefined: Self = StObject.set(x, "preserveTrailingLineIndentation", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
