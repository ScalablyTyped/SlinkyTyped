package typingsSlinky.karmaCoverageIstanbulReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageIstanbulReporter extends js.Object {
  /** Combines coverage information from multiple browsers into one report rather than outputting a report for each browser */
  val combineBrowserReports: js.UndefOr[Boolean] = js.native
  /**
    * Base output directory.
    * If you include `%browser%` in the path it will be replaced with the karma browser name.
    */
  val dir: js.UndefOr[String] = js.native
  /** if using webpack and pre-loaders, work around webpack breaking the source path. */
  val fixWebpackSourcePaths: js.UndefOr[Boolean] = js.native
  // TODO: Add istanbul-api
  /** `instrumentation` is used to configure Istanbul API package. */
  val instrumentation: js.UndefOr[js.Any] = js.native
  // TODO: Add istanbul-api
  /** Most reporters accept additional config options. You can pass these through the `report-config` option. */
  val `report-config`: js.UndefOr[js.Any] = js.native
  /** Reports can be any that are listed {@link https://github.com/istanbuljs/istanbuljs/tree/aae256fb8b9a3d19414dcf069c592e88712c32c6/packages/istanbul-reports/lib here}. */
  val reports: js.UndefOr[js.Array[String]] = js.native
  /** Omit files with no statements, no functions and no branches from the report. */
  val skipFilesWithNoCoverage: js.UndefOr[Boolean] = js.native
  /**
    * Enforce percentage thresholds.
    * Anything under these percentages will cause karma to fail with an exit code of 1 if not running in watch mode.
    */
  val thresholds: js.UndefOr[ThresholdConfig] = js.native
  /** Output config used by istanbul for debugging. */
  val verbose: js.UndefOr[Boolean] = js.native
}

object CoverageIstanbulReporter {
  @scala.inline
  def apply(): CoverageIstanbulReporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageIstanbulReporter]
  }
  @scala.inline
  implicit class CoverageIstanbulReporterOps[Self <: CoverageIstanbulReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCombineBrowserReports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineBrowserReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombineBrowserReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineBrowserReports")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withFixWebpackSourcePaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixWebpackSourcePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixWebpackSourcePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixWebpackSourcePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withInstrumentation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrumentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentation")(js.undefined)
        ret
    }
    @scala.inline
    def `withReport-config`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report-config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutReport-config`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report-config")(js.undefined)
        ret
    }
    @scala.inline
    def withReports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFilesWithNoCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFilesWithNoCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFilesWithNoCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFilesWithNoCoverage")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholds(value: ThresholdConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

