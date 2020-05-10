package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A summary of a test suite result either parsed from XML or uploaded
  * directly by a user.  Note: the API related comments are for StepService
  * only. This message is also being used in ExecutionService in a read only
  * mode for the corresponding step.
  */
@js.native
trait SchemaTestSuiteOverview extends js.Object {
  /**
    * Number of test cases in error, typically set by the service by parsing
    * the xml_source.  - In create/response: always set - In update request:
    * never
    */
  var errorCount: js.UndefOr[Double] = js.native
  /**
    * Number of failed test cases, typically set by the service by parsing the
    * xml_source. May also be set by the user.  - In create/response: always
    * set - In update request: never
    */
  var failureCount: js.UndefOr[Double] = js.native
  /**
    * The name of the test suite.  - In create/response: always set - In update
    * request: never
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of test cases not run, typically set by the service by parsing the
    * xml_source.  - In create/response: always set - In update request: never
    */
  var skippedCount: js.UndefOr[Double] = js.native
  /**
    * Number of test cases, typically set by the service by parsing the
    * xml_source.  - In create/response: always set - In update request: never
    */
  var totalCount: js.UndefOr[Double] = js.native
  /**
    * If this test suite was parsed from XML, this is the URI where the
    * original XML file is stored.  Note: Multiple test suites can share the
    * same xml_source  Returns INVALID_ARGUMENT if the uri format is not
    * supported.  - In create/response: optional - In update request: never
    */
  var xmlSource: js.UndefOr[SchemaFileReference] = js.native
}

object SchemaTestSuiteOverview {
  @scala.inline
  def apply(): SchemaTestSuiteOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSuiteOverview]
  }
  @scala.inline
  implicit class SchemaTestSuiteOverviewOps[Self <: SchemaTestSuiteOverview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCount")(js.undefined)
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
    def withSkippedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlSource(value: SchemaFileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlSource")(js.undefined)
        ret
    }
  }
  
}

