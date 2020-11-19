package typingsSlinky.devtoolsProtocol.mod.Protocol.Target

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteLocation extends js.Object {
  
  var host: String = js.native
  
  var port: integer = js.native
}
object RemoteLocation {
  
  @scala.inline
  def apply(host: String, port: integer): RemoteLocation = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteLocation]
  }
  
  @scala.inline
  implicit class RemoteLocationOps[Self <: RemoteLocation] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: integer): Self = this.set("port", value.asInstanceOf[js.Any])
  }
}
