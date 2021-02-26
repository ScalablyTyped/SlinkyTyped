package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.LoaderId
import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.MonotonicTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleEventEvent extends StObject {
  
  /**
    * Id of the frame.
    */
  var frameId: FrameId = js.native
  
  /**
    * Loader identifier. Empty string if the request is fetched from worker.
    */
  var loaderId: LoaderId = js.native
  
  var name: String = js.native
  
  var timestamp: MonotonicTime = js.native
}
object LifecycleEventEvent {
  
  @scala.inline
  def apply(frameId: FrameId, loaderId: LoaderId, name: String, timestamp: MonotonicTime): LifecycleEventEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleEventEvent]
  }
  
  @scala.inline
  implicit class LifecycleEventEventMutableBuilder[Self <: LifecycleEventEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
