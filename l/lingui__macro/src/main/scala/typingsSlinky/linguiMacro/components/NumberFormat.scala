package typingsSlinky.linguiMacro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NumberFormat
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.linguiMacro.mod.NumberFormat] {
  @JSImport("@lingui/macro", "NumberFormat")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    value: Double,
    description: String = null,
    format: NumberFormatOptions = null,
    render: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.linguiMacro.mod.NumberFormat] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormatPropsWithoutI18n[Double, NumberFormatOptions]
}

