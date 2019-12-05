package typingsSlinky.atJupyterlabRunning.atJupyterlabRunningMod

import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.ReactWidget
import typingsSlinky.atJupyterlabRunning.atJupyterlabRunningMod.RunningSessions.IOptions
import typingsSlinky.atJupyterlabServices.libSessionSessionMod.Session.IModel
import typingsSlinky.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/running", "RunningSessions")
@js.native
class RunningSessions_ protected () extends ReactWidget {
  /**
    * Construct a new running widget.
    */
  def this(options: IOptions) = this()
  var _sessionOpenRequested: js.Any = js.native
  var _terminalOpenRequested: js.Any = js.native
  var options: js.Any = js.native
  /**
    * A signal emitted when a kernel session open is requested.
    */
  val sessionOpenRequested: ISignal[this.type, IModel] = js.native
  /**
    * A signal emitted when a terminal session open is requested.
    */
  val terminalOpenRequested: ISignal[
    this.type, 
    typingsSlinky.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.IModel
  ] = js.native
}

