package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromePerfLoggingPrefs extends js.Object {
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
  implicit class ChromePerfLoggingPrefsOps[Self <: ChromePerfLoggingPrefs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferUsageReportingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferUsageReportingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferUsageReportingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferUsageReportingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNetwork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePage")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceCategories(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceCategories")(js.undefined)
        ret
    }
  }
  
}

