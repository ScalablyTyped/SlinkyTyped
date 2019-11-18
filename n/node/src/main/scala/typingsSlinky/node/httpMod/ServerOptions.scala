package typingsSlinky.node.httpMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, typingsSlinky.node.httpMod.IncomingMessage]] = js.undefined
  var ServerResponse: js.UndefOr[
    Instantiable1[/* req */ IncomingMessage, typingsSlinky.node.httpMod.ServerResponse]
  ] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    IncomingMessage: Instantiable1[/* socket */ Socket, IncomingMessage] = null,
    ServerResponse: Instantiable1[/* req */ IncomingMessage, ServerResponse] = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (IncomingMessage != null) __obj.updateDynamic("IncomingMessage")(IncomingMessage.asInstanceOf[js.Any])
    if (ServerResponse != null) __obj.updateDynamic("ServerResponse")(ServerResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

