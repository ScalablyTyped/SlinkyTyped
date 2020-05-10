package typingsSlinky.meteorUniverseI18n.mod

import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18nOptions extends js.Object {
  var close: String = js.native
  var defaultLocale: String = js.native
  var hideMissing: Boolean = js.native
  var hostUrl: String = js.native
  var open: String = js.native
  var purify: js.UndefOr[js.Function0[Unit]] = js.native
  var sameLocaleOnServerConnection: Boolean = js.native
  var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
}

object i18nOptions {
  @scala.inline
  def apply(
    close: String,
    defaultLocale: String,
    hideMissing: Boolean,
    hostUrl: String,
    open: String,
    sameLocaleOnServerConnection: Boolean
  ): i18nOptions = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], hideMissing = hideMissing.asInstanceOf[js.Any], hostUrl = hostUrl.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], sameLocaleOnServerConnection = sameLocaleOnServerConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18nOptions]
  }
  @scala.inline
  implicit class i18nOptionsOps[Self <: i18nOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSameLocaleOnServerConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameLocaleOnServerConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurify(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purify")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPurify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purify")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslationsHeaders(value: OutgoingHttpHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationsHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslationsHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationsHeaders")(js.undefined)
        ret
    }
  }
  
}

