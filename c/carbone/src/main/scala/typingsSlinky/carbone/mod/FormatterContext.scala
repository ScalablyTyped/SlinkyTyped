package typingsSlinky.carbone.mod

import typingsSlinky.carbone.anon.Rates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatterContext extends js.Object {
  var currency: Rates = js.native
  var enum: Enums = js.native
  var extension: String = js.native
  var lang: String = js.native
  var stopPropagation: Boolean = js.native
}

object FormatterContext {
  @scala.inline
  def apply(currency: Rates, enum: Enums, extension: String, lang: String, stopPropagation: Boolean): FormatterContext = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterContext]
  }
  @scala.inline
  implicit class FormatterContextOps[Self <: FormatterContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: Rates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnum(value: Enums): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

