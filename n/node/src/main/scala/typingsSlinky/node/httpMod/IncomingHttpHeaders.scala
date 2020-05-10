package typingsSlinky.node.httpMod

import typingsSlinky.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// incoming headers will never contain number
@js.native
trait IncomingHttpHeaders
  extends Dict[String | js.Array[String]] {
  var accept: js.UndefOr[String] = js.native
  var `accept-language`: js.UndefOr[String] = js.native
  var `accept-patch`: js.UndefOr[String] = js.native
  var `accept-ranges`: js.UndefOr[String] = js.native
  var `access-control-allow-credentials`: js.UndefOr[String] = js.native
  var `access-control-allow-headers`: js.UndefOr[String] = js.native
  var `access-control-allow-methods`: js.UndefOr[String] = js.native
  var `access-control-allow-origin`: js.UndefOr[String] = js.native
  var `access-control-expose-headers`: js.UndefOr[String] = js.native
  var `access-control-max-age`: js.UndefOr[String] = js.native
  var age: js.UndefOr[String] = js.native
  var allow: js.UndefOr[String] = js.native
  var `alt-svc`: js.UndefOr[String] = js.native
  var authorization: js.UndefOr[String] = js.native
  var `cache-control`: js.UndefOr[String] = js.native
  var connection: js.UndefOr[String] = js.native
  var `content-disposition`: js.UndefOr[String] = js.native
  var `content-encoding`: js.UndefOr[String] = js.native
  var `content-language`: js.UndefOr[String] = js.native
  var `content-length`: js.UndefOr[String] = js.native
  var `content-location`: js.UndefOr[String] = js.native
  var `content-range`: js.UndefOr[String] = js.native
  var `content-type`: js.UndefOr[String] = js.native
  var cookie: js.UndefOr[String] = js.native
  var date: js.UndefOr[String] = js.native
  var expect: js.UndefOr[String] = js.native
  var expires: js.UndefOr[String] = js.native
  var forwarded: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var `if-match`: js.UndefOr[String] = js.native
  var `if-modified-since`: js.UndefOr[String] = js.native
  var `if-none-match`: js.UndefOr[String] = js.native
  var `if-unmodified-since`: js.UndefOr[String] = js.native
  var `last-modified`: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var pragma: js.UndefOr[String] = js.native
  var `proxy-authenticate`: js.UndefOr[String] = js.native
  var `proxy-authorization`: js.UndefOr[String] = js.native
  var `public-key-pins`: js.UndefOr[String] = js.native
  var range: js.UndefOr[String] = js.native
  var referer: js.UndefOr[String] = js.native
  var `retry-after`: js.UndefOr[String] = js.native
  var `set-cookie`: js.UndefOr[js.Array[String]] = js.native
  var `strict-transport-security`: js.UndefOr[String] = js.native
  var tk: js.UndefOr[String] = js.native
  var trailer: js.UndefOr[String] = js.native
  var `transfer-encoding`: js.UndefOr[String] = js.native
  var upgrade: js.UndefOr[String] = js.native
  var `user-agent`: js.UndefOr[String] = js.native
  var vary: js.UndefOr[String] = js.native
  var via: js.UndefOr[String] = js.native
  var warning: js.UndefOr[String] = js.native
  var `www-authenticate`: js.UndefOr[String] = js.native
}

object IncomingHttpHeaders {
  @scala.inline
  def apply(): IncomingHttpHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingHttpHeaders]
  }
  @scala.inline
  implicit class IncomingHttpHeadersOps[Self <: IncomingHttpHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccept-language`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-language")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccept-patch`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-patch`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-patch")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccept-ranges`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-ranges`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-ranges")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-control-allow-credentials`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-allow-credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-control-allow-credentials`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-allow-credentials")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-control-allow-headers`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-allow-headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-control-allow-headers`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-allow-headers")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-control-allow-methods`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-allow-methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-control-allow-methods`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-allow-methods")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-control-allow-origin`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-allow-origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-control-allow-origin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-allow-origin")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-control-expose-headers`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-expose-headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-control-expose-headers`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-expose-headers")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-control-max-age`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-max-age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-control-max-age`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-control-max-age")(js.undefined)
        ret
    }
    @scala.inline
    def withAge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(js.undefined)
        ret
    }
    @scala.inline
    def `withAlt-svc`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt-svc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAlt-svc`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt-svc")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.undefined)
        ret
    }
    @scala.inline
    def `withCache-control`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCache-control`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-control")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-disposition`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-disposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-disposition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-disposition")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-encoding`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-encoding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-encoding")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-language`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-language")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-length`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-location`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-location`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-location")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-range`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-range`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-range")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-type")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withExpect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expect")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withForwarded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwarded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwarded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwarded")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def `withIf-match`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if-match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIf-match`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if-match")(js.undefined)
        ret
    }
    @scala.inline
    def `withIf-modified-since`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if-modified-since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIf-modified-since`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if-modified-since")(js.undefined)
        ret
    }
    @scala.inline
    def `withIf-none-match`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if-none-match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIf-none-match`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if-none-match")(js.undefined)
        ret
    }
    @scala.inline
    def `withIf-unmodified-since`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if-unmodified-since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIf-unmodified-since`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if-unmodified-since")(js.undefined)
        ret
    }
    @scala.inline
    def `withLast-modified`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last-modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLast-modified`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last-modified")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPragma(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pragma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPragma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pragma")(js.undefined)
        ret
    }
    @scala.inline
    def `withProxy-authenticate`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy-authenticate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProxy-authenticate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy-authenticate")(js.undefined)
        ret
    }
    @scala.inline
    def `withProxy-authorization`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy-authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProxy-authorization`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy-authorization")(js.undefined)
        ret
    }
    @scala.inline
    def `withPublic-key-pins`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public-key-pins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPublic-key-pins`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public-key-pins")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withReferer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referer")(js.undefined)
        ret
    }
    @scala.inline
    def `withRetry-after`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry-after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRetry-after`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry-after")(js.undefined)
        ret
    }
    @scala.inline
    def `withSet-cookie`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSet-cookie`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-cookie")(js.undefined)
        ret
    }
    @scala.inline
    def `withStrict-transport-security`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict-transport-security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStrict-transport-security`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict-transport-security")(js.undefined)
        ret
    }
    @scala.inline
    def withTk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tk")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailer")(js.undefined)
        ret
    }
    @scala.inline
    def `withTransfer-encoding`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer-encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTransfer-encoding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer-encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgrade(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(js.undefined)
        ret
    }
    @scala.inline
    def `withUser-agent`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUser-agent`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-agent")(js.undefined)
        ret
    }
    @scala.inline
    def withVary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vary")(js.undefined)
        ret
    }
    @scala.inline
    def withVia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
    @scala.inline
    def `withWww-authenticate`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("www-authenticate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWww-authenticate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("www-authenticate")(js.undefined)
        ret
    }
  }
  
}

