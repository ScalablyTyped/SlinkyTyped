package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Switches.RadioButtonGroupProps
import typingsSlinky.materialDashUi.materialDashUiStrings.left
import typingsSlinky.materialDashUi.materialDashUiStrings.right
import typingsSlinky.materialDashUi.radioButtonRadioButtonGroupMod.default
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioButtonGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/RadioButton/RadioButtonGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, name */
  def apply(
    defaultSelected: js.Any = null,
    labelPosition: left | right = null,
    onChange: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit = null,
    style: CSSProperties = null,
    valueSelected: js.Any = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (valueSelected != null) __obj.updateDynamic("valueSelected")(valueSelected.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RadioButtonGroupProps
}

