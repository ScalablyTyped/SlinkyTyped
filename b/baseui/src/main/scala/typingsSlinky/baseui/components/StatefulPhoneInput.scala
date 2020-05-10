package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.phoneInputMod.PhoneInputOverrides
import typingsSlinky.baseui.phoneInputMod.State
import typingsSlinky.baseui.phoneInputMod.StateChange
import typingsSlinky.baseui.phoneInputMod.StatefulPhoneInputProps
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPhoneInput {
  @JSImport("baseui/phone-input", "StatefulPhoneInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def mapIsoToLabel(value: /* iso */ String => String): this.type = set("mapIsoToLabel", js.Any.fromFunction1(value))
    @scala.inline
    def onCountryChange(value: /* event */ OnChangeParams => _): this.type = set("onCountryChange", js.Any.fromFunction1(value))
    @scala.inline
    def onTextChange(value: /* event */ SyntheticEvent[Event_, HTMLInputElement] => _): this.type = set("onTextChange", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: PhoneInputOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def stateReducer(value: (/* type */ StateChange, /* nextState */ State, /* currentState */ State) => State): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulPhoneInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatefulPhoneInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

