package typingsSlinky.node.httpMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  var IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, typingsSlinky.node.httpMod.IncomingMessage]] = js.native
  var ServerResponse: js.UndefOr[
    Instantiable1[/* req */ IncomingMessage, typingsSlinky.node.httpMod.ServerResponse]
  ] = js.native
  /**
    * Use an insecure HTTP parser that accepts invalid HTTP headers when true.
    * Using the insecure parser should be avoided.
    * See --insecure-http-parser for more information.
    * @default false
    */
  var insecureHTTPParser: js.UndefOr[Boolean] = js.native
  /**
    * Optionally overrides the value of
    * [`--max-http-header-size`][] for requests received by this server, i.e.
    * the maximum length of request headers in bytes.
    * @default 8192
    */
  var maxHeaderSize: js.UndefOr[Double] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncomingMessage(value: Instantiable1[/* socket */ Socket, IncomingMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncomingMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withServerResponse(value: Instantiable1[/* req */ IncomingMessage, ServerResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecureHTTPParser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureHTTPParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecureHTTPParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureHTTPParser")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeaderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeaderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderSize")(js.undefined)
        ret
    }
  }
  
}

