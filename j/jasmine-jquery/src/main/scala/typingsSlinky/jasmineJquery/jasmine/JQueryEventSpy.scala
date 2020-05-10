package typingsSlinky.jasmineJquery.jasmine

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryEventSpy extends js.Object {
  var eventName: String = js.native
  var selector: String = js.native
  def handler(eventObject: JQueryEventObject): js.Any = js.native
  def reset(): js.Any = js.native
}

object JQueryEventSpy {
  @scala.inline
  def apply(eventName: String, handler: JQueryEventObject => js.Any, reset: () => js.Any, selector: String): JQueryEventSpy = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), reset = js.Any.fromFunction0(reset), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryEventSpy]
  }
  @scala.inline
  implicit class JQueryEventSpyOps[Self <: JQueryEventSpy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandler(value: JQueryEventObject => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

