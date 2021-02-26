package typingsSlinky.reactDates.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactDates.reactDatesStrings.verticalScrollable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGetPrevScrollableMonths extends StObject {
  
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
  implicit class OnGetPrevScrollableMonthsMutableBuilder[Self <: OnGetPrevScrollableMonths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnGetNextScrollableMonths(
      value: /* event */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]] => Unit
    ): Self = StObject.set(x, "onGetNextScrollableMonths", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGetNextScrollableMonthsUndefined: Self = StObject.set(x, "onGetNextScrollableMonths", js.undefined)
    
    @scala.inline
    def setOnGetPrevScrollableMonths(
      value: /* event */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]] => Unit
    ): Self = StObject.set(x, "onGetPrevScrollableMonths", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGetPrevScrollableMonthsUndefined: Self = StObject.set(x, "onGetPrevScrollableMonths", js.undefined)
    
    @scala.inline
    def setOrientation(value: verticalScrollable): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
