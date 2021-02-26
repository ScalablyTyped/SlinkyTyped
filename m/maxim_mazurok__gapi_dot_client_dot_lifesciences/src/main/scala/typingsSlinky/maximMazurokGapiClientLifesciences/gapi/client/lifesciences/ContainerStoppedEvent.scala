package typingsSlinky.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerStoppedEvent extends StObject {
  
  /** The numeric ID of the action that started this container. */
  var actionId: js.UndefOr[Double] = js.native
  
  /** The exit status of the container. */
  var exitStatus: js.UndefOr[Double] = js.native
  
  /**
    * The tail end of any content written to standard error by the container. If the content emits large amounts of debugging noise or contains sensitive information, you can prevent the
    * content from being printed by setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag. Note that only a small amount of the end of the stream is captured here. The entire stream is stored
    * in the `/google/logs` directory mounted into each action, and can be copied off the machine as described elsewhere.
    */
  var stderr: js.UndefOr[String] = js.native
}
object ContainerStoppedEvent {
  
  @scala.inline
  def apply(): ContainerStoppedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStoppedEvent]
  }
  
  @scala.inline
  implicit class ContainerStoppedEventMutableBuilder[Self <: ContainerStoppedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setExitStatus(value: Double): Self = StObject.set(x, "exitStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitStatusUndefined: Self = StObject.set(x, "exitStatus", js.undefined)
    
    @scala.inline
    def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
  }
}
