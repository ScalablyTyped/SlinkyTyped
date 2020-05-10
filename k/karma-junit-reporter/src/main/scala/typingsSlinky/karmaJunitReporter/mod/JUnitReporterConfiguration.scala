package typingsSlinky.karmaJunitReporter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JUnitReporterConfiguration extends js.Object {
  /** function (browser, result) to customize the classname attribute in xml testcase element */
  var classNameFormatter: js.UndefOr[js.Function2[/* browser */ js.Any, /* result */ js.Any, String]] = js.native
  /** function (browser, result) to customize the name attribute in xml testcase element */
  var nameFormatter: js.UndefOr[js.Function2[/* browser */ js.Any, /* result */ js.Any, String]] = js.native
  /** results will be saved as $outputDir/$browserName.xml */
  var outputDir: js.UndefOr[String] = js.native
  /** if included, results will be saved as $outputDir/$browserName/$outputFile */
  var outputFile: js.UndefOr[String] = js.native
  /** key value pair of properties to add to the <properties> section of the report */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** suite will become the package name attribute in xml testsuite element */
  var suite: js.UndefOr[String] = js.native
  /** add browser name to report and classes names */
  var useBrowserName: js.UndefOr[Boolean] = js.native
  /** use '1' if reporting to be per SonarQube 6.2 XML format */
  var xmlVersion: js.UndefOr[Double | Null] = js.native
}

object JUnitReporterConfiguration {
  @scala.inline
  def apply(): JUnitReporterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JUnitReporterConfiguration]
  }
  @scala.inline
  implicit class JUnitReporterConfigurationOps[Self <: JUnitReporterConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNameFormatter(value: (/* browser */ js.Any, /* result */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClassNameFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withNameFormatter(value: (/* browser */ js.Any, /* result */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNameFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFile")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withSuite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBrowserName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBrowserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBrowserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBrowserName")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlVersion")(null)
        ret
    }
  }
  
}

