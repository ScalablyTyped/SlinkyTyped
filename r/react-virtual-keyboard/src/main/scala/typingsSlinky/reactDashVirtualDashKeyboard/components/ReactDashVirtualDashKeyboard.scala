package typingsSlinky.reactDashVirtualDashKeyboard.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashVirtualDashKeyboard.reactDashVirtualDashKeyboardMod.KeyboardProps
import typingsSlinky.reactDashVirtualDashKeyboard.reactDashVirtualDashKeyboardMod.ReactKeyboardOptions
import typingsSlinky.reactDashVirtualDashKeyboard.reactDashVirtualDashKeyboardMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashVirtualDashKeyboard
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-virtual-keyboard", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name, placeholder */
  def apply(
    callbackParent: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => Unit = null,
    onAccepted: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => Unit = null,
    onChange: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => Unit = null,
    options: ReactKeyboardOptions = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (callbackParent != null) __obj.updateDynamic("callbackParent")(js.Any.fromFunction3(callbackParent))
    if (onAccepted != null) __obj.updateDynamic("onAccepted")(js.Any.fromFunction3(onAccepted))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = KeyboardProps
}

