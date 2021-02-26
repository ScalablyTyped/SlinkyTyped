package typingsSlinky.jestTestResult

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.SerializableError
import typingsSlinky.jestTestResult.typesMod.TestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@jest/test-result/build/helpers", "addResult")
  @js.native
  def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = js.native
  
  @JSImport("@jest/test-result/build/helpers", "buildFailureTestResult")
  @js.native
  def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = js.native
  
  @JSImport("@jest/test-result/build/helpers", "makeEmptyAggregatedTestResult")
  @js.native
  def makeEmptyAggregatedTestResult(): AggregatedResult = js.native
}
