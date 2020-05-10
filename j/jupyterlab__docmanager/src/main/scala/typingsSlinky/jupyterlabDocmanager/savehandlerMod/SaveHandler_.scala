package typingsSlinky.jupyterlabDocmanager.savehandlerMod

import typingsSlinky.jupyterlabDocmanager.savehandlerMod.SaveHandler.IOptions
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/savehandler", "SaveHandler")
@js.native
class SaveHandler_ protected () extends IDisposable {
  /**
    * Construct a new save handler.
    */
  def this(options: IOptions) = this()
  var _autosaveTimer: js.Any = js.native
  var _context: js.Any = js.native
  var _inDialog: js.Any = js.native
  var _interval: js.Any = js.native
  var _isActive: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _minInterval: js.Any = js.native
  var _multiplier: js.Any = js.native
  /**
    * Handle an autosave timeout.
    */
  var _save: js.Any = js.native
  /**
    * Set the timer.
    */
  var _setTimer: js.Any = js.native
  /**
    * Get whether the handler is active.
    */
  val isActive: Boolean = js.native
  /**
    * The save interval used by the timer (in seconds).
    */
  var saveInterval: Double = js.native
  /**
    * Start the autosaver.
    */
  def start(): Unit = js.native
  /**
    * Stop the autosaver.
    */
  def stop(): Unit = js.native
}

