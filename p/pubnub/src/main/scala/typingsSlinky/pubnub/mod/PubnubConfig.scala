package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.AnonFreeSocketKeepAliveTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubnubConfig extends js.Object {
  var authKey: js.UndefOr[String] = js.native
  var autoNetworkDetection: js.UndefOr[Boolean] = js.native
  var cipherKey: js.UndefOr[String] = js.native
  var heartbeatInterval: js.UndefOr[Double] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var keepAliveSettings: js.UndefOr[AnonFreeSocketKeepAliveTimeout] = js.native
  var listenToBrowserNetworkEvents: js.UndefOr[Boolean] = js.native
  var logVerbosity: js.UndefOr[Boolean] = js.native
  var origin: js.UndefOr[String] = js.native
  var presenceTimeout: js.UndefOr[Double] = js.native
  var publishKey: js.UndefOr[String] = js.native
  var requestMessageCountThreshold: js.UndefOr[Double] = js.native
  var restore: js.UndefOr[Boolean] = js.native
  var secretKey: js.UndefOr[String] = js.native
  var ssl: js.UndefOr[Boolean] = js.native
  var subscribeKey: String = js.native
  var suppressLeaveEvents: js.UndefOr[Boolean] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object PubnubConfig {
  @scala.inline
  def apply(subscribeKey: String): PubnubConfig = {
    val __obj = js.Dynamic.literal(subscribeKey = subscribeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubnubConfig]
  }
  @scala.inline
  implicit class PubnubConfigOps[Self <: PubnubConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscribeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoNetworkDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNetworkDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoNetworkDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNetworkDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withCipherKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCipherKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherKey")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveSettings(value: AnonFreeSocketKeepAliveTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withListenToBrowserNetworkEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenToBrowserNetworkEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListenToBrowserNetworkEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenToBrowserNetworkEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withLogVerbosity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logVerbosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogVerbosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logVerbosity")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPresenceTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresenceTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMessageCountThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMessageCountThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMessageCountThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMessageCountThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withRestore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressLeaveEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressLeaveEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressLeaveEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressLeaveEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

