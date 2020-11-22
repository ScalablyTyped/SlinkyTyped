package typingsSlinky.reactDates.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseButtonAriaLabel extends js.Object {
  
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
  implicit class CloseButtonAriaLabelOps[Self <: CloseButtonAriaLabel] (val x: Self) extends AnyVal {
    
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
    def setCloseButtonAriaLabel(value: String): Self = this.set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardShortcutsVarargs(value: Recordunicodelabelactions*): Self = this.set("keyboardShortcuts", js.Array(value :_*))
    
    @scala.inline
    def setKeyboardShortcuts(value: js.Array[Recordunicodelabelactions]): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseButtonClick(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onCloseButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
