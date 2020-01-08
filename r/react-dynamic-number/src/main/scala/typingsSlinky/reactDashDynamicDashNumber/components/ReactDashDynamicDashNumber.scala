package typingsSlinky.reactDashDynamicDashNumber.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberMod.DynamicNumberProps
import typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberMod.default
import typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.Comma
import typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.Dot
import typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.Space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashDynamicDashNumber
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-dynamic-number", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: placeholder, value */
  def apply(
    fraction: Int | Double = null,
    integer: Int | Double = null,
    negative: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ ChangeEvent[HTMLInputElement], /* modelValue */ Double, /* viewValue */ String) => Unit = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    separator: Dot | Comma = null,
    thousand: Boolean | Space = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (fraction != null) __obj.updateDynamic("fraction")(fraction.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashDynamicDashNumber.reactDashDynamicDashNumberMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DynamicNumberProps
}

