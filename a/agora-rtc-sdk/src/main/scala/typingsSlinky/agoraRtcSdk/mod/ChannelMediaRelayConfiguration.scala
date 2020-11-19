package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configurations of the media stream relay.
  *
  * **Since**
  * <br>&emsp;&emsp;&emsp;*3.0.0*
  *
  * Use this interface to set the media stream relay when calling {@link startChannelMediaRelay} or {@link updateChannelMediaRelay}.
  */
@js.native
trait ChannelMediaRelayConfiguration extends js.Object {
  
  /**
    * Removes the destination channel.
    *
    * @param channelName The name of the destination channel.
    * @example **Sample code**
    * ``` javascript
    * configuration.removeDestChannelInfo("cname")
    * ```
    */
  def removeDestChannelInfo(channelName: String): Unit = js.native
  
  /**
    * Sets the information of the destination channel.
    *
    * To relay a media stream across multiple channels, call this method as many times (to a maximum of four).
    *
    * @param channelName The name of the destination channel. Ensure that the value of this parameter is the same as the value of `channelName` in `destInfo`.
    * @param destInfo The information of the destination channel:
    *
    * - `channelName`: String, the channel name.
    * - `uid`: Number, the unique ID to identify the relay stream in the destination channel. A 32-bit unsigned integer with a value ranging from 0 to (2<sup>32</sup>-1). If you set it as `0`, the server assigns a random one. To avoid UID conflicts, this uid must be different from any other UIDs in the destination channel.
    * - `token`: String, the token generated with the above `channelName` and `uid`. Do not set this parameter if you have not enabled token.
    *
    * @example **Sample code**
    * ``` javascript
    * var configuration = new AgoraRTC.ChannelMediaRelayConfiguration();
    * configuration.setDestChannelInfo("cname", {
    *  channelName: "destChannel",
    *  uid: 123,
    *  token: "yourDestToken",
    * })
    * ```
    */
  def setDestChannelInfo(channelName: String, destInfo: js.Any): Unit = js.native
  
  /**
    * Sets the information of the source channel.
    *
    * @param srcInfo The information of the source channel:
    *
    * - `channelName`: String, the channel name.
    * - `uid`: Number, the unique ID to identify the relay stream in the source channel. A 32-bit unsigned integer with a value ranging from 0 to (2<sup>32</sup>-1). If you set it as `0`, the server assigns a random one. To avoid UID conflicts, this value must be different from the UID of the current host.
    * - `token`: String, the token generated with the above `channelName` and `uid`. Do not set this parameter if you have not enabled token.
    *
    * @example **Sample code**
    * ``` javascript
    * var configuration = new AgoraRTC.ChannelMediaRelayConfiguration();
    * configuration.setSrcChannelInfo({
    *  channelName: "srcChannel",
    *  uid: 123,
    *  token: "yourSrcToken",
    * })
    * ```
    */
  def setSrcChannelInfo(srcInfo: js.Any): Unit = js.native
}
object ChannelMediaRelayConfiguration {
  
  @scala.inline
  def apply(
    removeDestChannelInfo: String => Unit,
    setDestChannelInfo: (String, js.Any) => Unit,
    setSrcChannelInfo: js.Any => Unit
  ): ChannelMediaRelayConfiguration = {
    val __obj = js.Dynamic.literal(removeDestChannelInfo = js.Any.fromFunction1(removeDestChannelInfo), setDestChannelInfo = js.Any.fromFunction2(setDestChannelInfo), setSrcChannelInfo = js.Any.fromFunction1(setSrcChannelInfo))
    __obj.asInstanceOf[ChannelMediaRelayConfiguration]
  }
  
  @scala.inline
  implicit class ChannelMediaRelayConfigurationOps[Self <: ChannelMediaRelayConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRemoveDestChannelInfo(value: String => Unit): Self = this.set("removeDestChannelInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDestChannelInfo(value: (String, js.Any) => Unit): Self = this.set("setDestChannelInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSrcChannelInfo(value: js.Any => Unit): Self = this.set("setSrcChannelInfo", js.Any.fromFunction1(value))
  }
}
