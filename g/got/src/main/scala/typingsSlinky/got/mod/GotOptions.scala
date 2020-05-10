package typingsSlinky.got.mod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.urlMod.URLSearchParams
import typingsSlinky.std.Record
import typingsSlinky.toughCookie.mod.CookieJar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotOptions[E /* <: String | Null */] extends InternalRequestOptions {
  @JSName("agent")
  var agent_GotOptions: js.UndefOr[Agent | Boolean | AgentOptions] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var cache: js.UndefOr[Cache] = js.native
  var cookieJar: js.UndefOr[CookieJar] = js.native
  var decompress: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[E] = js.native
  var followRedirect: js.UndefOr[Boolean] = js.native
  var query: js.UndefOr[(Record[String, _]) | URLSearchParams | String] = js.native
  var request: js.UndefOr[RequestFunction] = js.native
  var retry: js.UndefOr[Double | RetryOptions] = js.native
  var throwHttpErrors: js.UndefOr[Boolean] = js.native
  @JSName("timeout")
  var timeout_GotOptions: js.UndefOr[Double | TimeoutOptions] = js.native
  var useElectronNet: js.UndefOr[Boolean] = js.native
}

object GotOptions {
  @scala.inline
  def apply[E](): GotOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GotOptions[E]]
  }
  @scala.inline
  implicit class GotOptionsOps[Self[e] <: GotOptions[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withAgent(value: Agent | Boolean | AgentOptions): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Cache): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieJar(value: CookieJar): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieJar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieJar: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieJar")(js.undefined)
        ret
    }
    @scala.inline
    def withDecompress(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecompress: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompress")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: E): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowRedirect(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowRedirect: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: (Record[String, _]) | URLSearchParams | String): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: RequestFunction): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: Double | RetryOptions): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowHttpErrors(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwHttpErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowHttpErrors: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwHttpErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double | TimeoutOptions): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUseElectronNet(value: Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useElectronNet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseElectronNet: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useElectronNet")(js.undefined)
        ret
    }
  }
  
}

