package typingsSlinky.octokitRest.mod.Octokit

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.octokitRest.anon.ClientId
import typingsSlinky.octokitRest.anon.Debug
import typingsSlinky.octokitRest.anon.On2fa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* option */ StringDictionary[js.Any] {
  /**
    * @deprecated Use {request: {agent}} instead. See https://github.com/octokit/request.js#request
    */
  var agent: js.UndefOr[Agent] = js.native
  var auth: js.UndefOr[String | On2fa | ClientId | (js.Function0[String | js.Promise[String]]) | js.Any] = js.native
  var authStrategy: js.UndefOr[js.Any] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * @deprecated Use {userAgent, previews} instead. See https://github.com/octokit/request.js#request
    */
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  var log: js.UndefOr[Debug] = js.native
  var previews: js.UndefOr[js.Array[String]] = js.native
  var request: js.UndefOr[typingsSlinky.octokitRest.anon.Agent] = js.native
  /**
    * @deprecated Use {request: {timeout}} instead. See https://github.com/octokit/request.js#request
    */
  var timeout: js.UndefOr[Double] = js.native
  var userAgent: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthFunction0(value: () => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAuth(value: String | On2fa | ClientId | (js.Function0[String | js.Promise[String]]) | js.Any): Self = {
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
    def withAuthStrategy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[js.Any]): Self = {
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
    def withLog(value: Debug): Self = {
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
    def withPreviews(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previews")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: typingsSlinky.octokitRest.anon.Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
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
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
  }
  
}

