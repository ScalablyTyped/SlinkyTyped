package typingsSlinky.jestCore

import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestWatcher.mod.PatternPrompt
import typingsSlinky.jestWatcher.mod.Prompt
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/TestNamePatternPrompt", JSImport.Namespace)
@js.native
object testNamePatternPromptMod extends js.Object {
  
  @js.native
  trait TestNamePatternPrompt extends PatternPrompt {
    
    var _cachedTestResults: js.Array[TestResult] = js.native
    
    def _getMatchedTests(pattern: String): js.Array[String] = js.native
    
    def _printPrompt(pattern: String): Unit = js.native
    
    def updateCachedTestResults(): Unit = js.native
    def updateCachedTestResults(testResults: js.Array[TestResult]): Unit = js.native
  }
  
  @js.native
  class default protected () extends TestNamePatternPrompt {
    def this(pipe: WritableStream, prompt: Prompt) = this()
  }
}
