package typingsSlinky.jqueryMousewheel

import typingsSlinky.jqueryMousewheel.JQueryMousewheel.JQueryMousewheelEventObject
import typingsSlinky.jqueryMousewheel.jqueryMousewheelStrings.mousewheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
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
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMousewheel(
      value: js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _] => JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousewheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn(
      value: (mousewheel, js.Function2[/* eventObject */ JQueryMousewheelEventObject, /* repeated */ js.Any, _]) => JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnmousewheel(value: () => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmousewheel")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

