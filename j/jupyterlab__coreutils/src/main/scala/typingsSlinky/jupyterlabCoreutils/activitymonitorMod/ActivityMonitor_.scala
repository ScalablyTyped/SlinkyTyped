package typingsSlinky.jupyterlabCoreutils.activitymonitorMod

import typingsSlinky.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IArguments
import typingsSlinky.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IOptions
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/activitymonitor", "ActivityMonitor")
@js.native
class ActivityMonitor_[Sender, Args] protected () extends IDisposable {
  /**
    * Construct a new activity monitor.
    */
  def this(options: IOptions[Sender, Args]) = this()
  var _activityStopped: js.Any = js.native
  var _args: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * A signal handler for the monitored signal.
    */
  var _onSignalFired: js.Any = js.native
  var _sender: js.Any = js.native
  var _timeout: js.Any = js.native
  var _timer: js.Any = js.native
  /**
    * A signal emitted when activity has ceased.
    */
  val activityStopped: ISignal[this.type, IArguments[Sender, Args]] = js.native
  /**
    * The timeout associated with the monitor, in milliseconds.
    */
  var timeout: Double = js.native
}

