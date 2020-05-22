package typingsSlinky.grpcGrpcJs.resolverDnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DnsUrl extends js.Object {
  var host: String
  var port: js.UndefOr[String] = js.undefined
}

object DnsUrl {
  @scala.inline
  def apply(host: String, port: String = null): DnsUrl = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsUrl]
  }
}

