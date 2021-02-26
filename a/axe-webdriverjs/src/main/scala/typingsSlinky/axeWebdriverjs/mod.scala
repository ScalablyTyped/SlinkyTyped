package typingsSlinky.axeWebdriverjs

import typingsSlinky.axeCore.mod.Result
import typingsSlinky.axeCore.mod.RunOptions
import typingsSlinky.axeCore.mod.Spec
import typingsSlinky.seleniumWebdriver.mod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait AxeBuilder extends StObject {
    
    /**
      * Perform analysis and retrieve results.
      * @param callback   Function to execute when analysis completes.
      */
    def analyze(): js.Promise[AxeAnalysis] = js.native
    def analyze(callback: AnalyzeCallback): js.Promise[AxeAnalysis] = js.native
    def analyze(callback: DeprecatedAnalyzeCallback): js.Promise[AxeAnalysis] = js.native
    
    /**
      * Configures aXe before running analyze.
      *
      * @param config   aXe Configuration spec to use in analysis.
      */
    def configure(config: Spec): this.type = js.native
    
    /**
      * Set the list of rules to skip when running an analysis
      *
      * @param rules   Array of rule IDs, or a single rule ID as a string.
      */
    def disableRules(rules: String): this.type = js.native
    def disableRules(rules: js.Array[String]): this.type = js.native
    
    /**
      * Excludes a selector from analysis.
      *
      * @param selector   CSS selector of the element to exclude.
      */
    def exclude(selector: String): this.type = js.native
    
    /**
      * Includes a selector in analysis.
      *
      * @param selector   CSS selector of the element to include.
      */
    def include(selector: String): this.type = js.native
    
    /**
      * Options to directly pass to `axe.run`.
      *
      * @param options   aXe options object.
      * @remarks Will override any other configured options, including calls to `withRules` and `withTags`.
      * @see https://github.com/dequelabs/axe-core/issues/937
      */
    def options(options: RunOptions): this.type = js.native
    
    /**
      * Limits analysis to only the specified rules.
      *
      * @param rules   Array of rule IDs, or a single rule ID as a string.
      * @remarks Cannot be used with `withTags`.
      */
    def withRules(rules: String): this.type = js.native
    def withRules(rules: js.Array[String]): this.type = js.native
    
    /**
      * Limist analysis to only the specified tags.
      *
      * @param rules   Array of tags, or a single tag as a string.
      * @remarks Cannot be used with `withRules`.
      */
    def withTags(tags: String): this.type = js.native
    def withTags(tags: js.Array[String]): this.type = js.native
  }
  @JSImport("axe-webdriverjs", "AxeBuilder")
  @js.native
  def AxeBuilder(driver: WebDriver): AxeBuilder = js.native
  @JSImport("axe-webdriverjs", "AxeBuilder")
  @js.native
  def AxeBuilder(driver: WebDriver, source: js.UndefOr[scala.Nothing], builderOptions: BuilderOptions): AxeBuilder = js.native
  @JSImport("axe-webdriverjs", "AxeBuilder")
  @js.native
  def AxeBuilder(driver: WebDriver, source: String): AxeBuilder = js.native
  @JSImport("axe-webdriverjs", "AxeBuilder")
  @js.native
  def AxeBuilder(driver: WebDriver, source: String, builderOptions: BuilderOptions): AxeBuilder = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("axe-webdriverjs", "AxeBuilder")
  @js.native
  class AxeBuilderCls protected () extends AxeBuilder {
    def this(driver: WebDriver) = this()
    def this(driver: WebDriver, source: String) = this()
    def this(driver: WebDriver, source: js.UndefOr[scala.Nothing], builderOptions: BuilderOptions) = this()
    def this(driver: WebDriver, source: String, builderOptions: BuilderOptions) = this()
  }
  
  type AnalyzeCallback = js.Function2[/* err */ js.Error | Null, /* results */ AxeAnalysis, Unit]
  
  @js.native
  trait AxeAnalysis extends StObject {
    
    var inapplicable: js.Array[Result] = js.native
    
    var incomplete: js.Array[Result] = js.native
    
    var passes: js.Array[Result] = js.native
    
    var timestamp: String = js.native
    
    var url: String = js.native
    
    var violations: js.Array[Result] = js.native
  }
  object AxeAnalysis {
    
    @scala.inline
    def apply(
      inapplicable: js.Array[Result],
      incomplete: js.Array[Result],
      passes: js.Array[Result],
      timestamp: String,
      url: String,
      violations: js.Array[Result]
    ): AxeAnalysis = {
      val __obj = js.Dynamic.literal(inapplicable = inapplicable.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxeAnalysis]
    }
    
    @scala.inline
    implicit class AxeAnalysisMutableBuilder[Self <: AxeAnalysis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInapplicable(value: js.Array[Result]): Self = StObject.set(x, "inapplicable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInapplicableVarargs(value: Result*): Self = StObject.set(x, "inapplicable", js.Array(value :_*))
      
      @scala.inline
      def setIncomplete(value: js.Array[Result]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncompleteVarargs(value: Result*): Self = StObject.set(x, "incomplete", js.Array(value :_*))
      
      @scala.inline
      def setPasses(value: js.Array[Result]): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassesVarargs(value: Result*): Self = StObject.set(x, "passes", js.Array(value :_*))
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViolations(value: js.Array[Result]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViolationsVarargs(value: Result*): Self = StObject.set(x, "violations", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BuilderOptions extends StObject {
    
    /**
      * Should errors be printed into console
      * @default true
      */
    var logIframeErrors: js.UndefOr[Boolean] = js.native
  }
  object BuilderOptions {
    
    @scala.inline
    def apply(): BuilderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuilderOptions]
    }
    
    @scala.inline
    implicit class BuilderOptionsMutableBuilder[Self <: BuilderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogIframeErrors(value: Boolean): Self = StObject.set(x, "logIframeErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogIframeErrorsUndefined: Self = StObject.set(x, "logIframeErrors", js.undefined)
    }
  }
  
  type DeprecatedAnalyzeCallback = js.Function1[/* results */ AxeAnalysis, Unit]
}
