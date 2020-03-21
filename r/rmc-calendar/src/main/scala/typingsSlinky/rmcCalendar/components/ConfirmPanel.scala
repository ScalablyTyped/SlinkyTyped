package typingsSlinky.rmcCalendar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rmcCalendar.confirmPanelMod.ConfirmPanelPropsType
import typingsSlinky.rmcCalendar.confirmPanelMod.default
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.rmcCalendarStrings.one
import typingsSlinky.rmcCalendar.rmcCalendarStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfirmPanel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rmc-calendar/lib/calendar/ConfirmPanel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    locale: Locale,
    onConfirm: () => Unit,
    disableBtn: js.UndefOr[Boolean] = js.undefined,
    endDateTime: js.Date = null,
    formatStr: String = null,
    onlyConfirm: js.UndefOr[Boolean] = js.undefined,
    startDateTime: js.Date = null,
    `type`: one | range = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onConfirm = js.Any.fromFunction0(onConfirm))
    if (!js.isUndefined(disableBtn)) __obj.updateDynamic("disableBtn")(disableBtn.asInstanceOf[js.Any])
    if (endDateTime != null) __obj.updateDynamic("endDateTime")(endDateTime.asInstanceOf[js.Any])
    if (formatStr != null) __obj.updateDynamic("formatStr")(formatStr.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyConfirm)) __obj.updateDynamic("onlyConfirm")(onlyConfirm.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConfirmPanelPropsType
}

