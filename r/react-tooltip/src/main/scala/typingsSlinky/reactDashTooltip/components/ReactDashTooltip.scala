package typingsSlinky.reactDashTooltip.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTooltip.Anon_Left
import typingsSlinky.reactDashTooltip.reactDashTooltipMod.Effect
import typingsSlinky.reactDashTooltip.reactDashTooltipMod.ElementEvents
import typingsSlinky.reactDashTooltip.reactDashTooltipMod.GetContent
import typingsSlinky.reactDashTooltip.reactDashTooltipMod.Offset
import typingsSlinky.reactDashTooltip.reactDashTooltipMod.Place
import typingsSlinky.reactDashTooltip.reactDashTooltipMod.SanitizeHtmlOptions
import typingsSlinky.reactDashTooltip.reactDashTooltipMod.Type
import typingsSlinky.reactDashTooltip.reactDashTooltipMod.WindowEvents
import typingsSlinky.reactDashTooltip.reactDashTooltipMod.^
import typingsSlinky.reactDashTooltip.reactDashTooltipStrings.div
import typingsSlinky.reactDashTooltip.reactDashTooltipStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashTooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-tooltip", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    afterHide: () => Unit = null,
    afterShow: () => Unit = null,
    border: js.UndefOr[Boolean] = js.undefined,
    `class`: String = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    delayHide: Int | Double = null,
    delayShow: Int | Double = null,
    delayUpdate: Int | Double = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    effect: Effect = null,
    event: ElementEvents = null,
    eventOff: ElementEvents = null,
    getContent: GetContent = null,
    globalEventOff: WindowEvents = null,
    html: js.UndefOr[Boolean] = js.undefined,
    insecure: js.UndefOr[Boolean] = js.undefined,
    isCapture: js.UndefOr[Boolean] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    offset: Offset = null,
    overridePosition: (/* position */ Anon_Left, /* currentEvent */ Event, /* currentTarget */ org.scalajs.dom.raw.Element, /* node */ js.Any, /* place */ Place, /* desiredPlace */ Place, /* effect */ Effect, /* offset */ Offset) => Anon_Left = null,
    place: Place = null,
    resizeHide: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    sanitizeHtmlOptions: SanitizeHtmlOptions = null,
    scrollHide: js.UndefOr[Boolean] = js.undefined,
    `type`: Type = null,
    watchWindow: js.UndefOr[Boolean] = js.undefined,
    wrapper: div | span = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (afterHide != null) __obj.updateDynamic("afterHide")(js.Any.fromFunction0(afterHide))
    if (afterShow != null) __obj.updateDynamic("afterShow")(js.Any.fromFunction0(afterShow))
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (delayHide != null) __obj.updateDynamic("delayHide")(delayHide.asInstanceOf[js.Any])
    if (delayShow != null) __obj.updateDynamic("delayShow")(delayShow.asInstanceOf[js.Any])
    if (delayUpdate != null) __obj.updateDynamic("delayUpdate")(delayUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventOff != null) __obj.updateDynamic("eventOff")(eventOff.asInstanceOf[js.Any])
    if (getContent != null) __obj.updateDynamic("getContent")(getContent.asInstanceOf[js.Any])
    if (globalEventOff != null) __obj.updateDynamic("globalEventOff")(globalEventOff.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(insecure)) __obj.updateDynamic("insecure")(insecure.asInstanceOf[js.Any])
    if (!js.isUndefined(isCapture)) __obj.updateDynamic("isCapture")(isCapture.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (overridePosition != null) __obj.updateDynamic("overridePosition")(js.Any.fromFunction8(overridePosition))
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeHide)) __obj.updateDynamic("resizeHide")(resizeHide.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sanitizeHtmlOptions != null) __obj.updateDynamic("sanitizeHtmlOptions")(sanitizeHtmlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHide)) __obj.updateDynamic("scrollHide")(scrollHide.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(watchWindow)) __obj.updateDynamic("watchWindow")(watchWindow.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashTooltip.reactDashTooltipMod.Props
}

