package typingsSlinky.grpcGrpcJs.subchannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpcGrpcJs.subchannelMod.TcpSubchannelAddress
  - typingsSlinky.grpcGrpcJs.subchannelMod.IpcSubchannelAddress
*/
trait SubchannelAddress extends js.Object
object SubchannelAddress {
  
  @scala.inline
  def TcpSubchannelAddress(host: String, port: Double): SubchannelAddress = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubchannelAddress]
  }
  
  @scala.inline
  def IpcSubchannelAddress(path: String): SubchannelAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubchannelAddress]
  }
}
