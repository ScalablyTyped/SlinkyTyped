package typingsSlinky.i18nextExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageDetectorOptions extends js.Object {
  var caches: js.UndefOr[LanguageDetectorCaches] = js.native
  var cookieDomain: js.UndefOr[String] = js.native
  var cookieExpirationDate: js.UndefOr[js.Date] = js.native
  var lookupCookie: js.UndefOr[String] = js.native
  var lookupFromPathIndex: js.UndefOr[Double] = js.native
  var lookupQuerystring: js.UndefOr[String] = js.native
  var lookupSession: js.UndefOr[String] = js.native
  var order: js.UndefOr[LanguageDetectorOrder] = js.native
}

object LanguageDetectorOptions {
  @scala.inline
  def apply(): LanguageDetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageDetectorOptions]
  }
  @scala.inline
  implicit class LanguageDetectorOptionsOps[Self <: LanguageDetectorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaches(value: LanguageDetectorCaches): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caches")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupCookie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupCookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupCookie")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupFromPathIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupFromPathIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupFromPathIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupFromPathIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupQuerystring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupQuerystring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupQuerystring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupQuerystring")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupSession")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: LanguageDetectorOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

