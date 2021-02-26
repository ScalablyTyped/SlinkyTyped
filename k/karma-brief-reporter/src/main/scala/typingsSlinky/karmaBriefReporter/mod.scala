package typingsSlinky.karmaBriefReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait BriefReporterOptions extends StObject {
    
    /**
      * Print the test failures immediately instead of at the end
      * @default false
      */
    var earlyErrorReport: js.UndefOr[Boolean] = js.native
    
    /**
      * Omits stack frames from external dependencies like qunit,
      * jasmine or chai, which appear in stack traces of failed
      * tests and which are usually irrelevant to the tested code
      * @default false
      */
    var omitExternalStackFrames: js.UndefOr[Boolean] = js.native
    
    /**
      * Only render the graphic after all tests have finished.
      * This is ideal for using this reporter in a continuous integration environment
      * @default false
      */
    var renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Suppress the browser console log at the end of the test run
      * @default false
      */
    var suppressBrowserLogs: js.UndefOr[Boolean] = js.native
    
    /**
      * Suppress the red background on errors in the error
      * report at the end of the test run.
      * @default false
      */
    var suppressErrorHighlighting: js.UndefOr[Boolean] = js.native
    
    /**
      * Suppress the error report at the end of the test run
      * @default false
      */
    var suppressErrorReport: js.UndefOr[Boolean] = js.native
  }
  object BriefReporterOptions {
    
    @scala.inline
    def apply(): BriefReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefReporterOptions]
    }
    
    @scala.inline
    implicit class BriefReporterOptionsMutableBuilder[Self <: BriefReporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEarlyErrorReport(value: Boolean): Self = StObject.set(x, "earlyErrorReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEarlyErrorReportUndefined: Self = StObject.set(x, "earlyErrorReport", js.undefined)
      
      @scala.inline
      def setOmitExternalStackFrames(value: Boolean): Self = StObject.set(x, "omitExternalStackFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitExternalStackFramesUndefined: Self = StObject.set(x, "omitExternalStackFrames", js.undefined)
      
      @scala.inline
      def setRenderOnRunCompleteOnly(value: Boolean): Self = StObject.set(x, "renderOnRunCompleteOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderOnRunCompleteOnlyUndefined: Self = StObject.set(x, "renderOnRunCompleteOnly", js.undefined)
      
      @scala.inline
      def setSuppressBrowserLogs(value: Boolean): Self = StObject.set(x, "suppressBrowserLogs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressBrowserLogsUndefined: Self = StObject.set(x, "suppressBrowserLogs", js.undefined)
      
      @scala.inline
      def setSuppressErrorHighlighting(value: Boolean): Self = StObject.set(x, "suppressErrorHighlighting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrorHighlightingUndefined: Self = StObject.set(x, "suppressErrorHighlighting", js.undefined)
      
      @scala.inline
      def setSuppressErrorReport(value: Boolean): Self = StObject.set(x, "suppressErrorReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrorReportUndefined: Self = StObject.set(x, "suppressErrorReport", js.undefined)
    }
  }
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * Reports test progress statistics and lists failures at the end of a Karma test run.
      * {@link https://github.com/prantlf/karma-brief-reporter#options}
      */
    var briefReporter: js.UndefOr[BriefReporterOptions] = js.native
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
      def setBriefReporter(value: BriefReporterOptions): Self = StObject.set(x, "briefReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBriefReporterUndefined: Self = StObject.set(x, "briefReporter", js.undefined)
    }
  }
}
