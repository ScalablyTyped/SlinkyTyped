package typingsSlinky.prettier.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prettier.anon.PartialRequiredOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var defaultOptions: js.UndefOr[PartialRequiredOptions] = js.native
  var languages: js.UndefOr[js.Array[SupportLanguage]] = js.native
  var options: js.UndefOr[js.Array[SupportOption]] = js.native
  var parsers: js.UndefOr[StringDictionary[Parser]] = js.native
  var printers: js.UndefOr[StringDictionary[Printer]] = js.native
}

object Plugin {
  @scala.inline
  def apply(): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOptions(value: PartialRequiredOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguages(value: js.Array[SupportLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[SupportOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withParsers(value: StringDictionary[Parser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsers")(js.undefined)
        ret
    }
    @scala.inline
    def withPrinters(value: StringDictionary[Printer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrinters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printers")(js.undefined)
        ret
    }
  }
  
}

