package typingsSlinky.apolloLinkHttpCommon.mod

import typingsSlinky.apolloLink.typesMod.Operation
import typingsSlinky.apolloLinkHttpCommon.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpOptions extends js.Object {
  var credentials: js.UndefOr[String] = js.native
  var fetch: js.UndefOr[FnCall] = js.native
  var fetchOptions: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var includeExtensions: js.UndefOr[Boolean] = js.native
  var uri: js.UndefOr[String | UriFunction] = js.native
}

object HttpOptions {
  @scala.inline
  def apply(): HttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOptions]
  }
  @scala.inline
  implicit class HttpOptionsOps[Self <: HttpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
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
    def withIncludeExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withUriFunction1(value: /* operation */ Operation => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUri(value: String | UriFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

