package typingsSlinky.googleDashGax.buildSrcGrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStubOptions extends js.Object {
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var servicePath: js.UndefOr[String] = js.undefined
  var sslCreds: js.UndefOr[js.Any] = js.undefined
}

object ClientStubOptions {
  @scala.inline
  def apply(
    port: Int | Double = null,
    protocol: String = null,
    servicePath: String = null,
    sslCreds: js.Any = null
  ): ClientStubOptions = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath.asInstanceOf[js.Any])
    if (sslCreds != null) __obj.updateDynamic("sslCreds")(sslCreds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientStubOptions]
  }
}

