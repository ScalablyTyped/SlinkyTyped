package typingsSlinky.cypress

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Loggable & cypress.cypress.Cypress.Timeoutable & cypress.cypress.Cypress.Withinable> */
@js.native
trait PartialLoggableTimeoutablLog extends js.Object {
  var log: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var withinSubject: js.UndefOr[JQuery_[HTMLElement] | HTMLElement] = js.native
}

object PartialLoggableTimeoutablLog {
  @scala.inline
  def apply(): PartialLoggableTimeoutablLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLoggableTimeoutablLog]
  }
  @scala.inline
  implicit class PartialLoggableTimeoutablLogOps[Self <: PartialLoggableTimeoutablLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWithinSubjectHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithinSubject(value: JQuery_[HTMLElement] | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithinSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinSubject")(js.undefined)
        ret
    }
  }
  
}

