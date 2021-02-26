package typingsSlinky.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastOutputOptionsRtmp extends StObject {
  
  var id: String = js.native
  
  var serverUrl: String = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var streamName: String = js.native
}
object BroadcastOutputOptionsRtmp {
  
  @scala.inline
  def apply(id: String, serverUrl: String, streamName: String): BroadcastOutputOptionsRtmp = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOutputOptionsRtmp]
  }
  
  @scala.inline
  implicit class BroadcastOutputOptionsRtmpMutableBuilder[Self <: BroadcastOutputOptionsRtmp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
  }
}
