package typingsSlinky.jestTestResult

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.SerializableError
import typingsSlinky.jestTestResult.typesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/test-result/build/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = js.native
  
  def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = js.native
  
  def makeEmptyAggregatedTestResult(): AggregatedResult = js.native
}
