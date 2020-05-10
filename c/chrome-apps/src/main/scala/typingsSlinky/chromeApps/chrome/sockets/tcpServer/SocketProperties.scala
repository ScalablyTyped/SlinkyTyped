package typingsSlinky.chromeApps.chrome.sockets.tcpServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.chrome.com/apps/sockets_tcpServer#type-SocketProperties
  */
@js.native
trait SocketProperties extends js.Object {
  /** An application-defined string associated with the socket. */
  var name: js.UndefOr[String] = js.native
  /**
    * Flag indicating if the socket remains open when the event page of the
    * application is unloaded. The default value is 'false.' When the
    * application is loaded, any sockets previously opened with
    * persistent=true can be fetched with getSockets.
    *
    * @see http://developer.chrome.com/apps/app_lifecycle.html
    */
  var persistent: js.UndefOr[Boolean] = js.native
}

object SocketProperties {
  @scala.inline
  def apply(): SocketProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketProperties]
  }
  @scala.inline
  implicit class SocketPropertiesOps[Self <: SocketProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(js.undefined)
        ret
    }
  }
  
}

