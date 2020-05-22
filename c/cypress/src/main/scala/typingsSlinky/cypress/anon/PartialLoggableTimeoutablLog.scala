package typingsSlinky.cypress.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.cypress.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.Loggable & cypress.cypress.Cypress.Timeoutable & cypress.cypress.Cypress.Withinable> */
trait PartialLoggableTimeoutablLog extends js.Object {
  var log: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var withinSubject: js.UndefOr[JQuery[HTMLElement] | HTMLElement] = js.undefined
}

object PartialLoggableTimeoutablLog {
  @scala.inline
  def apply(
    log: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    withinSubject: JQuery[HTMLElement] | HTMLElement = null
  ): PartialLoggableTimeoutablLog = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (withinSubject != null) __obj.updateDynamic("withinSubject")(withinSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutablLog]
  }
}

