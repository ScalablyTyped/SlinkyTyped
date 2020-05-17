package typingsSlinky.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  /**
    * Response timeout in milliseconds. Sets the maximum time allowed for the server to respond to an incoming request before giving up and responding with a Service Unavailable (503) error
    * response.
    */
  var server: js.UndefOr[Boolean | Double] = js.native
  /**
    * Default value: none (use node default of 2 minutes).
    * By default, node sockets automatically timeout after 2 minutes. Use this option to override this behavior. Set to false to disable socket timeouts.
    */
  var socket: js.UndefOr[Boolean | Double] = js.native
}

object Server {
  @scala.inline
  def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  @scala.inline
  implicit class ServerOps[Self <: Server] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServer(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
  }
  
}

