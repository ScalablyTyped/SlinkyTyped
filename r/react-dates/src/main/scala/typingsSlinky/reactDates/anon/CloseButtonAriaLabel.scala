package typingsSlinky.reactDates.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseButtonAriaLabel extends StObject {
  
  var closeButtonAriaLabel: String = js.native
  
  var keyboardShortcuts: js.Array[Recordunicodelabelactions] = js.native
  
  var onCloseButtonClick: MouseEventHandler[Element] = js.native
  
  var onKeyDown: KeyboardEventHandler[Element] = js.native
  
  var title: String = js.native
}
object CloseButtonAriaLabel {
  
  @scala.inline
  def apply(
    closeButtonAriaLabel: String,
    keyboardShortcuts: js.Array[Recordunicodelabelactions],
    onCloseButtonClick: SyntheticMouseEvent[Element] => Unit,
    onKeyDown: SyntheticKeyboardEvent[Element] => Unit,
    title: String
  ): CloseButtonAriaLabel = {
    val __obj = js.Dynamic.literal(closeButtonAriaLabel = closeButtonAriaLabel.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], onCloseButtonClick = js.Any.fromFunction1(onCloseButtonClick), onKeyDown = js.Any.fromFunction1(onKeyDown), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseButtonAriaLabel]
  }
  
  @scala.inline
  implicit class CloseButtonAriaLabelMutableBuilder[Self <: CloseButtonAriaLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardShortcuts(value: js.Array[Recordunicodelabelactions]): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardShortcutsVarargs(value: Recordunicodelabelactions*): Self = StObject.set(x, "keyboardShortcuts", js.Array(value :_*))
    
    @scala.inline
    def setOnCloseButtonClick(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
