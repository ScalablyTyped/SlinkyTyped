package typingsSlinky.cloudflareApps.CloudflareApps

import typingsSlinky.cloudflareApps.cloudflareAppsStrings.http
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalURLParsed extends js.Object {
  var fragment: String = js.native
  var host: String = js.native
  var path: String = js.native
  var query: URLQuery = js.native
  var scheme: https | http = js.native
}

object OriginalURLParsed {
  @scala.inline
  def apply(fragment: String, host: String, path: String, query: URLQuery, scheme: https | http): OriginalURLParsed = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalURLParsed]
  }
  @scala.inline
  implicit class OriginalURLParsedOps[Self <: OriginalURLParsed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: URLQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: https | http): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

