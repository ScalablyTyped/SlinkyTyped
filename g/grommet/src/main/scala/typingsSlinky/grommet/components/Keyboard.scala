package typingsSlinky.grommet.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.componentsKeyboardMod.KeyboardProps
import typingsSlinky.grommet.grommetStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Keyboard
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("grommet", "Keyboard")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onKeyDown */
  def apply(
    onBackspace: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onComma: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onDown: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onEnter: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onEsc: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onLeft: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onRight: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onShift: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onSpace: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onTab: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onUp: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    target: typingsSlinky.grommet.grommetStrings.component | document = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (onBackspace != null) __obj.updateDynamic("onBackspace")(js.Any.fromFunction1(onBackspace))
    if (onComma != null) __obj.updateDynamic("onComma")(js.Any.fromFunction1(onComma))
    if (onDown != null) __obj.updateDynamic("onDown")(js.Any.fromFunction1(onDown))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction1(onEsc))
    if (onLeft != null) __obj.updateDynamic("onLeft")(js.Any.fromFunction1(onLeft))
    if (onRight != null) __obj.updateDynamic("onRight")(js.Any.fromFunction1(onRight))
    if (onShift != null) __obj.updateDynamic("onShift")(js.Any.fromFunction1(onShift))
    if (onSpace != null) __obj.updateDynamic("onSpace")(js.Any.fromFunction1(onSpace))
    if (onTab != null) __obj.updateDynamic("onTab")(js.Any.fromFunction1(onTab))
    if (onUp != null) __obj.updateDynamic("onUp")(js.Any.fromFunction1(onUp))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = KeyboardProps
}

