package typingsSlinky.reactNativeWebrtc.mod

import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeWebrtc.reactNativeWebrtcStrings.contain
import typingsSlinky.reactNativeWebrtc.reactNativeWebrtcStrings.cover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCViewProps extends js.Object {
  var mirror: js.UndefOr[Boolean] = js.native
  var objectFit: js.UndefOr[contain | cover] = js.native
  var streamURL: String = js.native
  var style: js.UndefOr[ViewStyle] = js.native
  var zOrder: js.UndefOr[Double] = js.native
}

object RTCViewProps {
  @scala.inline
  def apply(streamURL: String): RTCViewProps = {
    val __obj = js.Dynamic.literal(streamURL = streamURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCViewProps]
  }
  @scala.inline
  implicit class RTCViewPropsOps[Self <: RTCViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectFit(value: contain | cover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withZOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrder")(js.undefined)
        ret
    }
  }
  
}

