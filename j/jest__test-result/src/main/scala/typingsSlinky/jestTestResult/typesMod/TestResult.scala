package typingsSlinky.jestTestResult.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.istanbulLibCoverage.mod.CoverageMapData
import typingsSlinky.jestConsole.typesMod.ConsoleBuffer
import typingsSlinky.jestConsole.typesMod.LogEntry
import typingsSlinky.jestTestResult.anon.Added
import typingsSlinky.jestTestResult.anon.End
import typingsSlinky.jestTypes.configMod.DisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResult extends StObject {
  
  var console: js.UndefOr[ConsoleBuffer] = js.native
  
  var coverage: js.UndefOr[CoverageMapData] = js.native
  
  var displayName: js.UndefOr[DisplayName] = js.native
  
  var failureMessage: js.UndefOr[String | Null] = js.native
  
  var leaks: Boolean = js.native
  
  var memoryUsage: js.UndefOr[Bytes] = js.native
  
  var numFailingTests: Double = js.native
  
  var numPassingTests: Double = js.native
  
  var numPendingTests: Double = js.native
  
  var numTodoTests: Double = js.native
  
  var openHandles: js.Array[js.Error] = js.native
  
  var perfStats: End = js.native
  
  var skipped: Boolean = js.native
  
  var snapshot: Added = js.native
  
  var sourceMaps: js.UndefOr[StringDictionary[String]] = js.native
  
  var testExecError: js.UndefOr[SerializableError] = js.native
  
  var testFilePath: String = js.native
  
  var testResults: js.Array[AssertionResult] = js.native
}
object TestResult {
  
  @scala.inline
  def apply(
    leaks: Boolean,
    numFailingTests: Double,
    numPassingTests: Double,
    numPendingTests: Double,
    numTodoTests: Double,
    openHandles: js.Array[js.Error],
    perfStats: End,
    skipped: Boolean,
    snapshot: Added,
    testFilePath: String,
    testResults: js.Array[AssertionResult]
  ): TestResult = {
    val __obj = js.Dynamic.literal(leaks = leaks.asInstanceOf[js.Any], numFailingTests = numFailingTests.asInstanceOf[js.Any], numPassingTests = numPassingTests.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], perfStats = perfStats.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], testFilePath = testFilePath.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  
  @scala.inline
  implicit class TestResultMutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsole(value: ConsoleBuffer): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    @scala.inline
    def setConsoleVarargs(value: LogEntry*): Self = StObject.set(x, "console", js.Array(value :_*))
    
    @scala.inline
    def setCoverage(value: CoverageMapData): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageNull: Self = StObject.set(x, "failureMessage", null)
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    @scala.inline
    def setLeaks(value: Boolean): Self = StObject.set(x, "leaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUsage(value: Bytes): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUsageUndefined: Self = StObject.set(x, "memoryUsage", js.undefined)
    
    @scala.inline
    def setNumFailingTests(value: Double): Self = StObject.set(x, "numFailingTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPassingTests(value: Double): Self = StObject.set(x, "numPassingTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPendingTests(value: Double): Self = StObject.set(x, "numPendingTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTodoTests(value: Double): Self = StObject.set(x, "numTodoTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenHandles(value: js.Array[js.Error]): Self = StObject.set(x, "openHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenHandlesVarargs(value: js.Error*): Self = StObject.set(x, "openHandles", js.Array(value :_*))
    
    @scala.inline
    def setPerfStats(value: End): Self = StObject.set(x, "perfStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipped(value: Boolean): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: Added): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMaps(value: StringDictionary[String]): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
    
    @scala.inline
    def setTestExecError(value: SerializableError): Self = StObject.set(x, "testExecError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestExecErrorUndefined: Self = StObject.set(x, "testExecError", js.undefined)
    
    @scala.inline
    def setTestFilePath(value: String): Self = StObject.set(x, "testFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResults(value: js.Array[AssertionResult]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsVarargs(value: AssertionResult*): Self = StObject.set(x, "testResults", js.Array(value :_*))
  }
}
