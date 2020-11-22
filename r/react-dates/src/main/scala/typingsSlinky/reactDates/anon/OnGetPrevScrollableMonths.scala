package typingsSlinky.reactDates.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactDates.reactDatesStrings.verticalScrollable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGetPrevScrollableMonths extends js.Object {
  
  var onGetNextScrollableMonths: js.UndefOr[
    js.Function1[
      /* event */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  
   // VERTICAL_SCROLLABLE daypickers only
  var onGetPrevScrollableMonths: js.UndefOr[
    js.Function1[
      /* event */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  
  var orientation: verticalScrollable = js.native
}
object OnGetPrevScrollableMonths {
  
  @scala.inline
  def apply(orientation: verticalScrollable): OnGetPrevScrollableMonths = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGetPrevScrollableMonths]
  }
  
  @scala.inline
  implicit class OnGetPrevScrollableMonthsOps[Self <: OnGetPrevScrollableMonths] (val x: Self) extends AnyVal {
    
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
    def setOrientation(value: verticalScrollable): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGetNextScrollableMonths(
      value: /* event */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]] => Unit
    ): Self = this.set("onGetNextScrollableMonths", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGetNextScrollableMonths: Self = this.set("onGetNextScrollableMonths", js.undefined)
    
    @scala.inline
    def setOnGetPrevScrollableMonths(
      value: /* event */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]] => Unit
    ): Self = this.set("onGetPrevScrollableMonths", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGetPrevScrollableMonths: Self = this.set("onGetPrevScrollableMonths", js.undefined)
  }
}
