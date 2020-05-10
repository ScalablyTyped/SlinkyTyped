package typingsSlinky.jupyterlabApplication.statusMod

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/status", "LabStatus")
@js.native
class LabStatus protected () extends ILabStatus {
  /**
    * Construct a new  status object.
    */
  def this(app: JupyterFrontEnd[IShell]) = this()
  var _busyCount: js.Any = js.native
  var _busySignal: js.Any = js.native
  var _dirtyCount: js.Any = js.native
  var _dirtySignal: js.Any = js.native
}

