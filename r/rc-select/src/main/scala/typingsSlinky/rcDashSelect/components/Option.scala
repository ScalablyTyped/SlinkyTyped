package typingsSlinky.rcDashSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashSelect.rcDashSelectMod.RcSelect.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Option
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rcDashSelect.rcDashSelectMod.Option] {
  @JSImport("rc-select", "Option")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(title: String = null, value: String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.rcDashSelect.rcDashSelectMod.Option] = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.rcDashSelect.rcDashSelectMod.Option] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcDashSelect.rcDashSelectMod.Option](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = OptionProps
}

