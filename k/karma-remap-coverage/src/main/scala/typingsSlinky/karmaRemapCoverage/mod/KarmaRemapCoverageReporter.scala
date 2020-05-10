package typingsSlinky.karmaRemapCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// remapped reporter types to key-value pairs
/* Inlined std.Partial<std.Record<karma-coverage.karma.ReporterType, string | null | undefined>> */
@js.native
trait KarmaRemapCoverageReporter extends js.Object {
  var cobertura: js.UndefOr[String] = js.native
  var html: js.UndefOr[String] = js.native
  var `in-memory`: js.UndefOr[String] = js.native
  var json: js.UndefOr[String] = js.native
  var `json-summary`: js.UndefOr[String] = js.native
  var lcov: js.UndefOr[String] = js.native
  var lcovonly: js.UndefOr[String] = js.native
  var none: js.UndefOr[String] = js.native
  var teamcity: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var `text-summary`: js.UndefOr[String] = js.native
}

object KarmaRemapCoverageReporter {
  @scala.inline
  def apply(): KarmaRemapCoverageReporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KarmaRemapCoverageReporter]
  }
  @scala.inline
  implicit class KarmaRemapCoverageReporterOps[Self <: KarmaRemapCoverageReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCobertura(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cobertura")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCobertura: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cobertura")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def `withIn-memory`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in-memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIn-memory`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in-memory")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def `withJson-summary`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json-summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJson-summary`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json-summary")(js.undefined)
        ret
    }
    @scala.inline
    def withLcov(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLcov: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcov")(js.undefined)
        ret
    }
    @scala.inline
    def withLcovonly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcovonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLcovonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcovonly")(js.undefined)
        ret
    }
    @scala.inline
    def withNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamcity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamcity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamcity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamcity")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-summary`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-summary`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-summary")(js.undefined)
        ret
    }
  }
  
}

