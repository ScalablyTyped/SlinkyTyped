package typingsSlinky.formsyReact.components

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.formsyReact.formsyMod.FormsyProps
import typingsSlinky.formsyReact.interfacesMod.IModel
import typingsSlinky.formsyReact.interfacesMod.IResetModel
import typingsSlinky.formsyReact.interfacesMod.IUpdateInputsWithError
import typingsSlinky.formsyReact.mod.default
import typingsSlinky.react.mod.FormHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormsyReact {
  
  @JSImport("formsy-react", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FormsyProps): SharedBuilder_FormsyProps1359109082[default] = new SharedBuilder_FormsyProps1359109082[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    disabled: Boolean,
    onChange: (IModel, Boolean) => Unit,
    onInvalid: () => Unit,
    onInvalidSubmit: (/* model */ IModel, /* resetModel */ IResetModel, /* updateInputsWithError */ IUpdateInputsWithError, /* event */ SyntheticEvent[Event, FormHTMLAttributes[js.Any]]) => Unit,
    onValid: () => Unit
  ): SharedBuilder_FormsyProps1359109082[default] = {
    val __props = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange), onInvalid = js.Any.fromFunction0(onInvalid), onInvalidSubmit = js.Any.fromFunction4(onInvalidSubmit), onValid = js.Any.fromFunction0(onValid))
    new SharedBuilder_FormsyProps1359109082[default](js.Array(this.component, __props.asInstanceOf[FormsyProps]))
  }
}
