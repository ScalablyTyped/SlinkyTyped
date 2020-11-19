package typingsSlinky.reactCalendarTimeline.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactCalendarTimeline.mod.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<react-calendar-timeline.react-calendar-timeline.GetIntervalProps> & {  key :string | number} */
@js.native
trait RequiredGetIntervalPropsk extends js.Object {
  
  var interval: Interval = js.native
  
  var key: String | Double = js.native
  
  var onClick: MouseEventHandler[Element] = js.native
  
  var style: CSSProperties = js.native
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
  
  @scala.inline
  implicit class RequiredGetIntervalPropskOps[Self <: RequiredGetIntervalPropsk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
