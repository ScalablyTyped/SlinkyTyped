package typingsSlinky.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccepttlschannelid extends js.Object {
  /**
    * Determines if messages sent via `runtime.connect` or `runtime.sendMessage`
    * are allowed to set `runtime.MessageSender.tlsChannelId`.
    */
  var accept_tls_channel_id: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of extensions or apps that are allowed to connect.
    * If left empty or unspecified, no extensions or apps can connect.
    * The wildcard '*' will allow all extensions and apps to connect.
    */
  var id: js.Array[String] = js.native
  /**
    * The URL patterns for web pages that are allowed to connect.
    * This does not affect content scripts.
    * If left empty or unspecified, no web pages can connect.
    */
  var matches: js.Array[String] = js.native
}

object AnonAccepttlschannelid {
  @scala.inline
  def apply(id: js.Array[String], matches: js.Array[String]): AnonAccepttlschannelid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccepttlschannelid]
  }
  @scala.inline
  implicit class AnonAccepttlschannelidOps[Self <: AnonAccepttlschannelid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccept_tls_channel_id(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept_tls_channel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept_tls_channel_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept_tls_channel_id")(js.undefined)
        ret
    }
  }
  
}

