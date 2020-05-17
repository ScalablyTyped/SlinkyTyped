package typingsSlinky.asana.anon

import typingsSlinky.asana.mod.resources.VersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsanaBaseUrl extends js.Object {
  var _cachedVersionInfo: VersionInfo = js.native
  var asanaBaseUrl: String = js.native
  var authenticator: ApiKey = js.native
  var requestTimeout: Double = js.native
  var retryOnRateLimit: Boolean = js.native
}

object AsanaBaseUrl {
  @scala.inline
  def apply(
    _cachedVersionInfo: VersionInfo,
    asanaBaseUrl: String,
    authenticator: ApiKey,
    requestTimeout: Double,
    retryOnRateLimit: Boolean
  ): AsanaBaseUrl = {
    val __obj = js.Dynamic.literal(_cachedVersionInfo = _cachedVersionInfo.asInstanceOf[js.Any], asanaBaseUrl = asanaBaseUrl.asInstanceOf[js.Any], authenticator = authenticator.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], retryOnRateLimit = retryOnRateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsanaBaseUrl]
  }
  @scala.inline
  implicit class AsanaBaseUrlOps[Self <: AsanaBaseUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_cachedVersionInfo(value: VersionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cachedVersionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsanaBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asanaBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticator(value: ApiKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryOnRateLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnRateLimit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

