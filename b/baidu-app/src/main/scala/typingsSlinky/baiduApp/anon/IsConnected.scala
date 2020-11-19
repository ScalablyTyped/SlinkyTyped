package typingsSlinky.baiduApp.anon

import typingsSlinky.baiduApp.swan.networkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsConnected extends js.Object {
  
  var isConnected: Boolean = js.native
  
  var networkType: typingsSlinky.baiduApp.swan.networkType = js.native
}
object IsConnected {
  
  @scala.inline
  def apply(isConnected: Boolean, networkType: networkType): IsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsConnected]
  }
  
  @scala.inline
  implicit class IsConnectedOps[Self <: IsConnected] (val x: Self) extends AnyVal {
    
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
    def setIsConnected(value: Boolean): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: networkType): Self = this.set("networkType", value.asInstanceOf[js.Any])
  }
}
