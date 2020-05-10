package typingsSlinky.node.http2Mod

import typingsSlinky.node.nodeStrings.httpColon
import typingsSlinky.node.nodeStrings.httpsColon
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSessionOptions extends SessionOptions {
  @JSName("createConnection")
  var createConnection_ClientSessionOptions: js.UndefOr[js.Function2[/* authority */ URL_, /* option */ SessionOptions, Duplex]] = js.native
  var maxReservedRemoteStreams: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[httpColon | httpsColon] = js.native
}

object ClientSessionOptions {
  @scala.inline
  def apply(): ClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSessionOptions]
  }
  @scala.inline
  implicit class ClientSessionOptionsOps[Self <: ClientSessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateConnection(value: (/* authority */ URL_, /* option */ SessionOptions) => Duplex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createConnection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReservedRemoteStreams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReservedRemoteStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReservedRemoteStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReservedRemoteStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: httpColon | httpsColon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
  }
  
}

