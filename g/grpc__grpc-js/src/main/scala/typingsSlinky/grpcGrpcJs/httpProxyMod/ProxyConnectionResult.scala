package typingsSlinky.grpcGrpcJs.httpProxyMod

import typingsSlinky.grpcGrpcJs.uriParserMod.GrpcUri
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyConnectionResult extends js.Object {
  var realTarget: js.UndefOr[GrpcUri] = js.undefined
  var socket: js.UndefOr[Socket] = js.undefined
}

object ProxyConnectionResult {
  @scala.inline
  def apply(realTarget: GrpcUri = null, socket: Socket = null): ProxyConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (realTarget != null) __obj.updateDynamic("realTarget")(realTarget.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConnectionResult]
  }
}

