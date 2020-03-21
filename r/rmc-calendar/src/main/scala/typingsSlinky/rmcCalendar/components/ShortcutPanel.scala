package typingsSlinky.rmcCalendar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.shortcutPanelMod.PropsType
import typingsSlinky.rmcCalendar.shortcutPanelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShortcutPanel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rmc-calendar/lib/calendar/ShortcutPanel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    locale: Locale,
    onSelect: (js.UndefOr[js.Date], js.UndefOr[js.Date]) => Unit,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2(onSelect))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropsType
}

