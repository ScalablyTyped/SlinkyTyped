package typingsSlinky.licenseChecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOpts extends js.Object {
  /**
    * Output in csv format
    */
  var csv: js.UndefOr[Boolean] = js.native
  /**
    * Prefix column for component in csv format.
    */
  var csvComponentPrefix: js.UndefOr[String] = js.native
  /**
    * To add a custom Format file in JSON
    */
  var customPath: js.UndefOr[String | ModuleInfo] = js.native
  /**
    * Only show development dependencies
    */
  var development: js.UndefOr[Boolean] = js.native
  /**
    * Look for direct dependencies only
    */
  var direct: js.UndefOr[Boolean] = js.native
  /**
    * Exclude modules which licenses are in the comma-separated list from the output
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * Restrict output to the packages (package@version) not in the semicolon-separated list
    */
  var excludePackages: js.UndefOr[String] = js.native
  /**
    * Restrict output to not include any package marked as private
    */
  var excludePrivatePackages: js.UndefOr[Boolean] = js.native
  /**
    * Fail (exit with code 1) on the first occurrence of the licenses of the semicolon-separated list
    */
  var failOn: js.UndefOr[String] = js.native
  /**
    * Output in json format
    */
  var json: js.UndefOr[Boolean] = js.native
  /**
    * Fail (exit with code 1) on the first occurrence of the licenses not in the semicolon-separated list
    */
  var onlyAllow: js.UndefOr[String] = js.native
  /**
    * Only list packages with unknown or guessed licenses
    */
  var onlyunknown: js.UndefOr[Boolean] = js.native
  /**
    * Write the data to a specific file.
    */
  var out: js.UndefOr[String] = js.native
  /**
    * Restrict output to the packages (package@version) in the semicolon-separated list
    */
  var packages: js.UndefOr[String] = js.native
  /**
    * Only show production dependencies
    */
  var production: js.UndefOr[Boolean] = js.native
  /**
    * Output the location of the license files as relative paths
    */
  var relativeLicensePath: js.UndefOr[Boolean] = js.native
  /**
    * Path to start checking dependencies from
    */
  var start: String = js.native
  /**
    * Output a summary of the license usage
    */
  var summary: js.UndefOr[Boolean] = js.native
  /**
    * Report guessed licenses as unknown licenses
    */
  var unknown: js.UndefOr[Boolean] = js.native
}

object InitOpts {
  @scala.inline
  def apply(start: String): InitOpts = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOpts]
  }
  @scala.inline
  implicit class InitOptsOps[Self <: InitOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvComponentPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvComponentPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvComponentPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvComponentPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomPath(value: String | ModuleInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPath")(js.undefined)
        ret
    }
    @scala.inline
    def withDevelopment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("development")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevelopment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("development")(js.undefined)
        ret
    }
    @scala.inline
    def withDirect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludePackages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludePackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePackages")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludePrivatePackages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePrivatePackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludePrivatePackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePrivatePackages")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOn")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
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
    def withOnlyAllow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyAllow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyAllow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyunknown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyunknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyunknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyunknown")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withPackages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packages")(js.undefined)
        ret
    }
    @scala.inline
    def withProduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeLicensePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeLicensePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeLicensePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeLicensePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.undefined)
        ret
    }
  }
  
}

