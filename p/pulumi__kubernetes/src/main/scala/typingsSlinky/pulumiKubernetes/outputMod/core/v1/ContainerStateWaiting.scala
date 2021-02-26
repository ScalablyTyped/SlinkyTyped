package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateWaiting is a waiting state of a container.
  */
@js.native
trait ContainerStateWaiting extends StObject {
  
  /**
    * Message regarding why the container is not yet running.
    */
  var message: String = js.native
  
  /**
    * (brief) reason the container is not yet running.
    */
  var reason: String = js.native
}
object ContainerStateWaiting {
  
  @scala.inline
  def apply(message: String, reason: String): ContainerStateWaiting = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateWaiting]
  }
  
  @scala.inline
  implicit class ContainerStateWaitingMutableBuilder[Self <: ContainerStateWaiting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
