package typingsSlinky.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.urllib.mod.RequestOptions2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpClientConfig extends HttpClientBaseConfig {
  /** Whether enable dns cache */
  var enableDNSCache: js.UndefOr[Boolean] = js.native
  /** Enable proxy request, default is false. */
  var enableProxy: js.UndefOr[Boolean] = js.native
  /** http.Agent */
  var httpAgent: js.UndefOr[HttpClientBaseConfig] = js.native
  /** https.Agent */
  var httpsAgent: js.UndefOr[HttpClientBaseConfig] = js.native
  /** proxy agent uri or options, default is null. */
  var proxy: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  /** Default request args for httpclient */
  var request: js.UndefOr[RequestOptions2] = js.native
}

object HttpClientConfig {
  @scala.inline
  def apply(): HttpClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpClientConfig]
  }
  @scala.inline
  implicit class HttpClientConfigOps[Self <: HttpClientConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableDNSCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDNSCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDNSCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDNSCache")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpAgent(value: HttpClientBaseConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpsAgent(value: HttpClientBaseConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String | StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: RequestOptions2): Self = {
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
  }
  
}

