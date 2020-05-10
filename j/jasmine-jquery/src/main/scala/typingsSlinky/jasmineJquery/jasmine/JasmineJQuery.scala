package typingsSlinky.jasmineJquery.jasmine

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineJQuery extends js.Object {
  var events: JasmineJQueryEvents = js.native
  var matchersClass: js.Any = js.native
  def browserTagCaseIndependentHtml(html: String): String = js.native
  def elementToString(element: JQuery_[HTMLElement]): String = js.native
}

object JasmineJQuery {
  @scala.inline
  def apply(
    browserTagCaseIndependentHtml: String => String,
    elementToString: JQuery_[HTMLElement] => String,
    events: JasmineJQueryEvents,
    matchersClass: js.Any
  ): JasmineJQuery = {
    val __obj = js.Dynamic.literal(browserTagCaseIndependentHtml = js.Any.fromFunction1(browserTagCaseIndependentHtml), elementToString = js.Any.fromFunction1(elementToString), events = events.asInstanceOf[js.Any], matchersClass = matchersClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineJQuery]
  }
  @scala.inline
  implicit class JasmineJQueryOps[Self <: JasmineJQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserTagCaseIndependentHtml(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserTagCaseIndependentHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElementToString(value: JQuery_[HTMLElement] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementToString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvents(value: JasmineJQueryEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchersClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchersClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

