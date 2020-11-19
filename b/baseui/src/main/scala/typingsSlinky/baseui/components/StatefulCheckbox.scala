package typingsSlinky.baseui.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.toggle
import typingsSlinky.baseui.baseuiStrings.toggle_round
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.checkboxMod.CheckboxOverrides
import typingsSlinky.baseui.checkboxMod.StatefulCheckboxProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulCheckbox {
  
  @JSImport("baseui/checkbox", "StatefulCheckbox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkmarkType(value: default_ | toggle | toggle_round): this.type = set("checkmarkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialState(value: typingsSlinky.baseui.checkboxMod.initialState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefRefObject(value: ReactRef[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    
    @scala.inline
    def isError(value: Boolean): this.type = set("isError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isIndeterminate(value: Boolean): this.type = set("isIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelPlacement(value: top | right | bottom | left): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: CheckboxOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulCheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StatefulCheckbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
