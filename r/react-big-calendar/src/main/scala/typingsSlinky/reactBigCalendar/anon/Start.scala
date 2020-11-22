package typingsSlinky.reactBigCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Start[TEvent /* <: js.Object */] extends js.Object {
  
  var end: js.UndefOr[js.Function1[/* event */ TEvent, js.Date]] = js.native
  
  var start: js.UndefOr[js.Function1[/* event */ TEvent, js.Date]] = js.native
  
  var title: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.native
  
  var tooltip: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.native
}
object Start {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): Start[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Start[TEvent]]
  }
  
  @scala.inline
  implicit class StartOps[Self <: Start[_], TEvent /* <: js.Object */] (val x: Self with Start[TEvent]) extends AnyVal {
    
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
    def setEnd(value: /* event */ TEvent => js.Date): Self = this.set("end", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: /* event */ TEvent => js.Date): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTitle(value: /* event */ TEvent => String): Self = this.set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTooltip(value: /* event */ TEvent => String): Self = this.set("tooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
