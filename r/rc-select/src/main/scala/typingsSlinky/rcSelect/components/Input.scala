package typingsSlinky.rcSelect.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.textarea.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcSelect.inputMod.InputProps
import typingsSlinky.rcSelect.inputMod.InputRef
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @scala.inline
  def apply(
    accessibilityIndex: Double,
    attrs: js.Object,
    autoComplete: String,
    autoFocus: Boolean,
    disabled: Boolean,
    editable: Boolean,
    id: String,
    inputElement: ReactElement,
    onChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    onCompositionEnd: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    onCompositionStart: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    onKeyDown: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    onMouseDown: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    onPaste: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    open: Boolean,
    prefixCls: String,
    tabIndex: Double,
    value: String
  ): Default[tag.type, InputRef with js.Object] = {
    val __props = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onCompositionEnd = js.Any.fromFunction1(onCompositionEnd), onCompositionStart = js.Any.fromFunction1(onCompositionStart), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onPaste = js.Any.fromFunction1(onPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Default[tag.type, InputRef with js.Object](js.Array(this.component, __props.asInstanceOf[InputProps with RefAttributes[InputRef]]))
  }
  
  @JSImport("rc-select/lib/Selector/Input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: InputProps with RefAttributes[InputRef]): Default[tag.type, InputRef with js.Object] = new Default[tag.type, InputRef with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
