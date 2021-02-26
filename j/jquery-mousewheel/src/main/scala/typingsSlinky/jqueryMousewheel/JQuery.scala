package typingsSlinky.jqueryMousewheel

import typingsSlinky.jqueryMousewheel.JQueryMousewheel.JQueryMousewheelEventObject
import typingsSlinky.jqueryMousewheel.jqueryMousewheelStrings.mousewheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def mousewheel(handler: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]): JQuery = js.native
  
  @JSName("on")
  def on_mousewheel(
    event: mousewheel,
    handler: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  
  def unmousewheel(): JQuery = js.native
}
object JQuery {
  
  @scala.inline
  def apply(
    mousewheel: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _] => JQuery,
    on: (mousewheel, js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]) => JQuery,
    unmousewheel: () => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(mousewheel = js.Any.fromFunction1(mousewheel), on = js.Any.fromFunction2(on), unmousewheel = js.Any.fromFunction0(unmousewheel))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMousewheel(
      value: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _] => JQuery
    ): Self = StObject.set(x, "mousewheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(
      value: (mousewheel, js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]) => JQuery
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnmousewheel(value: () => JQuery): Self = StObject.set(x, "unmousewheel", js.Any.fromFunction0(value))
  }
}
