package typingsSlinky.karmaCoverage

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.istanbul.mod.Store
import typingsSlinky.karmaCoverage.mod.KarmaCoverageReporter
import typingsSlinky.karmaCoverage.mod.Reporter
import typingsSlinky.karmaCoverage.mod.ReporterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined karma-coverage.karma.KarmaCoverageReporter & {  reporters ? :std.Array<karma-coverage.karma.KarmaCoverageReporter>} */
@js.native
trait KarmaCoverageReporterrepo
  extends /* moreSettings */ StringDictionary[js.Any] {
  /** This will be used to configure minimum threshold enforcement for coverage results */
  var check: js.UndefOr[js.Any] = js.native
  /** This will be used to output coverage reports. When you set a relative path, the directory is resolved against the basePath. */
  var dir: js.UndefOr[String] = js.native
  /** If you use one of these reporters, `cobertura`, `lcovonly`, `teamcity`, `text` or `text-summary`, you may set the file option to specify the output file */
  var file: js.UndefOr[String] = js.native
  /**
    * You can opt to include all sources files, as indicated by the coverage preprocessor,
    * in your code coverage data, even if there are no tests covering them
    */
  var includeAllSources: js.UndefOr[Boolean] = js.native
  /**
    * Karma-coverage can infers the instrumenter regarding of the file extension.
    * It is possible to override this behavior and point out an instrumenter
    * for the files matching a specific pattern.
    */
  var instrumenter: js.UndefOr[js.Any] = js.native
  /** You can use multiple reporters, by providing array of options */
  var reporters: js.UndefOr[js.Array[Reporter] with js.Array[KarmaCoverageReporter]] = js.native
  /** You can opt to specify a source store allowing for external coverage collectors access to the instrumented code. */
  var sourceStore: js.UndefOr[Store] = js.native
  /** This will be used in complement of the coverageReporter.dir option to generate the full output directory path */
  var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.native
  /** Specify a reporter type */
  var `type`: js.UndefOr[ReporterType] = js.native
  /**
    * If set to true, then CoffeeScript files instrumented with Ibrik will use
    * the .js extension for the transpiled source (without this option,
    * the JavaScript files will keep the original .coffee extension)
    */
  var useJSExtensionForCoffeeScript: js.UndefOr[Boolean] = js.native
  /** This will be used to set the coverage threshold colors */
  var watermarks: js.UndefOr[js.Any] = js.native
}

object KarmaCoverageReporterrepo {
  @scala.inline
  def apply(): KarmaCoverageReporterrepo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KarmaCoverageReporterrepo]
  }
  @scala.inline
  implicit class KarmaCoverageReporterrepoOps[Self <: KarmaCoverageReporterrepo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
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
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAllSources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAllSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAllSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAllSources")(js.undefined)
        ret
    }
    @scala.inline
    def withInstrumenter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrumenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumenter")(js.undefined)
        ret
    }
    @scala.inline
    def withReporters(value: js.Array[Reporter] with js.Array[KarmaCoverageReporter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceStore")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdirFunction1(value: /* browser */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdir")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubdir(value: String | (js.Function1[/* browser */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdir")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ReporterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseJSExtensionForCoffeeScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJSExtensionForCoffeeScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseJSExtensionForCoffeeScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJSExtensionForCoffeeScript")(js.undefined)
        ret
    }
    @scala.inline
    def withWatermarks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarks")(js.undefined)
        ret
    }
  }
  
}

