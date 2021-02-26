package typingsSlinky.devtoolsProtocol.mod.Protocol.Network

import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadNetworkResourceRequest extends StObject {
  
  /**
    * Frame id to get the resource for.
    */
  var frameId: FrameId = js.native
  
  /**
    * Options for the request.
    */
  var options: LoadNetworkResourceOptions = js.native
  
  /**
    * URL of the resource to get content for.
    */
  var url: String = js.native
}
object LoadNetworkResourceRequest {
  
  @scala.inline
  def apply(frameId: FrameId, options: LoadNetworkResourceOptions, url: String): LoadNetworkResourceRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourceRequest]
  }
  
  @scala.inline
  implicit class LoadNetworkResourceRequestMutableBuilder[Self <: LoadNetworkResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: LoadNetworkResourceOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
