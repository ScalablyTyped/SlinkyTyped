package typingsSlinky.cucumberHtmlReporter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var columnLayout: js.UndefOr[Double] = js.native
  var ignoreBadJsonFile: js.UndefOr[Boolean] = js.native
  var jsonDir: js.UndefOr[String] = js.native
  var jsonFile: String = js.native
  var launchReport: Boolean = js.native
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var noInlineScreenshots: js.UndefOr[Boolean] = js.native
  var output: String = js.native
  var reportSuiteAsScenarios: Boolean = js.native
  var screenshotsDirectory: js.UndefOr[String] = js.native
  var storeScreenshots: js.UndefOr[Boolean] = js.native
  var theme: String = js.native
}

object Options {
  @scala.inline
  def apply(
    jsonFile: String,
    launchReport: Boolean,
    output: String,
    reportSuiteAsScenarios: Boolean,
    theme: String
  ): Options = {
    val __obj = js.Dynamic.literal(jsonFile = jsonFile.asInstanceOf[js.Any], launchReport = launchReport.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reportSuiteAsScenarios = reportSuiteAsScenarios.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportSuiteAsScenarios(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportSuiteAsScenarios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnLayout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreBadJsonFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBadJsonFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreBadJsonFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBadJsonFile")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonDir")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNoInlineScreenshots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInlineScreenshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoInlineScreenshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInlineScreenshots")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshotsDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotsDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshotsDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotsDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreScreenshots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeScreenshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreScreenshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeScreenshots")(js.undefined)
        ret
    }
  }
  
}

