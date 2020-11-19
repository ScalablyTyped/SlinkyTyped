package typingsSlinky.reactAutosuggest.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<any> ]: P} & {[ P in 'onChange' | 'onBlur' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<any>] ]: react.react.InputHTMLAttributes<any>[P]} */ @js.native
trait InputProps[TSuggestion] extends js.Object {
  
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ SyntheticFocusEvent[_], 
      /* params */ js.UndefOr[BlurEvent[TSuggestion]], 
      Unit
    ]
  ] = js.native
  
  def onChange(event: SyntheticEvent[EventTarget, Event], params: ChangeEvent): Unit = js.native
  
  var value: String = js.native
}
object InputProps {
  
  @scala.inline
  def apply[TSuggestion](onChange: (SyntheticEvent[EventTarget, Event], ChangeEvent) => Unit, value: String): InputProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[TSuggestion]]
  }
  
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps[_], TSuggestion] (val x: Self with InputProps[TSuggestion]) extends AnyVal {
    
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
    def setOnChange(value: (SyntheticEvent[EventTarget, Event], ChangeEvent) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(
      value: (/* event */ SyntheticFocusEvent[_], /* params */ js.UndefOr[BlurEvent[TSuggestion]]) => Unit
    ): Self = this.set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
  }
}
