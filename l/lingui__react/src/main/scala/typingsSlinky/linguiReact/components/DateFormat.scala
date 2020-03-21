package typingsSlinky.linguiReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.linguiReact.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateFormat
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.linguiReact.mod.DateFormat] {
  @JSImport("@lingui/react", "DateFormat")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    value: js.Date,
    format: DateTimeFormatOptions = null,
    render: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.linguiReact.mod.DateFormat] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]
}

