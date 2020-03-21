package typingsSlinky.formol.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.formol.AnonDictk
import typingsSlinky.formol.mod.SwitchButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwitchButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.formol.mod.SwitchButton] {
  @JSImport("formol", "SwitchButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, type */
  def apply(
    i18n: AnonDictk = null,
    leftLabel: TagMod[Any] = null,
    rightLabel: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.formol.mod.SwitchButton] = {
    val __obj = js.Dynamic.literal()
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel.asInstanceOf[js.Any])
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.formol.mod.SwitchButton] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.formol.mod.SwitchButton](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwitchButtonProps
}

