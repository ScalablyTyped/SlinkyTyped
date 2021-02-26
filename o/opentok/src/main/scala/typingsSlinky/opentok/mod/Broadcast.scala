package typingsSlinky.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Broadcast extends StObject {
  
  var broadcastUrls: BroadcastUrlsResponse = js.native
  
  var id: String = js.native
  
  var status: String = js.native
}
object Broadcast {
  
  @scala.inline
  def apply(broadcastUrls: BroadcastUrlsResponse, id: String, status: String): Broadcast = {
    val __obj = js.Dynamic.literal(broadcastUrls = broadcastUrls.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcast]
  }
  
  @scala.inline
  implicit class BroadcastMutableBuilder[Self <: Broadcast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcastUrls(value: BroadcastUrlsResponse): Self = StObject.set(x, "broadcastUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
