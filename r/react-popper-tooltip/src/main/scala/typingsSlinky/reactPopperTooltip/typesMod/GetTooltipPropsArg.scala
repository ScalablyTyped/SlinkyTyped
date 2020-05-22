package typingsSlinky.reactPopperTooltip.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTooltipPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GetTooltipPropsArg {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    onMouseEnter: /* event */ SyntheticEvent[Event, Element] => Unit = null,
    onMouseLeave: /* event */ SyntheticEvent[Event, Element] => Unit = null,
    style: CSSProperties = null
  ): GetTooltipPropsArg = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTooltipPropsArg]
  }
}

