package typingsSlinky.jupyterlabRunning.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabRunning.mod.IRunningSessions.IManager
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRunningSessionManagers extends js.Object {
  
  /**
    * Add a running item manager.
    *
    * @param manager - The running item manager.
    *
    */
  def add(manager: IManager): IDisposable = js.native
  
  /**
    * Return an array of managers.
    */
  def items(): js.Array[IManager] = js.native
}
@JSImport("@jupyterlab/running", "IRunningSessionManagers")
@js.native
object IRunningSessionManagers extends TopLevel[Token[IRunningSessionManagers]]
