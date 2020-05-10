package typingsSlinky.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var currencyRates: js.UndefOr[CurrencyRates] = js.native
  var currencySource: js.UndefOr[String] = js.native
  var currencyTarget: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var tempPath: js.UndefOr[String] = js.native
  var templatePath: js.UndefOr[String] = js.native
  var translations: js.UndefOr[Translations] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyRates(value: CurrencyRates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyRates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyRates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyRates")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencySource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencySource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySource")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withTempPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplatePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplatePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatePath")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

