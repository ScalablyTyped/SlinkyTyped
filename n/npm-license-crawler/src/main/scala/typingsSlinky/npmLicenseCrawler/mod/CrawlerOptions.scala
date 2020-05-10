package typingsSlinky.npmLicenseCrawler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerOptions extends js.Object {
  /** export the data as comma-separated values to the given file. The path will be created if it does not exist. */
  var csv: js.UndefOr[String] = js.native
  /** show only third-party licenses, i.e., only list the dependencies defined in package.json. */
  var dependencies: js.UndefOr[Boolean] = js.native
  /** show only development dependencies */
  var development: js.UndefOr[Boolean] = js.native
  /** path to a directory to be excluded (and its subdirectories) from the search. */
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  /** export data as JSON to the given file. The path will be created if it does not exist. */
  var json: js.UndefOr[String] = js.native
  /** omit version numbers in result (e.g. "npm-license-crawler@0.1.5" becomes "npm-license-crawler") */
  var omitVersion: js.UndefOr[Boolean] = js.native
  /** show only direct dependencies licenses, i.e., don't list dependencies of dependencies. */
  var onlyDirectDependencies: js.UndefOr[Boolean] = js.native
  /** show only production dependencies */
  var production: js.UndefOr[Boolean] = js.native
  /** output the relative file path for license files. */
  var relativeLicensePath: js.UndefOr[Boolean] = js.native
  /** path to the directory the license search should start from. If omitted the current working directory is assumed. */
  var start: String | js.Array[String] = js.native
  /** show only licenses that can't be determined or have been guessed. */
  var unknown: js.UndefOr[Boolean] = js.native
}

object CrawlerOptions {
  @scala.inline
  def apply(start: String | js.Array[String]): CrawlerOptions = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerOptions]
  }
  @scala.inline
  implicit class CrawlerOptionsOps[Self <: CrawlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStart(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsv(value: String): Self = {
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
    def withDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
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
    def withExclude(value: String | js.Array[String]): Self = {
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
    def withOmitVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyDirectDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyDirectDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyDirectDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyDirectDependencies")(js.undefined)
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

