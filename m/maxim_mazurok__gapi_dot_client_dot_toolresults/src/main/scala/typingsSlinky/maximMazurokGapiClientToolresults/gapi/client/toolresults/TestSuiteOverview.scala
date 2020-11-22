package typingsSlinky.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSuiteOverview extends js.Object {
  
  /** Elapsed time of test suite. */
  var elapsedTime: js.UndefOr[Duration] = js.native
  
  /** Number of test cases in error, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never */
  var errorCount: js.UndefOr[Double] = js.native
  
  /** Number of failed test cases, typically set by the service by parsing the xml_source. May also be set by the user. - In create/response: always set - In update request: never */
  var failureCount: js.UndefOr[Double] = js.native
  
  /**
    * Number of flaky test cases, set by the service by rolling up flaky test attempts. Present only for rollup test suite overview at environment level. A step cannot have flaky test
    * cases.
    */
  var flakyCount: js.UndefOr[Double] = js.native
  
  /** The name of the test suite. - In create/response: always set - In update request: never */
  var name: js.UndefOr[String] = js.native
  
  /** Number of test cases not run, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never */
  var skippedCount: js.UndefOr[Double] = js.native
  
  /** Number of test cases, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never */
  var totalCount: js.UndefOr[Double] = js.native
  
  /**
    * If this test suite was parsed from XML, this is the URI where the original XML file is stored. Note: Multiple test suites can share the same xml_source Returns INVALID_ARGUMENT if
    * the uri format is not supported. - In create/response: optional - In update request: never
    */
  var xmlSource: js.UndefOr[FileReference] = js.native
}
object TestSuiteOverview {
  
  @scala.inline
  def apply(): TestSuiteOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSuiteOverview]
  }
  
  @scala.inline
  implicit class TestSuiteOverviewOps[Self <: TestSuiteOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElapsedTime(value: Duration): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsedTime: Self = this.set("elapsedTime", js.undefined)
    
    @scala.inline
    def setErrorCount(value: Double): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCount: Self = this.set("errorCount", js.undefined)
    
    @scala.inline
    def setFailureCount(value: Double): Self = this.set("failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCount: Self = this.set("failureCount", js.undefined)
    
    @scala.inline
    def setFlakyCount(value: Double): Self = this.set("flakyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlakyCount: Self = this.set("flakyCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSkippedCount(value: Double): Self = this.set("skippedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippedCount: Self = this.set("skippedCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
    
    @scala.inline
    def setXmlSource(value: FileReference): Self = this.set("xmlSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlSource: Self = this.set("xmlSource", js.undefined)
  }
}
