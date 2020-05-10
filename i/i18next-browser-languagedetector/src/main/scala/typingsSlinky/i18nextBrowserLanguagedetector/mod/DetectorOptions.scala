package typingsSlinky.i18nextBrowserLanguagedetector.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.cookie
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.htmlTag
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.localStorage
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.navigator
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.querystring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorOptions extends js.Object {
  /**
    * cache user language on
    */
  var caches: js.UndefOr[js.Array[String]] = js.native
  var cookieDomain: js.UndefOr[String] = js.native
  /**
    * optional expire and domain for set cookie
    * @default 10
    */
  var cookieMinutes: js.UndefOr[Double] = js.native
  /**
    * languages to not persist (cookie, localStorage)
    */
  var excludeCacheFor: js.UndefOr[js.Array[String]] = js.native
  /**
    * optional htmlTag with lang attribute
    * @default document.documentElement
    */
  var htmlTag: js.UndefOr[HTMLElement | Null] = js.native
  var lookupCookie: js.UndefOr[String] = js.native
  var lookupLocalStorage: js.UndefOr[String] = js.native
  /**
    * keys or params to lookup language from
    */
  var lookupQuerystring: js.UndefOr[String] = js.native
  /**
    * order and from where user language should be detected
    */
  var order: js.UndefOr[js.Array[querystring | cookie | localStorage | navigator | htmlTag | String]] = js.native
}

object DetectorOptions {
  @scala.inline
  def apply(): DetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorOptions]
  }
  @scala.inline
  implicit class DetectorOptionsOps[Self <: DetectorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaches(value: js.Array[String]): Self = {
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
    def withCookieMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeCacheFor(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeCacheFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeCacheFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeCacheFor")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlTag(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTag")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlTagNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTag")(null)
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
    def withLookupLocalStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupLocalStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupLocalStorage")(js.undefined)
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
    def withOrder(value: js.Array[querystring | cookie | localStorage | navigator | htmlTag | String]): Self = {
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

