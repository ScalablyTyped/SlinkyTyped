package typingsSlinky.agoraRtcSdk.mod

import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.h264_
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.live
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.rtc
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.vp8_
import typingsSlinky.agoraRtcSdk.anon.Forceturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class defining the properties of the `config` parameter in the {@link createClient} method.
  *
  * **Note:**
  *
  * - Ensure that you do not leave {@link mode} and {@link codec} as empty.
  * - Ensure that you set these properties before calling {@link Client.join}.
  *
  * [[include:ClientConfig-example.md]]
  * @example
  * **Sample code**
  * ``` javascript
  * var config = {
  *      mode: "live",
  *      codec: "vp8",
  *      proxyServer: "YOUR NGINX PROXY SERVER IP",
  *      turnServer: {
  *          turnServerURL: "YOUR TURNSERVER URL",
  *          username: "YOUR USERNAME",
  *          password: "YOUR PASSWORD",
  *          udpport: "THE UDP PORT YOU WANT TO ADD",
  *          tcpport: "THE TCP PORT YOU WANT TO ADD",
  *          forceturn: false
  *      }
  * }
  * var client = AgoraRTC.createClient(config);```
  */
@js.native
trait ClientConfig extends js.Object {
  /**
    * The codec the Web browser uses for encoding.
    * - `"vp8"`: Sets the browser to use VP8 for encoding.
    * - `"h264"`: Sets the browser to use H.264 for encoding.
    *
    * **Note:**
    *
    * - Safari 12.1 or earlier does not support the VP8 codec.
    * - Codec support on mobile devices is a bit complex, see [Use Agora Web SDK on Mobile Devices](https://docs.agora.io/en/faq/web_on_mobile) for details.
    */
  var codec: vp8_ | h264_ = js.native
  /**
    * The channel profile.
    *
    * Agora Web SDK needs to know the application scenario to apply different optimization methods.
    *
    * Currently Agora Web SDK supports the following channel profiles:
    * - `"live"`: Sets the channel profile as live broadcast. Host and audience roles that can be set by calling the [[Client.setClientRole]] method.
    * The host sends and receives voice/video, while the audience can only receive voice/video.
    * - `"rtc"`: Sets the channel profile as communication. This is used in one-on-one calls or group calls, where all users in the channel can talk freely.
    *
    * **Note:**
    *
    * If you need to communicate with Agora Native SDK, Agora recommends the following settings:
    * - For Native SDK v2.3.2 and later:
    *  * Set {@link mode} as `"rtc"` or `"live"` if the Native SDK uses the communication channel profile.
    *  * Set {@link mode} as `"live"` if the Native SDK uses the live broadcast channel profile.
    * - For Native SDK before v2.3.2, set mode as "live" regardless of which channel profile the Native SDK uses.
    *
    * **Note:**
    *
    * The `"rtc"` mode supports the Agora Recording SDK 2.3.3 or later.
    */
  var mode: live | rtc = js.native
  /**
    * Your Nginx server domain name.
    *
    * ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Enterprise users with a company firewall can use this property to pass signaling messages to the Agora SD-RTN through the Nginx Server.
    */
  var proxyServer: js.UndefOr[String] = js.native
  /**
    * TURN server settings.
    *
    * Enterprise users with a company firewall can use this property to pass audio and video data to the Agora SD-RTN through the TURN Server.
    */
  var turnServer: js.UndefOr[Forceturn] = js.native
}

object ClientConfig {
  @scala.inline
  def apply(codec: vp8_ | h264_, mode: live | rtc): ClientConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
  @scala.inline
  implicit class ClientConfigOps[Self <: ClientConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodec(value: vp8_ | h264_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: live | rtc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyServer")(js.undefined)
        ret
    }
    @scala.inline
    def withTurnServer(value: Forceturn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("turnServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTurnServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("turnServer")(js.undefined)
        ret
    }
  }
  
}

