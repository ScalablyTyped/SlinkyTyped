package typingsSlinky.i18nAbide.mod

import typingsSlinky.i18nAbide.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbideOptions extends js.Object {
  var debug_lang: js.UndefOr[String] = js.native
  var default_lang: js.UndefOr[String] = js.native
  var disable_locale_check: js.UndefOr[Boolean] = js.native
  var gettext_alias: js.UndefOr[String] = js.native
  var logger: js.UndefOr[AnonError] = js.native
  var supported_languages: js.UndefOr[js.Array[String]] = js.native
  var translation_directory: js.UndefOr[String] = js.native
}

object AbideOptions {
  @scala.inline
  def apply(): AbideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbideOptions]
  }
  @scala.inline
  implicit class AbideOptionsOps[Self <: AbideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug_lang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug_lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug_lang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug_lang")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_lang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_lang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_lang")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_locale_check(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_locale_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_locale_check: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_locale_check")(js.undefined)
        ret
    }
    @scala.inline
    def withGettext_alias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gettext_alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGettext_alias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gettext_alias")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: AnonError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withSupported_languages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported_languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupported_languages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported_languages")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslation_directory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation_directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslation_directory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation_directory")(js.undefined)
        ret
    }
  }
  
}

