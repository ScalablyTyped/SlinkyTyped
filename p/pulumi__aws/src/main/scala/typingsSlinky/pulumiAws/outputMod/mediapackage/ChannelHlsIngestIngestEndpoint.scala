package typingsSlinky.pulumiAws.outputMod.mediapackage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelHlsIngestIngestEndpoint extends js.Object {
  /**
    * The password
    */
  var password: String = js.native
  /**
    * The URL
    */
  var url: String = js.native
  /**
    * The username
    */
  var username: String = js.native
}

object ChannelHlsIngestIngestEndpoint {
  @scala.inline
  def apply(password: String, url: String, username: String): ChannelHlsIngestIngestEndpoint = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHlsIngestIngestEndpoint]
  }
  @scala.inline
  implicit class ChannelHlsIngestIngestEndpointOps[Self <: ChannelHlsIngestIngestEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

