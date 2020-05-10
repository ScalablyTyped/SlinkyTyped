package typingsSlinky.meteorUniverseI18n

import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<meteor-universe-i18n.meteor/universe:i18n.i18nOptions> */
@js.native
trait Partiali18nOptions extends js.Object {
  var close: js.UndefOr[String] = js.native
  var defaultLocale: js.UndefOr[String] = js.native
  var hideMissing: js.UndefOr[Boolean] = js.native
  var hostUrl: js.UndefOr[String] = js.native
  var open: js.UndefOr[String] = js.native
  var purify: js.UndefOr[js.Function0[Unit]] = js.native
  var sameLocaleOnServerConnection: js.UndefOr[Boolean] = js.native
  var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
}

object Partiali18nOptions {
  @scala.inline
  def apply(): Partiali18nOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partiali18nOptions]
  }
  @scala.inline
  implicit class Partiali18nOptionsOps[Self <: Partiali18nOptions] (val x: Self) extends AnyVal {
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
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withHostUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
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
    def withSameLocaleOnServerConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameLocaleOnServerConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameLocaleOnServerConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameLocaleOnServerConnection")(js.undefined)
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

