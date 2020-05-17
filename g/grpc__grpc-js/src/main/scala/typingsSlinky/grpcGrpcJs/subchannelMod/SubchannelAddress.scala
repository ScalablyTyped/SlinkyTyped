package typingsSlinky.grpcGrpcJs.subchannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpcGrpcJs.subchannelMod.TcpSubchannelAddress
  - typingsSlinky.grpcGrpcJs.subchannelMod.IpcSubchannelAddress
*/
trait SubchannelAddress extends js.Object

object SubchannelAddress {
  @scala.inline
  implicit def apply(value: IpcSubchannelAddress): SubchannelAddress = value.asInstanceOf[SubchannelAddress]
  @scala.inline
  implicit def apply(value: TcpSubchannelAddress): SubchannelAddress = value.asInstanceOf[SubchannelAddress]
}

