package typingsSlinky.karmaMochaReporter

import typingsSlinky.karmaMochaReporter.karmaMochaReporterBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  /* Inlined {[ K in karma-mocha-reporter.karma.ReporterColor ]:? string} */
  @js.native
  trait ColorOptions extends StObject {
    
    var error: js.UndefOr[String] = js.native
    
    var info: js.UndefOr[String] = js.native
    
    var success: js.UndefOr[String] = js.native
    
    var warning: js.UndefOr[String] = js.native
  }
  object ColorOptions {
    
    @scala.inline
    def apply(): ColorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorOptions]
    }
    
    @scala.inline
    implicit class ColorOptionsMutableBuilder[Self <: ColorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * {@link https://github.com/litixsoft/karma-mocha-reporter#options}
      */
    var mochaReporter: js.UndefOr[MochaReporterOptions] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMochaReporter(value: MochaReporterOptions): Self = StObject.set(x, "mochaReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMochaReporterUndefined: Self = StObject.set(x, "mochaReporter", js.undefined)
    }
  }
  
  /**
    * Reporter options
    */
  @js.native
  trait MochaReporterOptions extends StObject {
    
    /**
      * Lets you overwrite the default colors.
      * Possible values are all colors and background colors from chalk.
      */
    var colors: js.UndefOr[ColorOptions] = js.native
    
    /** The string to output between multiple test runs. Set to false or empty string to disable */
    var divider: js.UndefOr[String | `false`] = js.native
    
    /**
      * When setting the ignoreSkipped flag to true, the reporter will ignore the skipped tests in the output
      * and you will see only the tests that where really executed.
      * The summary will still contain the number of skipped tests.
      */
    var ignoreSkipped: js.UndefOr[Boolean] = js.native
    
    /**
      * Lets you set the maximum number of lines which are printed for a failure.
      * The default value is 999. Helps to cut long stack traces. Set the value to -1 to disable stack traces.
      */
    var maxLogLines: js.UndefOr[Double] = js.native
    
    /**
      * output type printed to the console
      */
    var output: js.UndefOr[OutputOptions] = js.native
    
    /**
      * Prints the result of an it block after it is run in one browser.
      * This options is useful when you have tests which are conditionally run in one browser only.
      * Otherwise the result of the it block would not be printed because it was not run in all browsers.
      */
    var printFirstSuccess: js.UndefOr[Boolean] = js.native
    
    /**
      * Shows a diff output. Is disabled by default.
      * All credits to the contributors of mocha, since the diff logic is used from there and customized for this modul
      */
    var showDiff: js.UndefOr[ShowDiffOptions] = js.native
    
    /**
      * Lets you overwrite the default symbols.
      */
    var symbols: js.UndefOr[SymbolOptions] = js.native
  }
  object MochaReporterOptions {
    
    @scala.inline
    def apply(): MochaReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MochaReporterOptions]
    }
    
    @scala.inline
    implicit class MochaReporterOptionsMutableBuilder[Self <: MochaReporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: ColorOptions): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setDivider(value: String | `false`): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setIgnoreSkipped(value: Boolean): Self = StObject.set(x, "ignoreSkipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSkippedUndefined: Self = StObject.set(x, "ignoreSkipped", js.undefined)
      
      @scala.inline
      def setMaxLogLines(value: Double): Self = StObject.set(x, "maxLogLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLogLinesUndefined: Self = StObject.set(x, "maxLogLines", js.undefined)
      
      @scala.inline
      def setOutput(value: OutputOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPrintFirstSuccess(value: Boolean): Self = StObject.set(x, "printFirstSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintFirstSuccessUndefined: Self = StObject.set(x, "printFirstSuccess", js.undefined)
      
      @scala.inline
      def setShowDiff(value: ShowDiffOptions): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDiffUndefined: Self = StObject.set(x, "showDiff", js.undefined)
      
      @scala.inline
      def setSymbols(value: SymbolOptions): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.full
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.autowatch
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.minimal
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.noFailures
  */
  trait OutputOptions extends StObject
  object OutputOptions {
    
    @scala.inline
    def autowatch: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.autowatch = "autowatch".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.autowatch]
    
    @scala.inline
    def full: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.full = "full".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.full]
    
    @scala.inline
    def minimal: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.minimal = "minimal".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.minimal]
    
    @scala.inline
    def noFailures: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.noFailures = "noFailures".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.noFailures]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.success
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.info
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.warning
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.error
  */
  trait ReporterColor extends StObject
  object ReporterColor {
    
    @scala.inline
    def error: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.error = "error".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.error]
    
    @scala.inline
    def info: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.info = "info".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.info]
    
    @scala.inline
    def success: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.success = "success".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.success]
    
    @scala.inline
    def warning: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.warning = "warning".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterBooleans.`true`
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.unified
    - typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.`inline`
  */
  trait ShowDiffOptions extends StObject
  object ShowDiffOptions {
    
    @scala.inline
    def `inline`: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.`inline` = "inline".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.`inline`]
    
    @scala.inline
    def `true`: typingsSlinky.karmaMochaReporter.karmaMochaReporterBooleans.`true` = true.asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterBooleans.`true`]
    
    @scala.inline
    def unified: typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.unified = "unified".asInstanceOf[typingsSlinky.karmaMochaReporter.karmaMochaReporterStrings.unified]
  }
  
  /* Inlined {[ K in karma-mocha-reporter.karma.ReporterColor ]:? string} */
  @js.native
  trait SymbolOptions extends StObject {
    
    var error: js.UndefOr[String] = js.native
    
    var info: js.UndefOr[String] = js.native
    
    var success: js.UndefOr[String] = js.native
    
    var warning: js.UndefOr[String] = js.native
  }
  object SymbolOptions {
    
    @scala.inline
    def apply(): SymbolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymbolOptions]
    }
    
    @scala.inline
    implicit class SymbolOptionsMutableBuilder[Self <: SymbolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
}
