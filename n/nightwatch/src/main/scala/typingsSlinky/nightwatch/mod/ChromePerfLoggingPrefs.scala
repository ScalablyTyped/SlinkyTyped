package typingsSlinky.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromePerfLoggingPrefs extends StObject {
  
  /**
    * Default: 1000. The requested number of milliseconds between DevTools trace buffer usage events. For example, if 1000,
    * then once per second, DevTools will report how full the trace buffer is. If a report indicates the buffer usage is 100%,
    * a warning will be issued.
    */
  var bufferUsageReportingInterval: js.UndefOr[Double] = js.native
  
  /**
    * Default: true. Whether or not to collect events from Network domain.
    */
  var enableNetwork: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: true. Whether or not to collect events from Page domain.
    */
  var enablePage: js.UndefOr[Boolean] = js.native
  
  /**
    * A comma-separated string of Chrome tracing categories for which trace events should be collected.
    * An unspecified or empty string disables tracing.
    */
  var traceCategories: js.UndefOr[String] = js.native
}
object ChromePerfLoggingPrefs {
  
  @scala.inline
  def apply(): ChromePerfLoggingPrefs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromePerfLoggingPrefs]
  }
  
  @scala.inline
  implicit class ChromePerfLoggingPrefsMutableBuilder[Self <: ChromePerfLoggingPrefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferUsageReportingInterval(value: Double): Self = StObject.set(x, "bufferUsageReportingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUsageReportingIntervalUndefined: Self = StObject.set(x, "bufferUsageReportingInterval", js.undefined)
    
    @scala.inline
    def setEnableNetwork(value: Boolean): Self = StObject.set(x, "enableNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNetworkUndefined: Self = StObject.set(x, "enableNetwork", js.undefined)
    
    @scala.inline
    def setEnablePage(value: Boolean): Self = StObject.set(x, "enablePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePageUndefined: Self = StObject.set(x, "enablePage", js.undefined)
    
    @scala.inline
    def setTraceCategories(value: String): Self = StObject.set(x, "traceCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceCategoriesUndefined: Self = StObject.set(x, "traceCategories", js.undefined)
  }
}
