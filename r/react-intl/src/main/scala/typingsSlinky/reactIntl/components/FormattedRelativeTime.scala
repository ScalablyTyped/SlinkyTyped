package typingsSlinky.reactIntl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.formatjsIntlRelativetimeformat.mod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedRelativeTime
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactIntl.mod.FormattedRelativeTime] {
  @JSImport("react-intl", "FormattedRelativeTime")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    format: String = null,
    unit: Unit = null,
    updateIntervalInSeconds: Int | Double = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactIntl.mod.FormattedRelativeTime] = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (updateIntervalInSeconds != null) __obj.updateDynamic("updateIntervalInSeconds")(updateIntervalInSeconds.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactIntl.mod.FormattedRelativeTime] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactIntl.mod.FormattedRelativeTime](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactIntl.mod.Props
}

