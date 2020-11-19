package typingsSlinky.flightplan.FlightplanInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandResult extends js.Object {
  
  var code: Double = js.native
  
  var stderr: String = js.native
  
  var stdout: String = js.native
}
object CommandResult {
  
  @scala.inline
  def apply(code: Double, stderr: String, stdout: String): CommandResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandResult]
  }
  
  @scala.inline
  implicit class CommandResultOps[Self <: CommandResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: String): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: String): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
}
