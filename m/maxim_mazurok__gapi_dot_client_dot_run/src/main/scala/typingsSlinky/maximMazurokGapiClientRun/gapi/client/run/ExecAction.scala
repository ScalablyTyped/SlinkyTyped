package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecAction extends StObject {
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Command is the command line to execute inside the container, the working directory for the command
    * is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you
    * need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
    */
  var command: js.UndefOr[js.Array[String]] = js.native
}
object ExecAction {
  
  @scala.inline
  def apply(): ExecAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecAction]
  }
  
  @scala.inline
  implicit class ExecActionMutableBuilder[Self <: ExecAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
  }
}
