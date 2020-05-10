package typingsSlinky.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions extends js.Object {
  var complement: js.UndefOr[js.Object] = js.native
  var convertTo: js.UndefOr[String | js.Object] = js.native
  var currencyRates: js.UndefOr[CurrencyRates] = js.native
  var currencySource: js.UndefOr[String] = js.native
  var currencyTarget: js.UndefOr[String] = js.native
  var enum: js.UndefOr[Enums] = js.native
  var lang: js.UndefOr[String] = js.native
  var translations: js.UndefOr[Translations] = js.native
  var variableStr: js.UndefOr[String] = js.native
}

object RenderOptions {
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplement(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complement")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertTo(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertTo")(js.undefined)
        ret
    }
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
    def withEnum(value: Enums): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(js.undefined)
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
    @scala.inline
    def withVariableStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableStr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableStr")(js.undefined)
        ret
    }
  }
  
}

