package typingsSlinky.jasmineNode

import typingsSlinky.jasmine.jasmine.Runner
import typingsSlinky.jasmineNode.anon.Consolidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  @js.native
  trait Env extends StObject {
    
    var defaultTimeoutInterval: Double = js.native
  }
  object Env {
    
    @scala.inline
    def apply(defaultTimeoutInterval: Double): Env = {
      val __obj = js.Dynamic.literal(defaultTimeoutInterval = defaultTimeoutInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[Env]
    }
    
    @scala.inline
    implicit class EnvMutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultTimeoutInterval(value: Double): Self = StObject.set(x, "defaultTimeoutInterval", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecuteSpecsOptions extends StObject {
    
    var growl: js.UndefOr[Boolean] = js.native
    
    var includeStackTrace: js.UndefOr[Boolean] = js.native
    
    var isVerbose: js.UndefOr[Boolean] = js.native
    
    var junitreport: js.UndefOr[Consolidate] = js.native
    
    var onComplete: js.UndefOr[js.Function1[/* runner */ Runner, Unit]] = js.native
    
    var regExpSpec: js.RegExp = js.native
    
    var showColors: js.UndefOr[Boolean] = js.native
    
    var specFolders: js.Array[String] = js.native
    
    var teamcity: js.UndefOr[String | Boolean] = js.native
    
    var useRequireJs: js.UndefOr[Boolean] = js.native
  }
  object ExecuteSpecsOptions {
    
    @scala.inline
    def apply(regExpSpec: js.RegExp, specFolders: js.Array[String]): ExecuteSpecsOptions = {
      val __obj = js.Dynamic.literal(regExpSpec = regExpSpec.asInstanceOf[js.Any], specFolders = specFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteSpecsOptions]
    }
    
    @scala.inline
    implicit class ExecuteSpecsOptionsMutableBuilder[Self <: ExecuteSpecsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrowl(value: Boolean): Self = StObject.set(x, "growl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrowlUndefined: Self = StObject.set(x, "growl", js.undefined)
      
      @scala.inline
      def setIncludeStackTrace(value: Boolean): Self = StObject.set(x, "includeStackTrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeStackTraceUndefined: Self = StObject.set(x, "includeStackTrace", js.undefined)
      
      @scala.inline
      def setIsVerbose(value: Boolean): Self = StObject.set(x, "isVerbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVerboseUndefined: Self = StObject.set(x, "isVerbose", js.undefined)
      
      @scala.inline
      def setJunitreport(value: Consolidate): Self = StObject.set(x, "junitreport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJunitreportUndefined: Self = StObject.set(x, "junitreport", js.undefined)
      
      @scala.inline
      def setOnComplete(value: /* runner */ Runner => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setRegExpSpec(value: js.RegExp): Self = StObject.set(x, "regExpSpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowColors(value: Boolean): Self = StObject.set(x, "showColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowColorsUndefined: Self = StObject.set(x, "showColors", js.undefined)
      
      @scala.inline
      def setSpecFolders(value: js.Array[String]): Self = StObject.set(x, "specFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecFoldersVarargs(value: String*): Self = StObject.set(x, "specFolders", js.Array(value :_*))
      
      @scala.inline
      def setTeamcity(value: String | Boolean): Self = StObject.set(x, "teamcity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamcityUndefined: Self = StObject.set(x, "teamcity", js.undefined)
      
      @scala.inline
      def setUseRequireJs(value: Boolean): Self = StObject.set(x, "useRequireJs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseRequireJsUndefined: Self = StObject.set(x, "useRequireJs", js.undefined)
    }
  }
  
  @js.native
  trait JasmineNode extends StObject {
    
    def executeSpecsInFolder(options: ExecuteSpecsOptions): Unit = js.native
    
    def loadHelpersInFolder(path: String, pattern: js.RegExp): Unit = js.native
  }
  object JasmineNode {
    
    @scala.inline
    def apply(
      executeSpecsInFolder: ExecuteSpecsOptions => Unit,
      loadHelpersInFolder: (String, js.RegExp) => Unit
    ): JasmineNode = {
      val __obj = js.Dynamic.literal(executeSpecsInFolder = js.Any.fromFunction1(executeSpecsInFolder), loadHelpersInFolder = js.Any.fromFunction2(loadHelpersInFolder))
      __obj.asInstanceOf[JasmineNode]
    }
    
    @scala.inline
    implicit class JasmineNodeMutableBuilder[Self <: JasmineNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecuteSpecsInFolder(value: ExecuteSpecsOptions => Unit): Self = StObject.set(x, "executeSpecsInFolder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadHelpersInFolder(value: (String, js.RegExp) => Unit): Self = StObject.set(x, "loadHelpersInFolder", js.Any.fromFunction2(value))
    }
  }
}
