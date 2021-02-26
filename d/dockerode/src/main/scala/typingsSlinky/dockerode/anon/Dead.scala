package typingsSlinky.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dead extends StObject {
  
  var Dead: Boolean = js.native
  
  var Error: String = js.native
  
  var ExitCode: Double = js.native
  
  var FinishedAt: String = js.native
  
  var Health: js.UndefOr[FailingStreak] = js.native
  
  var OOMKilled: Boolean = js.native
  
  var Paused: Boolean = js.native
  
  var Pid: Double = js.native
  
  var Restarting: Boolean = js.native
  
  var Running: Boolean = js.native
  
  var StartedAt: String = js.native
  
  var Status: String = js.native
}
object Dead {
  
  @scala.inline
  def apply(
    Dead: Boolean,
    Error: String,
    ExitCode: Double,
    FinishedAt: String,
    OOMKilled: Boolean,
    Paused: Boolean,
    Pid: Double,
    Restarting: Boolean,
    Running: Boolean,
    StartedAt: String,
    Status: String
  ): Dead = {
    val __obj = js.Dynamic.literal(Dead = Dead.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], ExitCode = ExitCode.asInstanceOf[js.Any], FinishedAt = FinishedAt.asInstanceOf[js.Any], OOMKilled = OOMKilled.asInstanceOf[js.Any], Paused = Paused.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], Restarting = Restarting.asInstanceOf[js.Any], Running = Running.asInstanceOf[js.Any], StartedAt = StartedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dead]
  }
  
  @scala.inline
  implicit class DeadMutableBuilder[Self <: Dead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDead(value: Boolean): Self = StObject.set(x, "Dead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "ExitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAt(value: String): Self = StObject.set(x, "FinishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealth(value: FailingStreak): Self = StObject.set(x, "Health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthUndefined: Self = StObject.set(x, "Health", js.undefined)
    
    @scala.inline
    def setOOMKilled(value: Boolean): Self = StObject.set(x, "OOMKilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "Paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestarting(value: Boolean): Self = StObject.set(x, "Restarting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: Boolean): Self = StObject.set(x, "Running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAt(value: String): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
