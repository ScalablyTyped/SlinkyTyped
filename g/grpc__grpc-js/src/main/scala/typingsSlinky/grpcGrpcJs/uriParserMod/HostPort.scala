package typingsSlinky.grpcGrpcJs.uriParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostPort extends js.Object {
  var host: String
  var port: js.UndefOr[Double] = js.undefined
}

object HostPort {
  @scala.inline
  def apply(host: String, port: js.UndefOr[Double] = js.undefined): HostPort = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostPort]
  }
}

