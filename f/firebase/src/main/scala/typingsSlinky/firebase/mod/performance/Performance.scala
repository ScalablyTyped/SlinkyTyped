package typingsSlinky.firebase.mod.performance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Performance extends js.Object {
  /**
    * Controls the logging of custom traces.
    */
  var dataCollectionEnabled: Boolean = js.native
  /**
    * Controls the logging of automatic traces and HTTP/S network monitoring.
    */
  var instrumentationEnabled: Boolean = js.native
  /**
    * Creates an uninitialized instance of {@link firebase.performance.Trace `trace`} and returns
    * it.
    *
    * @param traceName The name of the trace instance.
    * @return The Trace instance.
    */
  def trace(traceName: String): Trace = js.native
}

object Performance {
  @scala.inline
  def apply(dataCollectionEnabled: Boolean, instrumentationEnabled: Boolean, trace: String => Trace): Performance = {
    val __obj = js.Dynamic.literal(dataCollectionEnabled = dataCollectionEnabled.asInstanceOf[js.Any], instrumentationEnabled = instrumentationEnabled.asInstanceOf[js.Any], trace = js.Any.fromFunction1(trace))
    __obj.asInstanceOf[Performance]
  }
  @scala.inline
  implicit class PerformanceOps[Self <: Performance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataCollectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCollectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstrumentationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrace(value: String => Trace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

