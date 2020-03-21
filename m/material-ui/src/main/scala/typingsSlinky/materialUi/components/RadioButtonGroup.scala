package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.Switches.RadioButtonGroupProps
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.materialUi.radioButtonGroupMod.default
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioButtonGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/RadioButton/RadioButtonGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    name: String,
    defaultSelected: js.Any = null,
    labelPosition: left | right = null,
    onChange: (SyntheticEvent[EventTarget with js.Object, Event_], /* selected */ String) => Unit = null,
    valueSelected: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (valueSelected != null) __obj.updateDynamic("valueSelected")(valueSelected.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RadioButtonGroupProps
}

