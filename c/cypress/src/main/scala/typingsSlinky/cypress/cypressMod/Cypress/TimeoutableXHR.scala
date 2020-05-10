package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that control how long the Test Runner waits for an XHR request and response to succeed
  */
@js.native
trait TimeoutableXHR extends js.Object {
  /**
    * Time to wait for the request (ms)
    *
    * @default {@link Timeoutable#timeout}
    * @see https://docs.cypress.io/guides/references/configuration.html#Timeouts
    */
  var requestTimeout: Double = js.native
  /**
    * Time to wait for the response (ms)
    *
    * @default {@link Timeoutable#timeout}
    * @see https://docs.cypress.io/guides/references/configuration.html#Timeouts
    */
  var responseTimeout: Double = js.native
}

object TimeoutableXHR {
  @scala.inline
  def apply(requestTimeout: Double, responseTimeout: Double): TimeoutableXHR = {
    val __obj = js.Dynamic.literal(requestTimeout = requestTimeout.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutableXHR]
  }
  @scala.inline
  implicit class TimeoutableXHROps[Self <: TimeoutableXHR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

