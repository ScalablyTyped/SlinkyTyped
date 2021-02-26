package typingsSlinky.jestAxe

import typingsSlinky.axeCore.mod.Result
import typingsSlinky.axeCore.mod.RunOptions
import typingsSlinky.axeCore.mod.TestEngine
import typingsSlinky.axeCore.mod.TestEnvironment
import typingsSlinky.axeCore.mod.TestRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<axe-core.axe-core.AxeResults> */
  @js.native
  trait PartialAxeResults extends StObject {
    
    var inapplicable: js.UndefOr[js.Array[Result]] = js.native
    
    var incomplete: js.UndefOr[js.Array[Result]] = js.native
    
    var passes: js.UndefOr[js.Array[Result]] = js.native
    
    var testEngine: js.UndefOr[TestEngine] = js.native
    
    var testEnvironment: js.UndefOr[TestEnvironment] = js.native
    
    var testRunner: js.UndefOr[TestRunner] = js.native
    
    var timestamp: js.UndefOr[String] = js.native
    
    var toolOptions: js.UndefOr[RunOptions] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var violations: js.UndefOr[js.Array[Result]] = js.native
  }
  object PartialAxeResults {
    
    @scala.inline
    def apply(): PartialAxeResults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAxeResults]
    }
    
    @scala.inline
    implicit class PartialAxeResultsMutableBuilder[Self <: PartialAxeResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInapplicable(value: js.Array[Result]): Self = StObject.set(x, "inapplicable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInapplicableUndefined: Self = StObject.set(x, "inapplicable", js.undefined)
      
      @scala.inline
      def setInapplicableVarargs(value: Result*): Self = StObject.set(x, "inapplicable", js.Array(value :_*))
      
      @scala.inline
      def setIncomplete(value: js.Array[Result]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncompleteUndefined: Self = StObject.set(x, "incomplete", js.undefined)
      
      @scala.inline
      def setIncompleteVarargs(value: Result*): Self = StObject.set(x, "incomplete", js.Array(value :_*))
      
      @scala.inline
      def setPasses(value: js.Array[Result]): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassesUndefined: Self = StObject.set(x, "passes", js.undefined)
      
      @scala.inline
      def setPassesVarargs(value: Result*): Self = StObject.set(x, "passes", js.Array(value :_*))
      
      @scala.inline
      def setTestEngine(value: TestEngine): Self = StObject.set(x, "testEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestEngineUndefined: Self = StObject.set(x, "testEngine", js.undefined)
      
      @scala.inline
      def setTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestEnvironmentUndefined: Self = StObject.set(x, "testEnvironment", js.undefined)
      
      @scala.inline
      def setTestRunner(value: TestRunner): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestRunnerUndefined: Self = StObject.set(x, "testRunner", js.undefined)
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setToolOptions(value: RunOptions): Self = StObject.set(x, "toolOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolOptionsUndefined: Self = StObject.set(x, "toolOptions", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setViolations(value: js.Array[Result]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViolationsUndefined: Self = StObject.set(x, "violations", js.undefined)
      
      @scala.inline
      def setViolationsVarargs(value: Result*): Self = StObject.set(x, "violations", js.Array(value :_*))
    }
  }
}
