package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.input.tag
import typingsSlinky.blueprintjsCore.propsMod.IOptionProps
import typingsSlinky.blueprintjsCore.radioGroupMod.IRadioGroupProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.RadioGroup] {
  @JSImport("@blueprintjs/core", "RadioGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, name */
  def apply(
    onChange: SyntheticEvent[EventTarget with HTMLInputElement, Event_] => Unit,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    options: js.Array[IOptionProps] = null,
    selectedValue: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.RadioGroup] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IRadioGroupProps
}

