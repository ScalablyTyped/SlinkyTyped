package typingsSlinky.cypress.cypressMod.Cypress

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cypress.cypressStrings.GET
import typingsSlinky.cypress.cypressStrings.POST
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Visit website options
  *
  * @see https://on.cypress.io/visit
  */
@js.native
trait VisitOptions
  extends Loggable
     with Timeoutable
     with Failable {
  /**
    * Cypress will automatically apply the right authorization headers
    * if you’re attempting to visit an application that requires
    * Basic Authentication.
    *
    * @example
    *    cy.visit('https://www.acme.com/', {
    *      auth: {
    *        username: 'wile',
    *        password: 'coyote'
    *      }
    *    })
    */
  var auth: Auth = js.native
  /**
    * An optional body to send along with a `POST` request. If it is a string, it will be passed along unmodified. If it is an object, it will be URL encoded to a string and sent with a `Content-Type: application/x-www-urlencoded` header.
    *
    * @example
    *    cy.visit({
    *      url: 'http://www.example.com/form.html',
    *      method: 'POST',
    *      body: {
    *        "field1": "foo",
    *        "field2": "bar"
    *      }
    *    })
    */
  var body: RequestBody = js.native
  /**
    * An object that maps HTTP header names to values to be sent along with the request.
    *
    * @example
    *    cy.visit({
    *      url: 'http://www.example.com',
    *      headers: {
    *        'Accept-Language': 'en-US'
    *      }
    *    })
    */
  var headers: StringDictionary[String] = js.native
  /**
    * The HTTP method to use in the visit. Can be `GET` or `POST`.
    *
    * @default "GET"
    */
  var method: GET | POST = js.native
  /**
    * Query parameters to append to the `url` of the request.
    */
  var qs: js.Object = js.native
  /**
    * The URL to visit. Behaves the same as the `url` argument.
    */
  var url: String = js.native
  /**
    * Called before your page has loaded all of its resources.
    *
    * @param {Window} contentWindow the remote page's window object
    */
  def onBeforeLoad(win: Window_): Unit = js.native
  /**
    * Called once your page has fired its load event.
    *
    * @param {Window} contentWindow the remote page's window object
    */
  def onLoad(win: Window_): Unit = js.native
}

object VisitOptions {
  @scala.inline
  def apply(
    auth: Auth,
    body: RequestBody,
    failOnStatusCode: Boolean,
    headers: StringDictionary[String],
    log: Boolean,
    method: GET | POST,
    onBeforeLoad: Window_ => Unit,
    onLoad: Window_ => Unit,
    qs: js.Object,
    retryOnNetworkFailure: Boolean,
    retryOnStatusCodeFailure: Boolean,
    timeout: Double,
    url: String
  ): VisitOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], failOnStatusCode = failOnStatusCode.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], onBeforeLoad = js.Any.fromFunction1(onBeforeLoad), onLoad = js.Any.fromFunction1(onLoad), qs = qs.asInstanceOf[js.Any], retryOnNetworkFailure = retryOnNetworkFailure.asInstanceOf[js.Any], retryOnStatusCodeFailure = retryOnStatusCodeFailure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitOptions]
  }
  @scala.inline
  implicit class VisitOptionsOps[Self <: VisitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: Auth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: RequestBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: GET | POST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBeforeLoad(value: Window_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnLoad(value: Window_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

