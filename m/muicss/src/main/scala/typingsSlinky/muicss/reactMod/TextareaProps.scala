package typingsSlinky.muicss.reactMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.TextareaHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextareaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  
  var floatingLabel: js.UndefOr[Boolean] = js.native
  
  var hint: js.UndefOr[String] = js.native
  
  var inputRef: js.UndefOr[Ref[HTMLTextAreaElement]] = js.native
  
  var invalid: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[ReactElement] = js.native
  
  var onLabelClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
}
object TextareaProps {
  
  @scala.inline
  def apply(): TextareaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaProps]
  }
  
  @scala.inline
  implicit class TextareaPropsMutableBuilder[Self <: TextareaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloatingLabel(value: Boolean): Self = StObject.set(x, "floatingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelUndefined: Self = StObject.set(x, "floatingLabel", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setInputRef(value: Ref[HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLTextAreaElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    @scala.inline
    def setInputRefRefObject(value: ReactRef[HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    @scala.inline
    def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOnLabelClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onLabelClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLabelClickUndefined: Self = StObject.set(x, "onLabelClick", js.undefined)
  }
}
