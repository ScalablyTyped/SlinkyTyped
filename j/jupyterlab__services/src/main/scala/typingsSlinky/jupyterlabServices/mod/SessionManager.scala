package typingsSlinky.jupyterlabServices.mod

import typingsSlinky.jupyterlabServices.sessionManagerMod.SessionManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "SessionManager")
@js.native
/**
  * Construct a new session manager.
  *
  * @param options - The default options for each session.
  */
class SessionManager ()
  extends typingsSlinky.jupyterlabServices.sessionMod.SessionManager {
  def this(options: IOptions) = this()
}

