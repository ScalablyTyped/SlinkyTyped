package typingsSlinky.karmaSummaryReporter

import typingsSlinky.karmaSummaryReporter.karmaSummaryReporterStrings.all
import typingsSlinky.karmaSummaryReporter.karmaSummaryReporterStrings.failed
import typingsSlinky.karmaSummaryReporter.karmaSummaryReporterStrings.skipped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * Show a table detailing the test results for all connected browsers at the end of a test run.
      * This gives a better overview which browsers are broken than the output of other reporters.
      * see {@link https://github.com/sth/karma-summary-reporter#config}
      */
    val summaryReporter: js.UndefOr[SummaryReporterConfig] = js.native
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
      def setSummaryReporter(value: SummaryReporterConfig): Self = StObject.set(x, "summaryReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryReporterUndefined: Self = StObject.set(x, "summaryReporter", js.undefined)
    }
  }
  
  @js.native
  trait SummaryReporterConfig extends StObject {
    
    /**
      * Shows a overview column in the results table, showing the total result of a test over all browsers
      * ("failed" if the test failed anywhere, ...)
      */
    var overviewColumn: js.UndefOr[Boolean] = js.native
    
    /**
      * Select which tests are displayed in the summary:
      * * 'failed': Only show tests that failed in some browser (default)
      * * 'skipped': Additionally show tests that got skipped in some browser
      * * 'all': Show all test, also ones that didn't fail specLength
      */
    var show: js.UndefOr[failed | skipped | all] = js.native
    
    /**
      * Space reserved to display the spec label (width of the first column in the results table).
      */
    var specLength: js.UndefOr[Double] = js.native
  }
  object SummaryReporterConfig {
    
    @scala.inline
    def apply(): SummaryReporterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryReporterConfig]
    }
    
    @scala.inline
    implicit class SummaryReporterConfigMutableBuilder[Self <: SummaryReporterConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverviewColumn(value: Boolean): Self = StObject.set(x, "overviewColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverviewColumnUndefined: Self = StObject.set(x, "overviewColumn", js.undefined)
      
      @scala.inline
      def setShow(value: failed | skipped | all): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSpecLength(value: Double): Self = StObject.set(x, "specLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecLengthUndefined: Self = StObject.set(x, "specLength", js.undefined)
    }
  }
}
