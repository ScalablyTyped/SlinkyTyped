package typingsSlinky.istanbulReports.mod

import typingsSlinky.istanbulReports.OptionsblockNamestring
import typingsSlinky.istanbulReports.OptionsmaxColsnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportOptions extends js.Object {
  var clover: RootedOptions = js.native
  var cobertura: RootedOptions = js.native
  var html: HtmlOptions = js.native
  var json: Options = js.native
  var `json-summary`: Options = js.native
  var lcovonly: Options = js.native
  var none: RootedOptions = js.native
  var teamcity: OptionsblockNamestring = js.native
  var text: OptionsmaxColsnumber = js.native
  var `text-lcov`: Options = js.native
  var `text-summary`: Options = js.native
}

object ReportOptions {
  @scala.inline
  def apply(
    clover: RootedOptions,
    cobertura: RootedOptions,
    html: HtmlOptions,
    json: Options,
    `json-summary`: Options,
    lcovonly: Options,
    none: RootedOptions,
    teamcity: OptionsblockNamestring,
    text: OptionsmaxColsnumber,
    `text-lcov`: Options,
    `text-summary`: Options
  ): ReportOptions = {
    val __obj = js.Dynamic.literal(clover = clover.asInstanceOf[js.Any], cobertura = cobertura.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lcovonly = lcovonly.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], teamcity = teamcity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("json-summary")(`json-summary`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-lcov")(`text-lcov`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-summary")(`text-summary`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOptions]
  }
  @scala.inline
  implicit class ReportOptionsOps[Self <: ReportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClover(value: RootedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCobertura(value: RootedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cobertura")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: HtmlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withJson-summary`(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json-summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLcovonly(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcovonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: RootedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamcity(value: OptionsblockNamestring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamcity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: OptionsmaxColsnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-lcov`(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-lcov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-summary`(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-summary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

