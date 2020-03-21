package typingsSlinky.reactCalendarTimeline

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactCalendarTimeline.mod.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<react-calendar-timeline.react-calendar-timeline.GetIntervalProps> & {  key  :string | number} */
trait RequiredGetIntervalPropsk extends js.Object {
  var interval: Interval
  var key: String | Double
  var onClick: MouseEventHandler[Element]
  var style: CSSProperties
}

object RequiredGetIntervalPropsk {
  @scala.inline
  def apply(
    interval: Interval,
    key: String | Double,
    onClick: SyntheticMouseEvent[Element] => Unit,
    style: CSSProperties
  ): RequiredGetIntervalPropsk = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredGetIntervalPropsk]
  }
}

