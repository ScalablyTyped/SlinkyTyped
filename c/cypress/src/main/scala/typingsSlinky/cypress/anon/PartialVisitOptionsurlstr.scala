package typingsSlinky.cypress.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Window
import typingsSlinky.cypress.cypressMod.Cypress.Auth
import typingsSlinky.cypress.cypressMod.Cypress.RequestBody
import typingsSlinky.cypress.cypressStrings.GET
import typingsSlinky.cypress.cypressStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.VisitOptions> & {  url  :string} */
@js.native
trait PartialVisitOptionsurlstr extends js.Object {
  var auth: js.UndefOr[Auth] = js.native
  var body: js.UndefOr[RequestBody] = js.native
  var failOnStatusCode: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var log: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[GET | POST] = js.native
  var onBeforeLoad: js.UndefOr[js.Function1[/* win */ Window, Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* win */ Window, Unit]] = js.native
  var qs: js.UndefOr[js.Object] = js.native
  var retryOnNetworkFailure: js.UndefOr[Boolean] = js.native
  var retryOnStatusCodeFailure: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object PartialVisitOptionsurlstr {
  @scala.inline
  def apply(): PartialVisitOptionsurlstr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVisitOptionsurlstr]
  }
  @scala.inline
  implicit class PartialVisitOptionsurlstrOps[Self <: PartialVisitOptionsurlstr] (val x: Self) extends AnyVal {
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
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: RequestBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnStatusCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnStatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
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
    def withMethod(value: GET | POST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeLoad(value: /* win */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* win */ Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withQs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qs")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryOnNetworkFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnNetworkFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryOnNetworkFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnNetworkFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryOnStatusCodeFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnStatusCodeFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryOnStatusCodeFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnStatusCodeFailure")(js.undefined)
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

