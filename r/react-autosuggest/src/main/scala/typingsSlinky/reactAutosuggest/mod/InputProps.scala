package typingsSlinky.reactAutosuggest.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var value: String = js.native
  def onChange(event: SyntheticEvent[EventTarget, Event], params: ChangeEvent): Unit = js.native
}

object InputProps {
  @scala.inline
  def apply[TSuggestion](onChange: (SyntheticEvent[EventTarget, Event], ChangeEvent) => Unit, value: String): InputProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[TSuggestion]]
  }
  @scala.inline
  implicit class InputPropsOps[Self[tsuggestion] <: InputProps[tsuggestion], TSuggestion] (val x: Self[TSuggestion]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSuggestion] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSuggestion]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSuggestion] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSuggestion] with Other]
    @scala.inline
    def withOnChange(value: (SyntheticEvent[EventTarget, Event], ChangeEvent) => Unit): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValue(value: String): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBlur(
      value: (/* event */ SyntheticFocusEvent[_], /* params */ js.UndefOr[BlurEvent[TSuggestion]]) => Unit
    ): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
  }
  
}

